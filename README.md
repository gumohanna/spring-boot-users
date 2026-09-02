# 👤 Spring Boot Users API

API REST desenvolvida com Java e Spring Boot para gerenciamento de usuários.

O projeto foi criado com o objetivo de praticar conceitos fundamentais do desenvolvimento de APIs REST utilizando Spring Boot, como arquitetura em camadas, DTOs, tratamento de exceções e operações CRUD.

## 🚀 Tecnologias

- Java
- Spring Boot
- Spring Web MVC
- Lombok
- SpringDoc OpenAPI / Swagger
- Maven

## 📁 Estrutura do projeto

```text
src/main/java/br/com/mohanna/test
│
├── controller
│   └── UserController.java
│
├── database
│   └── model
│       ├── User.java
│       └── ErrorResponse.java
│
├── dto
│   └── UserDTO.java
│
├── exception
│   └── NotFoundException.java
│
├── handler
│   └── GlobalExceptionHandler.java
│
├── service
│   └── UserService.java
│
└── TestApplication.java
```

## 📌 Funcionalidades

A API permite:

- Listar todos os usuários
- Buscar usuário por ID
- Criar um novo usuário
- Atualizar um usuário
- Remover um usuário
- Tratamento de usuário não encontrado

## 🔗 Endpoints

Base URL:

```text
http://localhost:8080/v1/users
```

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/v1/users` | Lista todos os usuários |
| GET | `/v1/users/{id}` | Busca um usuário pelo ID |
| POST | `/v1/users` | Cria um novo usuário |
| PUT | `/v1/users/{id}` | Atualiza um usuário |
| DELETE | `/v1/users/{id}` | Remove um usuário |

## 📥 Exemplo de requisição

### Criar usuário

```http
POST /v1/users
Content-Type: application/json
```

```json
{
  "name": "Gustavo",
  "cpf": "123.456.789-00",
  "email": "gustavo@email.com"
}
```

### Exemplo de resposta

```json
{
  "id": 3,
  "name": "Gustavo",
  "cpf": "123.456.789-00",
  "email": "gustavo@email.com"
}
```

## ⚠️ Tratamento de erros

Ao buscar um usuário inexistente, a API retorna `404 Not Found`.

Exemplo:

```json
{
  "message": "User not found",
  "status": 404
}
```

## 💾 Armazenamento

Nesta versão do projeto, os usuários são armazenados em memória utilizando uma `List`.

Por esse motivo, os dados adicionados durante a execução são perdidos quando a aplicação é reiniciada.

A integração com banco de dados poderá ser adicionada futuramente.

## ▶️ Como executar

Clone o repositório:

```bash
git clone https://github.com/gumohanna/spring-boot-users.git
```

Entre na pasta:

```bash
cd spring-boot-users
```

Execute a aplicação utilizando Maven:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A API estará disponível em:

```text
http://localhost:8080
```

## 📚 Objetivo

Este projeto faz parte dos meus estudos de desenvolvimento Back-end com Java e Spring Boot, com foco na construção e organização de APIs REST.