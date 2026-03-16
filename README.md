# 📚 Sistema de Biblioteca (Java + PostgreSQL)

Sistema simples de gerenciamento de biblioteca desenvolvido em **Java** utilizando **JDBC** para comunicação com banco de dados **PostgreSQL**.

O objetivo do projeto é demonstrar a implementação de um **CRUD básico** (Create, Read, Delete) com persistência em banco de dados relacional, aplicando boas práticas de organização de código e separação de responsabilidades.

Este projeto foi desenvolvido como parte dos estudos em **desenvolvimento backend**.

---

# 🚀 Tecnologias Utilizadas

- Java 17
- PostgreSQL
- JDBC
- Maven
- IntelliJ IDEA
- Git
- GitHub

---

# 📂 Estrutura do Projeto

Console_biblioteca
│
├── src
│ └── main
│ └── java
│ └── com.gabriel.biblioteca
│ ├── Biblioteca.java
│ ├── DatabaseConnection.java
│ ├── Livro.java
│ ├── LivroRepository.java
│ └── Main.java
│
├── .env.example
├── .gitignore
├── pom.xml
└── README.md


---

# 🧩 Descrição das Classes

### DatabaseConnection
Responsável por estabelecer a conexão com o banco de dados PostgreSQL utilizando JDBC.

### Livro
Classe que representa a entidade **Livro** dentro do sistema.

Contém atributos como:

- título
- autor
- ano
- disponibilidade

### LivroRepository
Responsável pelas operações de acesso ao banco de dados:

- inserir livros
- listar livros
- deletar livros

Utiliza **PreparedStatement**, evitando vulnerabilidades como SQL Injection.

### Biblioteca
Classe responsável por controlar a lógica do sistema.

### Main
Classe principal responsável por iniciar a aplicação.

---

# 🗄 Estrutura do Banco de Dados

O sistema utiliza uma tabela chamada **livros**.


⚙️ Configuração do Projeto
1️⃣ Clonar o repositório



2️⃣ Criar o banco de dados

No PostgreSQL execute:

CREATE DATABASE biblioteca;

Depois crie a tabela:

CREATE TABLE livros (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255),
    autor VARCHAR(255),
    ano INT,
    disponivel BOOLEAN
);


3️⃣ Configurar variáveis de ambiente

O projeto utiliza variáveis de ambiente para armazenar credenciais do banco.


* Crie um arquivo .env na raiz do projeto baseado no .env.example.

Exemplo:

DB_URL=jdbc:postgresql://localhost:5432/biblioteca
DB_USER=postgres
DB_PASSWORD=sua_senha


📌 Funcionalidades do Sistema

✔ Cadastrar livros no banco de dados
✔ Listar livros cadastrados
✔ Remover livros do banco
✔ Conexão segura com PostgreSQL
✔ Uso de PreparedStatement

🧠 Conceitos Aplicados

Este projeto aplica conceitos importantes de backend:

JDBC

CRUD

Repository Pattern

Conexão com banco de dados relacional

PreparedStatement

Separação de responsabilidades

Variáveis de ambiente para segurança

Estrutura de projeto com Maven

🔮 Melhorias Futuras : ⬇️

Possíveis evoluções do projeto:

Atualização de livros (Update)

API REST com Spring Boot

Sistema de empréstimos

Cadastro de usuários

Interface web

Testes automatizados

Containerização com Docker

👨‍💻 Autor

Desenvolvido por Gabriel Vieira

GitHub
https:   https://github.com/Gabrielsilv

📜 Licença

Projeto desenvolvido para fins de estudo e aprendizado em desenvolvimento backend com Java.




