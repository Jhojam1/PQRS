import React, { useEffect, useState } from 'react';
import DataTable from 'react-data-table-component';
import axios from 'axios';
import './EdicionUsuario.css';
import { BackGraund } from '../../../../../componentes/BackGraund';
import { MenuAdmin } from '../../../../../componentes/Menu';
import { FaCheck } from 'react-icons/fa';

export const EdicionUsuario = () => {
    const [data, setData] = useState([]);
    const [selectedItem, setSelectedItem] = useState(null);
    const [personTypes, setPersonTypes] = useState([]);

    useEffect(() => {
        fetchData();
        fetchPersonTypes();
    }, []);

    const fetchData = async () => {
        try {
            const response = await axios.get('http://localhost:8080/api/person/get');
            setData(response.data);
            console.log(response.data);
        } catch (error) {
            console.error('Error en la data: ', error);
        }
    };

    const fetchPersonTypes = async () => {
        try {
            const response = await axios.get('http://localhost:8080/api/person_type/get');
            setPersonTypes(response.data);
        } catch (error) {
            console.error('Error al obtener tipos de persona: ', error);
        }
    };

    const handleRowClicked = (row) => {
        setSelectedItem(row);
    };

    const handleFormChange = (event) => {
        const { name, value } = event.target;
        setSelectedItem((prevState) => ({
            ...prevState,
            [name]: value,
        }));
    };

    const handleUpdate = async () => {
        if (selectedItem) {
            try {
                const updatedItem = {
                    ...selectedItem,
                    personType: personTypes.find(
                        (type) => type.namePersonType === selectedItem.personType
                    ),
                };
                await axios.put(`http://localhost:8080/api/person/update/${selectedItem.idPerson}`, updatedItem);
                fetchData(); // Vuelve a cargar los datos para reflejar los cambios
                alert('Datos actualizados correctamente');
            } catch (error) {
                console.error('Error actualizando los datos: ', error);
                alert('Error actualizando los datos');
            }
        }
    };


    const handleSelect = (row) => {
        setSelectedItem(row);
    };

    const columns = [
        {
            name: 'Acciones',
            cell: row => (
                <button
                    className={`check-button ${selectedItem && selectedItem.id === row.id ? 'selected' : ''}`}
                    onClick={() => handleSelect(row)}
                >
                    <FaCheck />
                </button>
            ),
        },
        {
            name: 'Nombre',
            selector: row => row.name,
        },
        {
            name: 'Apellido',
            selector: row => row.lastName,
        },
        {
            name: 'Tipo de Identificacion',
            selector: row => row.identificationType.nameIdentificationType,
        },
        {
            name: 'Identificacion',
            selector: row => row.identificationNumber,
        },
        {
            name: 'Correo',
            selector: row => row.email,
        },
        {
            name: 'Tipo de Persona',
            selector: row => row.personType.namePersonType,
        },

    ];

    return (
        <div className='EdicionUsuario'>
            <BackGraund />
            <MenuAdmin />
            <div className="container">
                <div className="gestion">
                    <DataTable
                        columns={columns}
                        data={data}
                        fixedHeader
                    />
                </div>
                <div className="dato">
                    <div className=""></div>
                    <div className="formu">
                        {selectedItem && (
                            <form className='form'>
                                <div className="input-box1">
                                    <label htmlFor="name">Nombre:</label><br />
                                    <input
                                        type="text"
                                        id="name"
                                        name="name"
                                        value={selectedItem.name}
                                        onChange={handleFormChange}
                                    />
                                </div> <br />
                                <div className="input-box1">
                                    <label htmlFor="lastName">Apellido:</label><br />
                                    <input
                                        type="text"
                                        id="lastName"
                                        name="lastName"
                                        value={selectedItem.lastName}
                                        onChange={handleFormChange}
                                    />
                                </div> <br />
                                <div className="input-box1">
                                    <label htmlFor="email">Correo:</label><br />
                                    <input
                                        type="email"
                                        id="email"
                                        name="email"
                                        value={selectedItem.email}
                                        onChange={handleFormChange}
                                    />
                                </div> <br />
                                <div className="input-box1">
                                    <label htmlFor="identificationNumber">Número:</label><br />
                                    <input
                                        type="text"
                                        id="identificationNumber"
                                        name="identificationNumber"
                                        value={selectedItem.identificationNumber}
                                        onChange={handleFormChange}
                                    />
                                </div> <br />
                                <div className="select-box1">
                                    <label htmlFor="personType">Tipo de Persona:</label><br />
                                    <select
                                        id="personType"
                                        name="personType"
                                        value={selectedItem.personType.namePersonType}
                                        onChange={handleFormChange}
                                    >
                                        <option value='Persona Natural'>Persona Natural</option>
                                        <option value='Persona Juridica'>Persona Juridica</option>
                                    </select>
                                </div> <br />
                                <button type="button" onClick={handleUpdate}>Actualizar</button>
                            </form>
                        )}
                    </div>
                    <div className=""></div>
                </div>
            </div>
        </div>
    );
};