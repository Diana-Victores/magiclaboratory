CREATE DATABASE laboratory;
USE laboratory;

CREATE TABLE clientes
(
ID varchar (20),
CodigoNombre varchar (30),
CodigoContrasenia varchar (30)
) ENGINE=InnoDB; 

use laboraty;
select * from clientes;

insert into clientes (Id,CodigoNombre,CodigoContrasenia)  values ('1', 'Selena', '487');



use laboratory;
create table registrocliente
(
CodigoNombre varchar (30),
CodigoCorreo varchar (50),
CodigoDireccion varchar (30),
CodigoTelefono varchar (30)
) ENGINE=InnoDB;

use laboratory;
select * from registrocliente;

insert into registrocliente (CodigoNombre,CodigoCorreo,CodigoDireccion,CodigoTelefono)  values ( 'Selena', 'selenag@gmail.com','Zona15','78952310');

use laboratory;
create table registroproducto
(
ID varchar (30),
NombrePelicula varchar (40),
CodigoClasificacion varchar (40),
CodigoValor varchar (10)
) ENGINE=InnoDB;

insert into registroproducto (ID,NombrePelicula,CodigoClasificacion,CodigoValor)  values ( '1','El ritmo de la venganza', 'Accion','80');


use laboratory;
select * from registroproducto;