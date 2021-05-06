create database if not exists a_dota;
use a_dota;

create table if not exists adotante(
	Id int(11) not null auto_increment,
    Nome varchar(100),
    Idade int(11),
    Endereco varchar(500),
    Telefone varchar(100),
    CEP varchar(9),
primary key(Id)
);

create table if not exists abrigo(
	Id int(11) not null auto_increment,
    Nome_Dono varchar(100),
    Nome_Abrigo varchar(200),
    Endereco varchar(500),
    CEP varchar(9),
    Estado varchar(30),
    Cidade varchar(30),
primary key(Id)
);

create table if not exists animais(
	Id int(11) not null auto_increment,
    Nome_Animal varchar(100),
    Tipo varchar(200),
    Raca varchar(200),
    Idade int(11),
    Porte varchar(100),
    Cor varchar(100),
    Abrigo varchar(100),
primary key(Id)
);

create table if not exists adotados(
	Id int(11) not null auto_increment,
    Nome_Animal varchar(100) not null,
    Nome_Adotante varchar(100) not null,
    primary key(Id)
);