Drop database if exists DBRegistroIN5AV;
Create database DBRegistroIN5AV;
use DBRegistroIN5AV;

Create table Personas(
codigoPersona int not null auto_increment,
DPI varchar (15) not null,
nombrePersona varchar (200) not null,
primary key PK_codigoPersona (codigoPersona)
); 

insert into Personas (DPI, nombrePersona)values('514898256134','Julio Samuel Isaac Lima Donis');
insert into Personas (DPI, nombrePersona)values('895146521947','Alejandro Carrillo García');
insert into Personas (DPI, nombrePersona)values('321546975984','José Marcos Ajuchán Chiquitó');
insert into Personas (DPI, nombrePersona)values('596314525241','Diego Jhonatan Chiyal Tzaj');
insert into Personas (DPI, nombrePersona)values('986532548165','Allan Rodrigo Hernández López');
insert into Personas (DPI, nombrePersona)values('361548795216','Heber Obdulio Ajbal Muj ');
insert into Personas (DPI, nombrePersona)values('020215480241','Pedro Luis Alvarez Gonzalez');
insert into Personas (DPI, nombrePersona)values('986521547865','Javier Alejandro Dubón Ubedo');
insert into Personas (DPI, nombrePersona)values('615249378105','Jose David Batres Garcia');
insert into Personas (DPI, nombrePersona)values('118905613264','Jairo Daniel Corona Boch');
insert into Personas (DPI, nombrePersona)values('691591732846','Néstor Alejandro Reina Méndez');

select * from Usuarios;
    
    


Create table Rol(
codigoRol int not null auto_increment,
Rol varchar(35) not null,
primary key PK_codigoRol (codigoRol)
); 

insert into Rol (codigoRol, Rol)values(1,"Administrador");
insert into Rol (codigoRol, Rol)values(2,"User");


Create table Usuarios(
Usuario varchar (15) not null,
Password varchar (200) not null,
rol int,
primary key PK_Usuario (Usuario) ,
Constraint FK_Usuarios_Rol foreign key (rol) references Rol(codigoRol)

); 
insert into Usuarios (Usuario, Password, rol)values("Isaac2","123",1);
insert into Usuarios (Usuario, Password, rol)values("Isaac3","123",2);



SELECT * FROM usuarios where Usuario= "Isaac2" and password=123;