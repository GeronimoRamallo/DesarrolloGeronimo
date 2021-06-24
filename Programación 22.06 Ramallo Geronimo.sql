CREATE DATABASE examen;

CREATE TABLE Estudiantes(
	idest int not null primary key,
	Nombre varchar(12) not null,
	Apellido varchar(12) not null,
	Nota int not null,
Curso varchar(40) not null);