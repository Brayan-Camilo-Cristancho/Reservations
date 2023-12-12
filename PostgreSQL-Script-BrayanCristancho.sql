
--SCRIPT DDL
CREATE TABLE Cliente
(
    Id              serial,
    Num_ident       varchar(15),
    Nombres         VARCHAR(50),
    Apellidos       VARCHAR(50),
    Edad            int,
    Correo          VARCHAR(80),
    Pais_residencia VARCHAR(30),
    Telefono        VARCHAR(15),
    Direcion       VARCHAR(100),
    Sexo            VARCHAR(1),
    PRIMARY KEY (id)
);

CREATE TABLE Tiquete
(
    Codigo        serial,
    Fecha_emision Date,
    PRIMARY key (codigo)
);




CREATE TABLE Cobro
(
    Id              serial,
    Tiq_cob         INT,
    Categoria       VARCHAR(10),
    Costo_adicional FLOAT,
    Costo_viaje     FLOAT,
    PRIMARY KEY (Id),
    CONSTRAINT cobro_Tiq_cob_fk FOREIGN KEY (Tiq_cob)
        REFERENCES Tiquete (Codigo)

);

CREATE TABLE Vuelo
(
    Codigo            VARCHAR(6),
    Nombre_Empresa_Av VARCHAR(20),
    Numero_vuelo      int,
    Fecha_vuelo       DATE,
    PRIMARY KEY (Codigo)
);

CREATE table Trayecto
(
    Vul_tray VARCHAR(7),
    Tiq_tray int,
    Origen   VARCHAR(50),
    Destino  VARCHAR(50),
    CONSTRAINT trayecto_pk PRIMARY KEY (Vul_tray, Tiq_tray),
    CONSTRAINT trayecto_vul_tray_fk FOREIGN KEY (Vul_tray)
        REFERENCES Vuelo (Codigo),
    CONSTRAINT trayecto_tiq_tray_fk FOREIGN KEY (Tiq_tray)
        REFERENCES Tiquete (Codigo)
);

CREATE table Reserva
(
    Id_res        serial,
    Fecha_reserva DATE,
    Cli_res       int,
    Tiq_res       int,
    PRIMARY key (Id_Res),
    CONSTRAINT reserva_Cli_res_fk FOREIGN KEY (Cli_res)
        REFERENCES cliente (ID),
    CONSTRAINT trayecto_Tiq_res_fk FOREIGN KEY (Tiq_res)
        REFERENCES Tiquete (Codigo)
);

--SCRIPT DML

INSERT INTO cliente (num_ident, nombres, apellidos, edad, correo, pais_residencia, telefono, direcion, sexo)
VALUES (2888323989, 'Esteban Camilo', 'SUarez Gomez', 34, 'Esteban@gmail.com', 'Colombia', 8945676789,
        'Calle 10 # 5-51', 'M');

INSERT INTO cliente (num_ident, nombres, apellidos, edad, correo, pais_residencia, telefono, direcion, sexo)
VALUES (6777834789, 'ADRIANA CAROLINA', 'HERNANDEZ MONTERROZA', 44, 'Adriana@gmail.com', 'Argentina', 87678978363, 'Avenida 19 No. 98-03, sexto piso,
Edificio Torre 100', 'F');

INSERT INTO cliente (num_ident, nombres, apellidos, edad, correo, pais_residencia, telefono, direcion, sexo)
VALUES (8777162373, 'ANDREA LILIANA', 'CRUZ GARCIA', 27, 'Andrea@gmail.com', 'Ecuador', 6567876878,
        'Calle 53 No 10-60/46', 'F');

INSERT INTO cliente (num_ident, nombres, apellidos, edad, correo, pais_residencia, telefono, direcion, sexo)
VALUES (1999232890, 'CAMILO ALBERTO', 'GOMEZ RODRIGUEZ', 45, 'Camilo@gmail.com', 'Colombia', 6787678989,
        'Calle 10 # 5-51', 'M');

INSERT INTO cliente (num_ident, nombres, apellidos, edad, correo, pais_residencia, telefono, direcion, sexo)
VALUES (2999121393, 'CAROL RUCHINA', 'GOMEZ GIANINE ', 25, 'Carol@gmail.com', 'Argentina', 2565678978,
        'Calle 9 # 9 – 62, Leticia, Barrio Centro', 'F');

INSERT INTO Tiquete (Fecha_emision)
VALUES ('2020-02-28');

INSERT INTO Tiquete (Fecha_emision)
VALUES ('2020-05-10');

INSERT INTO Tiquete (Fecha_emision)
VALUES ('2020-06-23');

INSERT INTO Tiquete (Fecha_emision)
VALUES ('2020-10-30');

INSERT INTO Tiquete (Fecha_emision)
VALUES ('2020-12-20');

INSERT INTO Cobro (Tiq_cob, Categoria, Costo_adicional, Costo_viaje)
VALUES (1, 'Turistas', 500000, 2500000);

INSERT INTO Cobro (Tiq_cob,Categoria, Costo_adicional, Costo_viaje)
VALUES (2, 'Negocios', 1000000, 4000000);

INSERT INTO Cobro (Tiq_cob,Categoria, Costo_adicional, Costo_viaje)
VALUES (3, 'Turistas', 500000, 400000);

INSERT INTO Cobro (Tiq_cob,Categoria, Costo_adicional, Costo_viaje)
VALUES (4, 'Negocios', 1000000, 500000);

INSERT INTO Cobro (Tiq_cob,Categoria, Costo_adicional, Costo_viaje)
VALUES (5, 'Turistas', 500000, 4500000);

INSERT INTO Vuelo(Codigo,Nombre_Empresa_Av, Numero_vuelo, Fecha_vuelo)
VALUES ('AV-345','AVIANCA',345,'2020-03-28');

INSERT INTO Vuelo(Codigo,Nombre_Empresa_Av, Numero_vuelo, Fecha_vuelo)
VALUES ('CO-674','COPA AIRLINES',674,'2020-06-28');

INSERT INTO Vuelo(Codigo,Nombre_Empresa_Av, Numero_vuelo, Fecha_vuelo)
VALUES ('VI-853','VIVA AIR',853,'2020-07-28');

INSERT INTO Vuelo(Codigo,Nombre_Empresa_Av, Numero_vuelo, Fecha_vuelo)
VALUES ('EA-637','EASY FLY',637,'2020-11-28');

INSERT INTO Vuelo(Codigo,Nombre_Empresa_Av, Numero_vuelo, Fecha_vuelo)
VALUES ('SK-636','SKYSCANNER',636,'2021-01-28');

INSERT INTO trayecto(Vul_tray, Tiq_tray, Origen, Destino)
VALUES ('AV-345',1,'Colombia','Argentina');

INSERT INTO trayecto(Vul_tray, Tiq_tray, Origen, Destino)
VALUES ('CO-674',2,'Colombia','Mexico');

INSERT INTO trayecto(Vul_tray, Tiq_tray, Origen, Destino)
VALUES ('VI-853',3,'Ecuador','Guatemala');

INSERT INTO trayecto(Vul_tray, Tiq_tray, Origen, Destino)
VALUES ('EA-637',4,'Uruguay','Colombia');

INSERT INTO trayecto(Vul_tray, Tiq_tray, Origen, Destino)
VALUES ('SK-636',5,'Colombia','Brazil');

INSERT INTO reserva(Fecha_reserva, Cli_res, Tiq_res)
VALUES ('2020-01-28',1,1);

INSERT INTO reserva(Fecha_reserva, Cli_res, Tiq_res)
VALUES ('2020-04-10',2,2);

INSERT INTO reserva(Fecha_reserva, Cli_res, Tiq_res)
VALUES ('2020-05-23',3,3);

INSERT INTO reserva(Fecha_reserva, Cli_res, Tiq_res)
VALUES ('2020-09-30',4,4);

INSERT INTO reserva(Fecha_reserva, Cli_res, Tiq_res)
VALUES ('2020-12-20',5,5);

