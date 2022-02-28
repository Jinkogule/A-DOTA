# Trabalho de Programação Orientada a Objetos - A-DOTA
Software desenvolvido para disciplina TCC00328 - Programação Orientada a Objetos, ministrada pela Professora Vânia Neves no Instituto de Computação da Universidade Federal Fluminense, durante o período 2º/2020.

Trabalho feito por Gabriel Barbedo, Lucas Couto e Lucas Pimenta. 

O Projeto “A-DOTA” consiste em um software desenvolvido para auxiliar o controle de animais em situação de adoção, onde se pode gerenciar desde a sua entrada no sistema de adoção até o registro a adoção em si.
O programa se concentra a princípio na Adoção de Cães e Gatos e tem como escopo o estado do Rio de Janeiro e suas cidades.

Utilizou-se nesse projeto a linguagem Java, também a interface gráfica Java Swing, além disso:

Orientação a Objetos;
Construtores, pacotes e encapsulamento;
Atributos e métodos estáticos;
Herança;
Polimorfismo;
Classes abstratas e interfaces;
Arquivos;
Tratamento de Exceções;

Obs: a funcionalidade principal do software funciona em cima de um banco de dados local do usuário, cujo SQL que contém os dados desse banco está no repositório com o nome "A-DOTA.sql". Além disso, também é necessário que o usuário inclua no projeto um driver JDBC para o SGBD MySQL, e, caso existam problemas com sua conexão, alterar os dados que compõem a efetuação dessa conexão nos atributos da classe "ConnectDB", localizada em "src/dao/ConnectDB.java".
