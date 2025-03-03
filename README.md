<div align="center">
<img style="" src="https://github.com/Jinkogule/A-DOTA/blob/main/src/img/a-dotanew.png" width="250px;" alt=""/>
<br>

[![Release](https://img.shields.io/github/v/release/Jinkogule/A-DOTA?style=for-the-badge)](https://github.com/Jinkogule/BandejApp/releases)
[![License](https://img.shields.io/github/license/Jinkogule/A-DOTA?style=for-the-badge)](LICENSE)<br>
![Status](https://img.shields.io/badge/STATUS-CONCLU%C3%8DDO%20-brightgreen?style=for-the-badge)
</div>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-documentação">Documentação</a> • 
 <a href="#-desenvolvimento">Desenvolvimento</a> • 
 <a href="#-tecnologias">Tecnologias</a> • 
 <a href="#-executar-o-projeto-localmente">Executar o projeto localmente</a> • 
 <a href="#-layout">Layout</a> •
 <a href="#-autores">Autores</a> •
 <a href="#-licença">Licença</a>
</p>

---

## 💻 Sobre o projeto

O **A-DOTA** é um software fictício desenvolvido para auxiliar no gerenciamento de animais em situação de adoção. O programa foca, inicialmente, na adoção de cães e gatos e tem como escopo o estado do Rio de Janeiro e suas cidades. Através do sistema, é possível cadastrar adotantes, abrigos e animais; listar adotantes, abrigos, animais disponíveis para adoção e animais já adotados; além de realizar a adoção, selecionando um adotante e um animal disponível.

O projeto foi criado como parte da disciplina Programação Orientada a Objetos, com o objetivo de aplicar conceitos como orientação a objetos; construtores, pacotes e encapsulamento; atributos e métodos estáticos; herança e polimorfismo; classes abstratas e interfaces; manipulação de arquivos; e tratamento de exceções.

**Observação:** Este projeto foi desenvolvido apenas como um exercício acadêmico para fins de aprendizagem. Portanto, não se trata de um sistema real de adoção de animais.

## 📋 Documentação

-   **[Wiki](https://github.com/Jinkogule/A-DOTA/wiki)**

## 🧑🏻‍💻 Desenvolvimento

-   **[Código fonte](https://github.com/Jinkogule/A-DOTA)**
-   **[Issue Tracking](https://github.com/Jinkogule/A-DOTA/issues)**

## 🛠 Tecnologias

### **Back-End (Aplicação Desktop)**  

-   **[Java 15](https://www.oracle.com/br/java/technologies/downloads/#java15)**  
-   **[Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/)**    

### **Banco de Dados**

-   **[MySQL 8.0.3](https://www.mysql.com/)**

## ⚙ Executar o projeto localmente  

### **Pré-Requisitos**  

Antes de começar, certifique-se de:  

- Instalar o **[Git](https://git-scm.com/)**.  
- Instalar o **[MySQL Server 8.0.3](https://dev.mysql.com/downloads/mysql/)** (ou versão compatível).  
- Executar o **[script de banco de dados](https://github.com/Jinkogule/A-DOTA/blob/main/A_DOTA.sql)** para criar o schema e as tabelas necessárias.    
- Instalar o **[JDK 15](https://www.oracle.com/br/java/technologies/downloads/#java15)** (ou versão compatível) e configurar a variável `JAVA_HOME` com o caminho correto do JDK.
- Baixar o **[MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)** para conectar o projeto ao MySQL.  
- Instalar o **[Apache NetBeans IDE](https://netbeans.apache.org/front/main/index.html)** para rodar o projeto.

### **Rodando a Aplicação**  

1. **Clone este repositório**
```bash
git clone https://github.com/Jinkogule/A-DOTA    
```

2. **Abra o projeto no Apache NetBeans IDE**  
   - No menu, vá em *File* > *Open Project* e selecione a pasta do projeto.  

3. **Configure a conexão com o banco de dados**  
   - Se necessário, edite a classe `ConnectDB.java` (localizada em `src/dao/ConnectDB.java`).  
   - Ajuste os dados de conexão com o MySQL.  

4. **Adicione o MySQL Connector/J às Libraries do projeto**  
   - No NetBeans, clique com o botão direito no projeto → *Properties* → *Libraries*.  
   - Na aba *Compile* (*Compile-time Libraries*), clique no **"+"** ao lado da opção *Classpath*.  
   - Selecione *Add JAR/Folder* e escolha o arquivo `.jar` do **MySQL Connector/J** baixado.  
   - Confirme e aplique as alterações.  

5. **Execute a aplicação**  
   - No Apache NetBeans, clique com o botão direito no projeto e selecione *Run*.  

## 🎨 Layout

### Telas da aplicação

<table>
  <tr>
    <td align="center">
      <img src="/src/img/screenshots/pagina_inicial.png" alt="Página inicial" title="Página inicial">
      <br>
      <em>Página inicial</em>
    </td>
    <td align="center">
      <img src="/src/img/screenshots/menu.png" alt="Menu" title="Menu">
      <br>
      <em>Menu</em>
    </td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/img/screenshots/cadastro_de_abrigo.png" alt="Cadastro de abrigo" title="Cadastro de abrigo">
      <br>
      <em>Cadastro de abrigo</em>
    </td>
    <td align="center">
      <img src="/src/img/screenshots/cadastro_de_adotante.png" alt="Cadastro de adotante" title="Cadastro de adotante">
      <br>
      <em>Cadastro de adotante</em>
    </td>
    <td align="center">
      <img src="/src/img/screenshots/cadastro_de_animal.png" alt="Cadastro de animal" title="Cadastro de animal">
      <br>
      <em>Cadastro de animal</em>
    </td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/img/screenshots/lista_de_abrigos.png" alt="Lista de abrigos" title="Lista de abrigos">
      <br>
      <em>Lista de abrigos</em>
    </td>
    <td align="center">
      <img src="/src/img/screenshots/lista_de_adotantes.png" alt="Lista de adotantes" title="Lista de adotantes">
      <br>
      <em>Lista de adotantes</em>
    </td>
    <td align="center">
      <img src="/src/img/screenshots/lista_de_animais.png" alt="Lista de animais disponíveis para adoção" title="Lista de animais disponíveis para adoção">
      <br>
      <em>Lista de animais disponíveis para adoção</em>
    </td>
  </tr>
  <tr>
    <td align="center">
      <img src="/src/img/screenshots/adocao_de_animal.png" alt="Adoção de animal" title="Adoção de animal">
      <br>
      <em>Adoção de animal</em>
    </td>
    <td align="center">
      <img src="/src/img/screenshots/lista_de_animais_adotados.png" alt="Lista de animais adotados" title="Lista de animais adotados">
      <br>
      <em>Lista de animais adotados</em>
    </td>
  </tr>
</table>

## ✒ Autores

<table>
  <tr>
    <td align="center">
      Lucas Pimenta
      <br>
      <a href="https://github.com/Jinkogule">
        <img src="https://avatars.githubusercontent.com/u/52849575?v=4" width="100px;" alt="Lucas Pimenta"/>
      </a>
      <br>
      <a href="https://github.com/Jinkogule">
        <img src="https://img.shields.io/badge/-Github-black?style=flat-square&logo=Github&logoColor=white">
      </a>
    </td>
    <td align="center">
      Gabriel Barbedo
      <br>
      <a href="https://github.com/Bolaks">
        <img src="https://avatars.githubusercontent.com/u/72170455?v=4" width="100px;" alt="Gabriel Barbedo"/>
      </a>
      <br>
      <a href="https://github.com/Bolaks">
        <img src="https://img.shields.io/badge/-Github-black?style=flat-square&logo=Github&logoColor=white">
      </a>
    </td>
    <td align="center">
      Lucas Couto
      <br>
      <a href="https://github.com/LucasCouto22">
        <img src="https://avatars.githubusercontent.com/u/62523407?v=4" width="100px;" alt="Lucas Couto"/>
      </a>
      <br>
      <a href="https://github.com/LucasCouto22">
        <img src="https://img.shields.io/badge/-Github-black?style=flat-square&logo=Github&logoColor=white">
      </a>
    </td>
  </tr>
</table>

## 📝 Licença

Este projeto está sob a licença **[MIT](./LICENSE)**.