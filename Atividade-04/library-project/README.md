# 📚 Sistema de livros com MongoDB e Spring

Este projeto é um projeto simples de livros feito em Java. Ele permite o cadastro, atualização, exclusão e busca de livros. O projeto utiliza o MongoDB para persistência de dados e segue uma arquitetura baseada em Spring Boot.

## 🚀 Como Usar

### 📡 Interagindo com a API

As interações com o sistema são realizadas através de requisições HTTP usando o Postman ou qualquer outro cliente REST. Aqui estão algumas operações que você pode realizar:

1. **Adicionar Livro**: 
   - **Método**: POST
   - **Endpoint**: `/books`
   - **Corpo da Requisição**:
     ```json
     {
       "title": "Dom Casmurro",
       "author": "Machado de Assis",
       "year": 1899,
       "genre": "Romance"
     }
     ```

2. **Listar Todos os Livros**:
   - **Método**: GET
   - **Endpoint**: `/books`

3. **Buscar Livros por Autor**:
   - **Método**: GET
   - **Endpoint**: `/books/author/{author}`

4. **Atualizar Ano de Publicação de um Livro**:
   - **Método**: PUT
   - **Endpoint**: `/books/{title}`
   - **Parâmetros**: 
     - `year`: Novo ano de publicação.
   - **Exemplo**: `/books/1984?year=1950`

5. **Deletar Livro por Título**:
   - **Método**: DELETE
   - **Endpoint**: `/books/{title}`

6. **Deletar Livro por ID**:
   - **Método**: DELETE
   - **Endpoint**: `/books/id/{id}`

### 💡 Exemplo de Uso

1. Para adicionar um novo livro, faça uma requisição POST para `/books` com os dados do livro no corpo da requisição.
2. Para listar todos os livros, envie uma requisição GET para `/books`.

## 📁 Estrutura do Projeto

O projeto está organizado em pacotes conforme a seguinte estrutura:

- **controller**: Contém a classe `BookController`, que gerencia as requisições relacionadas aos livros.
- **model**: Contém a classe `Book`, que representa a entidade do livro e suas propriedades.
- **repository**: Contém a interface `BookRepository`, responsável pela interação com o banco de dados MongoDB.
- **service**: Contém a classe `BookService`, que encapsula a lógica de negócio para o gerenciamento de livros.

## 🛠️ Ferramentas utilizadas

- Java 21 ou superior
- Spring Boot 3.3.4
- MongoDB 6.0 ou superior
- Postman para interações com a API

### Configurar o Banco de Dados

- Antes de executar o projeto, certifique-se de que você tem um servidor MongoDB rodando. Em seguida, crie o banco de dados com a URI especificada no arquivo `application.properties`:
