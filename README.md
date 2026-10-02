# JavaFlix 

JavaFlix é um projeto desenvolvido durante meus estudos de Java e Programação Orientada a Objetos.

O projeto começou como uma aplicação Java simples para representar filmes, avaliações e cálculo de médias. Depois, utilizei o mesmo projeto para ter meu primeiro contato com Spring Boot e entender na prática como um backend pode fornecer dados para uma interface web.

## Funcionalidades

- Cadastro de informações dos filmes no backend
- Avaliação dos filmes
- Cálculo automático da média das avaliações
- Endpoint para consulta dos filmes
- Retorno dos dados em JSON
- Frontend integrado ao backend
- Exibição dinâmica dos filmes na interface
- Visualização de detalhes e trilha sonora

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Maven
- HTML
- CSS
- JavaScript
- Git
- GitHub

## Como funciona

As informações dos filmes são criadas no backend Java.

O Spring Boot disponibiliza esses dados através do endpoint:

```text
GET /filmes
```

O frontend consulta esse endpoint e utiliza os dados recebidos para montar os cards dos filmes.

O fluxo atual da aplicação é:

```text
Java
  ↓
Spring Boot
  ↓
/filmes
  ↓
JSON
  ↓
JavaScript
  ↓
Interface JavaFlix
```

Dessa forma, alterações feitas nas informações dos filmes no backend são refletidas na interface após a aplicação ser reiniciada.

## Conceitos praticados

Durante o desenvolvimento deste projeto, pratiquei conceitos como:

- Classes e objetos
- Atributos e métodos
- Construtores
- Encapsulamento
- Getters
- Listas de objetos
- Cálculo de média
- Spring Boot
- Controllers
- Endpoints HTTP
- JSON
- Integração entre backend e frontend
- Versionamento com Git

## Executando o projeto

É necessário ter o Java 21 instalado.

Clone o repositório:

```bash
git clone https://github.com/olivermateus-santos/javaflix.git
```

Entre na pasta do projeto.

No Windows:

```bash
.\mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

Depois acesse:

```text
http://localhost:8080
```

Para visualizar diretamente os dados retornados pelo backend:

```text
http://localhost:8080/filmes
```

## Sobre o projeto

Este projeto faz parte da minha evolução nos estudos para desenvolvimento Backend Java.

A ideia é continuar evoluindo o JavaFlix conforme avanço nos estudos e adquiro conhecimento em novas tecnologias e conceitos.