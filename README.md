# 🚀 Buscador de Filmes Reativo

> Uma aplicação assíncrona que consome dados de cinema em tempo real, utilizando o poder do Spring WebFlux e programação reativa.

---

## 💻 Sobre o projeto

Este projeto foi desenvolvido para explorar os conceitos de **programação orientada a objeto**,**programação reativa** e **consumo de API** no ecossistema Java. O objetivo principal é permitir que o usuário busque informações detalhadas sobre filmes através de uma interface simples, onde o back-end atua como um mediador inteligente que consome APIs externas de forma não-bloqueante.

Desenvolvi esta aplicação para entender a aplicação prática de fluxos reativos (`Mono`), consumo de API e o uso do Spring Framework, garantindo que o thread do servidor não fique bloqueado enquanto espera a resposta de APIs externas, resultando em uma aplicação mais performática e escalável.

---

## ✨ Funcionalidades

- [x] **Busca em tempo real:** Integração com API externa para consulta de títulos e detalhes.
- [x] **Consumo Assíncrono:** Uso do `WebClient` para chamadas HTTP não-bloqueantes.
- [x] **Interface Dinâmica:** Front-end minimalista que renderiza dados e pôsteres via JavaScript (Fetch API).
- [x] **Arquitetura Spring:** Uso de `@RestController` e tratamento global de exceções.

---

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- **Linguagem:** Java 17+
- **Framework:** Spring Boot 3 (Spring WebFlux)
- **Biblioteca Reativa:** Project Reactor (`Mono`)
- **Front-end:** HTML5, CSS3 e JavaScript (Async/Await)
- **Cliente HTTP:** Spring WebClient

---

## 🚀 Como executar o projeto

### Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:
- [Git](https://git-scm.com)
- [Java 17 ou superior](https://www.oracle.com/java/technologies/downloads/)

### 🎲 Rodando a aplicação

```bash
# Clone este repositório
$ git clone [https://github.com/assisgb/buscador-de-filmes](https://github.com/assisgb/buscador-de-filmes)

# Acesse a pasta do projeto no terminal
$ cd buscador-de-filmes/BuscadorDeFilmes

# Compile o projeto e baixe as dependências (Maven Wrapper)
$ ./mvnw clean install

# Execute a aplicação
$ ./mvnw spring-boot:run
