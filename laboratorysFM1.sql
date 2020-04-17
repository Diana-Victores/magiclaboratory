CREATE DATABASE laboratorysFM1;
USE laboratorysFM1;

CREATE TABLE clientes
(
ID varchar (20),
CodigoNombre varchar (30),
CodigoContrasenia varchar (30)
) ENGINE=InnoDB; 

use laboratorysFM1;
select * from clientes;

insert into clientes (Id,CodigoNombre,CodigoContrasenia)  values ('1', 'Selena', '487');



use laboratorysFM1;
create table registroclientes
(
ID  int (15) auto_increment primary key,
CodigoNombre varchar (30),
CodigoApellido varchar (30),
Edad varchar (5),
CodigoCorreo varchar (50),
CodigoDireccion varchar (30),
CodigoTelefono varchar (30)
) ENGINE=InnoDB;

use laboratorysFM1;
select * from registroclientes;

insert into registroclientes (ID,CodigoNombre,CodigoApellido,Edad,CodigoCorreo,CodigoDireccion,CodigoTelefono)  values ( '1','Selena','gomez','25' 'selenag@gmail.com','Zona15','78952310');



	

use laboratorysFM1;
create table registroproducto
(
ID  int (15) auto_increment primary key,
NombrePelicula varchar (40),
CodigoClasificacion varchar (40),
CodigoValor varchar (10)
) ENGINE=InnoDB;

insert into registroproducto (ID,NombrePelicula,CodigoClasificacion,CodigoValor)  values ( '1','El ritmo de la venganza', 'Accion','80');

use laboratorysFM1;
select * from registroproducto;