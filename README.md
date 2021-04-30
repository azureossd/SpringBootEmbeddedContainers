# SpringBootEmbeddedContainers
A repo of CRUD examples in the form of a Todo application that uses different embedded containers, instead of the default which is Tomcat.

Directories - 
- `/jetty` - A TODO/CRUD application connected to a Postgres database using Jetty as its embedded container.
  - Routes:
    - `/api/v1/todo/add`: A POST request to add new tasks.
    - `/api/v1/todo/delete`: A DELETE request to delete a todo by ID.
    - `/api/v1/todo/find/{id}`: A GET request to find a todo by ID.
    - `/api/v1/todo/all`: A GET request to get all todos.
- `/undertow` - A CRUD application to add books connecting to a MySQL database using Undertow as its embedded container.
  - Routes:
    - `/api/v1/books/add`: A POST request to add new books.
    - `/api/v1/books/delete`: A DELETE request to delete a book by ID.
    - `/api/v1/books/find/{id}`: A GET request to find a book by ID.
    - `/api/v1/books/all`: A GET request to get all books.
- Both examples have a Swagger endpoint available to them by accessing the `/swagger-ui/` endpoint.
