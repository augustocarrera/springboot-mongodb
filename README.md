# Workshop: API Restful com Spring Boot e MongoDB

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)

## sobre o Projeto

Este projeto é uma API Restful desenvolvida em **Java** utilizando o framework **Spring Boot** e o banco de dados NoSQL **MongoDB**.

O objetivo principal foi explorar as capacidades do Spring Data MongoDB, entendendo as diferenças entre modelagem de dados relacional e orientada a documentos, incluindo o manuseio de objetos aninhados e referências.

O projeto foi desenvolvido como parte do estudo de desenvolvimento web Back-end.

## 🔨 Funcionalidades

O sistema gerencia um domínio de interações sociais (semelhante a uma rede social simples), permitindo:

* **Usuários (Users):**
    * CRUD completo (Criar, Ler, Atualizar, Deletar).
    * Associação com Posts (um usuário possui vários posts).
* **Postagens (Posts):**
    * Busca de post por ID.
    * Busca de posts contendo texto no título (Consulta simples).
    * Busca avançada com critérios múltiplos (texto no conteúdo + intervalo de datas).
* **Comentários (Comments):**
    * Armazenamento de comentários aninhados dentro dos posts.

## 💻 Tecnologias Utilizadas

* **Java 21** - Linguagem de programação.
* **Spring Boot 3** - Framework para criação da API.
* **Spring Data MongoDB** - Para persistência de dados.
* **MongoDB** - Banco de dados NoSQL orientado a documentos.
* **Maven** - Gerenciador de dependências.

## 🧩 Modelagem de Dados (NoSQL)

Um dos focos do projeto foi entender como estruturar dados no MongoDB. Foram utilizados dois conceitos principais:

1.  **Referências (@DBRef):** Para ligar os Posts aos Usuários, evitando redundância excessiva.
2.  **Objetos Aninhados (Embedded):**
    * O `Author` dentro do Post (para não precisar consultar o banco de usuários só para mostrar o nome do autor).
    * Os `Comments` dentro do Post (para otimizar a leitura da postagem completa).

## 🚀 Como rodar o projeto

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* MongoDB instalado e rodando na porta 27017.
* Maven instalado (ou usar o wrapper `mvnw` incluso).

### Passo a passo

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/SEU-USUARIO/workshop-springboot3-jpa.git](https://github.com/SEU-USUARIO/workshop-springboot3-jpa.git)
    ```
2.  Verifique a configuração do banco de dados no arquivo `src/main/resources/application.properties`:
    ```properties
    spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
    ```
3.  Execute o projeto via terminal ou IDE:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  A API estará disponível em `http://localhost:8080`.

## 🧪 Testando a API

Você pode testar os endpoints utilizando o **Postman** ou **Thunder Client**.

**Exemplos de Endpoints:**

* `GET /users` - Lista todos os usuários.
* `POST /users` - Cria um novo usuário.
* `GET /posts/{id}` - Busca um post específico.
* `GET /posts/titlesearch?text=bom%20dia` - Busca posts por título.


*Este projeto foi desenvolvido com base no curso do Professor Nélio Alves.*
