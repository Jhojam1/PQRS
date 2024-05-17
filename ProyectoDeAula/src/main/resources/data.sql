-- Insertar datos en la tabla Roles
INSERT INTO Roles (Nombre_Rol) VALUES ('Admin');
INSERT INTO Roles (Nombre_Rol) VALUES ('Usuario');

-- Insertar datos en la tabla Tipos_Identificacion
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('Cédula de ciudadanía');
INSERT INTO Tipos_Identificacion (Nombre_Tipo_Identificacion) VALUES ('Tarjeta de identidad');

-- Insertar datos en la tabla Tipos_Persona
INSERT INTO Tipos_Persona (Nombre_Tipo_Persona) VALUES ('Persona Natural');
INSERT INTO Tipos_Persona (Nombre_Tipo_Persona) VALUES ('Persona Juridica');

--Insertar datos en la tabla Tipo_Solicitud
INSERT INTO tipos_solicitud (nombre_tipo_solicitud) values ('Peticion');
INSERT INTO tipos_solicitud (nombre_tipo_solicitud) values ('Queja');
INSERT INTO tipos_solicitud (nombre_tipo_solicitud) values ('Reclamo');
INSERT INTO tipos_solicitud (nombre_tipo_solicitud) values ('Sugerencia');

--Insertar Datos en la tabla Dependencia
INSERT INTO dependencias (nombre_dependencia) values ('Salud');

--Insertar Datos en la tabla Categorias
INSERT INTO categorias (id_dependencia, nombre_categoria) values (1,'mal gestion');
-- Insertar datos en la tabla Personas
INSERT INTO Personas (ID_Tipo_Persona,Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona) VALUES (1, 'Juan', 'Pérez', 'juan@example.com', 1, 123456789);
INSERT INTO Personas (ID_Tipo_Persona, Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona) VALUES (2, 'María', 'López', 'maria@example.com', 2, 987654321);
INSERT INTO Personas (ID_Tipo_Persona, Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona) VALUES (1, 'Ana', 'García', 'ana@example.com', 1, 987654321);
INSERT INTO Personas (ID_Tipo_Persona, Nombre_Persona, Apellido_Persona, Correo_Persona, ID_Tipo_Identificacion, Numero_Identificacion_Persona) VALUES (2, 'Pedro', 'Martínez', 'pedro@example.com', 2, 123456789);

-- Insertar datos en la tabla Usuarios
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Rol, Estado_Usuario) VALUES ('juan', 'contraseña123', 1, 1,'Activo');
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Rol , Estado_Usuario) VALUES ('maria', 'qwerty456', 2, 2,'Activo');
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Rol, Estado_Usuario) VALUES ('ana', 'clave123', 3, 2,'Activo');
INSERT INTO Usuarios (Usuario, Contraseña, ID_Persona, ID_Rol, Estado_Usuario) VALUES ('pedro', 'abc456', 4, 1,'Activo');

