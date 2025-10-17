# Test Application - Spring Boot

Este é um projeto de exemplo em **Spring Boot** demonstrando o padrão **MVC (Model-View-Controller)** com uma API REST simples.

---

## Tecnologias utilizadas

- Java 21
- Spring Boot 3.5.6
- Maven
- Lombok
- Spring Web

---

## Estrutura do projeto

- **Controller**: Recebe requisições HTTP e chama os serviços correspondentes.
  - `UserController.java`
- **Service**: Contém a lógica de negócio.
  - `UserService.java`
- **Model**: Representa os dados da aplicação.
  - `User.java`

---

## Endpoints disponíveis

O projeto possui a URL base:  
http://localhost:3000/test

### GET `/hello`
Retorna uma saudação simples.

Exemplo de requisição:  
GET http://localhost:3000/test/hello

Resposta:
Hello

### GET `/bye`
Retorna uma despedida.

Exemplo de requisição:
GET http://localhost:3000/test/bye

Resposta:
Bye

### GET `/name/{name}`
Recebe um parâmetro `name` na URL e retorna uma saudação personalizada.

Exemplo de requisição:
GET http://localhost:3000/test/name/Murilo

Resposta:
Hello Murilo!
