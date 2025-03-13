<div align="center">
<img style="" src="https://github.com/Jinkogule/A-DOTA/blob/main/src/img/logo_readme.png" width="250px;" alt=""/>
<br>

[![Release](https://img.shields.io/github/v/release/Jinkogule/A-DOTA?style=for-the-badge)](https://github.com/Jinkogule/BandejApp/releases)
[![License](https://img.shields.io/github/license/Jinkogule/A-DOTA?style=for-the-badge)](LICENSE)<br>
![Status](https://img.shields.io/badge/STATUS-COMPLETED-brightgreen?style=for-the-badge)
</div>

<p align="center">
  <a href="#-about-the-project">About</a> •
  <a href="#-documentation">Documentation</a> •
  <a href="#-development">Development</a> •
  <a href="#-technologies">Technologies</a> •
  <a href="#-run-the-project-locally">Run the project locally</a> •
  <a href="#-layout">Layout</a> •
  <a href="#-authors">Authors</a> •
  <a href="#-license">License</a>
  <br>
  <a href="./README.pt-BR.md">Português (BR)</a> •
  <a href="./README.md">English</a>
</p>

---

## 💻 About the Project

**A-DOTA** is a fictional software developed to assist in managing animals available for adoption. Initially, the program focuses on the adoption of dogs and cats and is limited to the state of Rio de Janeiro and its cities. Through the system, users can register adopters, shelters, and animals; list adopters, shelters, animals available for adoption, and already adopted animals; and facilitate the adoption process by selecting an adopter and an available animal.

The project was created as part of the Object-Oriented Programming course, with the goal of applying concepts such as object orientation; constructors, packages, and encapsulation; static attributes and methods; inheritance and polymorphism; abstract classes and interfaces; file handling; and exception handling.

**Note:** This project was developed solely as an academic exercise for learning purposes. Therefore, it is not a real animal adoption system.

## 📋 Documentation

-   **[Wiki](https://github.com/Jinkogule/A-DOTA/wiki)**

## 🧑🏻‍💻 Development

-   **[Source Code](https://github.com/Jinkogule/A-DOTA)**
-   **[Issue Tracking](https://github.com/Jinkogule/A-DOTA/issues)**

## 🛠 Technologies

### **Back-End (Desktop Application)**

-   **[Java 15](https://www.oracle.com/br/java/technologies/downloads/#java15)**
-   **[Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/)**

### **Database**

-   **[MySQL 8.0.3](https://www.mysql.com/)**

## ⚙ Run the Project Locally

### **Prerequisites**

Before you begin, make sure to:

- Install **[Git](https://git-scm.com/)**.
- Install **[MySQL Server 8.0.3](https://dev.mysql.com/downloads/mysql/)** (or a compatible version).
- Run the **[database script](https://github.com/Jinkogule/A-DOTA/blob/main/A_DOTA.sql)** to create the required schema and tables.
- Install **[JDK 15](https://www.oracle.com/br/java/technologies/downloads/#java15)** (or a compatible version) and set the `JAVA_HOME` variable with the correct JDK path.
- Download **[MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)** to connect the project to MySQL.
- Install **[Apache NetBeans IDE](https://netbeans.apache.org/front/main/index.html)** to run the project.

### **Running the Application**

1. **Clone this repository**
```bash
git clone https://github.com/Jinkogule/A-DOTA
```

2. **Open the project in Apache NetBeans IDE**
   - In the menu, go to File > Open Project and select the project folder.

3. **Configure the database connection**
   - If needed, edit the `ConnectDB.java` file (located in `src/dao/ConnectDB.java`).
   - Adjust the MySQL connection details.

4. **Add MySQL Connector/J to the project libraries**
   - In NetBeans, right-click the project → Properties → Libraries.
   - In the Compile (Compile-time Libraries) tab, click the **"+"** next to Classpath.
   - Select Add JAR/Folder and choose the `.jar` file for **MySQL Connector/J**.
   - Confirm and apply the changes.

5. **Run the application**
   - In Apache NetBeans, right-click the project and select Run.

## 🎨 Layout

### Application Screens

<table align="center" width="100%">
  <tr>
    <td align="center" colspan="2"><strong>Home pages</strong></td>
  </tr>
  <tr>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/pagina_inicial.png" alt="Home page" title="Home page" width="100%">
      <br>
      <em>Home page</em>
    </td>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/menu.png" alt="Menu (list)" title="Menu (list)" width="100%">
      <br>
      <em>Menu (list)</em>
    </td>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/menu_2.png" alt="Menu (register)" title="Menu (register)" width="100%">
      <br>
      <em>Menu (register)</em>
    </td>
  </tr>
</table>

<table align="center" width="100%">
  <tr>
    <td align="center" colspan="3"><strong>Registrations</strong></td>
  </tr>
  <tr>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/cadastro_de_abrigo.png" alt="Shelter registration" title="Shelter registration" width="100%">
      <br>
      <em>Shelter registration</em>
    </td>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/cadastro_de_adotante.png" alt="Adopter registration" title="Adopter registration" width="100%">
      <br>
      <em>Adopter registration</em>
    </td>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/cadastro_de_animal.png" alt="Animal registration" title="Animal registration" width="100%">
      <br>
      <em>Animal registration</em>
    </td>
  </tr>
</table>

<table align="center" width="100%">
  <tr>
    <td align="center" colspan="3"><strong>Listings</strong></td>
  </tr>
  <tr>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/lista_de_abrigos.png" alt="Shelter list" title="Shelter list" width="100%">
      <br>
      <em>Shelter list</em>
    </td>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/lista_de_adotantes.png" alt="Adopter list" title="Adopter list" width="100%">
      <br>
      <em>Adopter list</em>
    </td>
    <td align="center" width="33%">
      <img src="/src/img/screenshots/lista_de_animais.png" alt="List of available animals for adoption" title="List of available animals for adoption" width="100%">
      <br>
      <em>List of available animals for adoption</em>
    </td>
  </tr>
</table>

<table align="center" width="100%">
  <tr>
    <td align="center" colspan="2"><strong>Adoptions</strong></td>
  </tr>
  <tr>
    <td align="center" width="50%">
      <img src="/src/img/screenshots/adocao_de_animal.png" alt="Animal adoption" title="Animal adoption" width="100%">
      <br>
      <em>Animal adoption</em>
    </td>
    <td align="center" width="50%">
      <img src="/src/img/screenshots/lista_de_animais_adotados.png" alt="List of adopted animals" title="List of adopted animals" width="100%">
      <br>
      <em>List of adopted animals</em>
    </td>
  </tr>
</table>

## ✒ Authors

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

## 📝 License

This project is licensed under the **[MIT](./LICENSE)** license.