import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { BackGraund } from '../../../componentes/BackGraund';

export const Registro = () => {
    const [formData, setFormData] = useState({
        nombre: '',
        apellido: '',
        correo: '',
        numero: '',
        usuario: '',
        contraseña: '',
        confirmarContraseña: '',
        tipoIdentificacion: '',
        identificacion: '',
        tipoPersona: '',
    });

    const [identificationTypes, setIdentificationTypes] = useState([]);
    const [personTypes, setPersonTypes] = useState([]);

    useEffect(() => {
        const fetchIdentificationTypes = async () => {
            try {
                const response = await axios.get('http://localhost:8080/api/identification_type/get');
                console.log('Tipos de identificación obtenidos:', response.data);
                setIdentificationTypes(response.data);
            } catch (error) {
                console.error('Error al obtener tipos de identificación de la base de datos', error);
            }
        };

        const fetchPersonTypes = async () => {
            try {
                const response = await axios.get('http://localhost:8080/api/person_type/get');
                console.log('Tipos de persona obtenidos:', response.data);
                setPersonTypes(response.data);
            } catch (error) {
                console.error('Error al obtener tipos de persona de la base de datos', error);
            }
        };

        fetchIdentificationTypes();
        fetchPersonTypes();
    }, []);

    const handleChange = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value,
        });
    };

    const handleReset = () => {
        setFormData({
            nombre: '',
            apellido: '',
            correo: '',
            numero: '',
            usuario: '',
            contraseña: '',
            confirmarContraseña: '',
            tipoIdentificacion: '',
            identificacion: '',
            tipoPersona: '',
        });
    }


    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            console.log('Datos del formulario a enviar:', formData);

            const selectedIdentificationType = identificationTypes.find(type => type.idIdentificationType === parseInt(formData.tipoIdentificacion));
            const selectedPersonType = personTypes.find(type => type.idPersonType === parseInt(formData.tipoPersona));

            if (formData.contraseña === formData.confirmarContraseña) {
            const requestData = {
                personType: { idPersonType: selectedPersonType.idPersonType },
                name: formData.nombre,
                lastName: formData.apellido,
                email: formData.correo,
                identificationType: { idIdentificationType: selectedIdentificationType.idIdentificationType }, // Enviar el objeto completo
                identificationNumber: formData.identificacion,
            };

            const personResponse = await axios.post('http://localhost:8080/api/person/save', requestData);
            console.log('Respuesta al guardar persona:', personResponse.data);
            const personId = personResponse.data.idPerson;

            const roleData = { id: 2 }; // Objeto del rol
            const estadoUsuario = 'Activo';
            const userResponse = await axios.post('http://localhost:8080/api/user/save', {
                user: formData.usuario,
                password: formData.contraseña,
                person: { idPerson: personId }, 
                role: roleData, 
                stateUser: estadoUsuario,
            });
            console.log('Respuesta al guardar usuario:', userResponse.data);
            console.log('Usuario registrado correctamente');
            alert('Usuario Registrado Correctamente');
        } else {
            alert('Contraseñas no coinciden')
        }

        } catch (error) {
            console.error('Error al guardar información en la base de datos', error);
        }
        handleReset();
    };

    return (
        <div className="crearUsuario">
            <BackGraund/>
            <div className="fr"><div className=""></div>
                <div className="formu">
                    <h1>Registro</h1>
                    <label htmlFor="">¿No tienes una cuenta? Regístrate</label>
                    <form className='formPQRS' onSubmit={handleSubmit}>
                        <div className="input-box1">
                            <label htmlFor="nombre">Nombre:</label><br />
                            <input
                                type="text"
                                id="nombre"
                                name="nombre"
                                value={formData.nombre}
                                onChange={handleChange} required
                            />
                        </div> <br />
                        <div className="input-box1">
                            <label htmlFor="apellido">Apellido:</label><br />
                            <input
                                type="text"
                                id="apellido"
                                name="apellido"
                                value={formData.apellido}
                                onChange={handleChange} required
                            />
                        </div> <br />
                        <div className="input-box1">
                            <label htmlFor="correo">Correo:</label><br />
                            <input
                                type="email"
                                id="correo"
                                name="correo"
                                value={formData.correo}
                                onChange={handleChange} required
                            />
                        </div> <br />
                        <div className="input-box1">
                            <label htmlFor="numero">Número:</label><br />
                            <input
                                type="text"
                                id="numero"
                                name="numero"
                                value={formData.numero}
                                onChange={handleChange}  required
                            />
                        </div> <br />
                        <div className="input-box1">
                            <label htmlFor="usuario">Usuario:</label><br />
                            <input
                                type="text"
                                id="usuario"
                                name="usuario"
                                value={formData.usuario}
                                onChange={handleChange} required
                            />
                        </div> <br />
                        <div className="input-box1">
                            <label htmlFor="contraseña">Contraseña:</label><br />
                            <input
                                type="password"
                                id="contraseña"
                                name="contraseña"
                                value={formData.contraseña}
                                onChange={handleChange} required
                            />
                        </div> <br />
                        <div className="input-box1">
                            <label htmlFor="confirmarContraseña">Confirmar Contraseña:</label><br />
                            <input
                                type="password"
                                id="confirmarContraseña"
                                name="confirmarContraseña"
                                value={formData.confirmarContraseña}
                                onChange={handleChange}  required
                            />
                        </div> <br />
                        <div className="select-box1">
                            <label htmlFor="tipoPersona">Tipo de Persona:</label><br />
                            <select
                                id="tipoPersona"
                                name="tipoPersona"
                                value={formData.tipoPersona}
                                onChange={handleChange} required
                            >
                                <option key="" value="">Seleccione el tipo</option>
                                {personTypes.map((type) => (
                                    <option key={type.idPersonType} value={type.idPersonType}>
                                        {type.namePersonType}
                                    </option>
                                ))}
                            </select>
                        </div> <br />
                        <div className="select-box1">
                            <label htmlFor="tipoIdentificacion">Tipo de Identificación:</label><br />
                            <select
                                id="tipoIdentificacion"
                                name="tipoIdentificacion"
                                value={formData.tipoIdentificacion}
                                onChange={handleChange} required
                            >
                                <option key="" value="">Seleccione Tipo de Identificación</option>
                                {identificationTypes.map((type) => (
                                    <option key={type.idIdentificationType} value={type.idIdentificationType}>
                                        {type.nameIdentificationType}
                                    </option>
                                ))}
                            </select>
                        </div> <br />
                        <div className="input-box1">
                            <label htmlFor="identificacion">Identificación:</label><br />
                            <input
                                type="text"
                                id="identificacion"
                                name="identificacion"
                                value={formData.identificacion}
                                onChange={handleChange} required
                            />
                        </div><br />
                        <div className="btnIniciarSesion">
                            <button type="submit">Registrar</button>
                        </div><br />
                    </form>
                    <p>¿Ya tienes cuenta? <a href="/Login">Inicia Sesión</a></p>
                </div><div className=""></div>
            </div>
        </div>
    );
};