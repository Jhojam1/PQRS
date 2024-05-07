-- Insertar datos en la tabla Roles
INSERT INTO Roles (ID_Rol, Nombre_Rol) VALUES (1, 'Ciudadano');
INSERT INTO Roles (ID_Rol, Nombre_Rol) VALUES (2, 'Administrador');
INSERT INTO Roles (ID_Rol, Nombre_Rol) VALUES (3, 'Funcionario');

-- Insertar datos en la tabla Tipos_Identificacion
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('Cédula de Ciudadanía');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('Tarjeta de Identidad');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('Pasaporte');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('Cédula de Extranjería');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('Documento Nacional de Identidad');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('NIE (Número de Identificación de Extranjero)');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('RUT (Rol Único Tributario)');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('DNI (Documento Nacional de Identidad)');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('CI (Cédula de Identidad)');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('DNIe (Documento Nacional de Identidad Electrónico)');

-- Insertar datos en la tabla Tipos_Usuarios
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Admin');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Estudiante');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Profesor');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Invitado');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Tutor');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Personal Administrativo');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Becario');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Investigador');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Alumno en Prácticas');
INSERT INTO Tipos_Usuarios (Nombre_Tipo_Identificacion) VALUES ('Visitante');

-- Insertar datos en la tabla Personas
INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Juan', 'Pérez', 'juan@example.com', 1, 123456789);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('María', 'Gómez', 'maria@example.com', 2, 987654321);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Carlos', 'Martínez', 'carlos@example.com', 3, 123123123);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Ana', 'López', 'ana@example.com', 1, 456456456);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Luis', 'Rodríguez', 'luis@example.com', 2, 789789789);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Laura', 'García', 'laura@example.com', 3, 1010101010);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Pedro', 'Sánchez', 'pedro@example.com', 1, 1111111111);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Sofía', 'Fernández', 'sofia@example.com', 2, 2222222222);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Andrea', 'Díaz', 'andrea@example.com', 3, 3333333333);

INSERT INTO Personas (Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona)
VALUES ('Daniel', 'López', 'daniel@example.com', 1, 4444444444);

-- Insertar datos en la tabla Usuarios
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Tipo_Usuario, ID_Rol) VALUES ('usuario1', 'contraseña1', 1, 1, 1);
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Tipo_Usuario, ID_Rol) VALUES ('usuario2', 'contraseña2', 2, 2, 2);
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Tipo_Usuario, ID_Rol) VALUES ('usuario3', 'contraseña3', 3, 3, 3);
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Tipo_Usuario, ID_Rol) VALUES ('usuario4', 'contraseña4', 4, 1, 1);
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Tipo_Usuario, ID_Rol) VALUES ('usuario5', 'contraseña5', 5, 2, 2);
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Tipo_Usuario, ID_Rol) VALUES ('usuario6', 'contraseña6', 6, 3, 3);
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Tipo_Usuario, ID_Rol) VALUES ('usuario7', 'contraseña7', 7, 1, 1);