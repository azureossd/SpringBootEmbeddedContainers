# SpringBootEmbeddedContainers
A repo of CRUD examples in the form of a Todo application that uses different embedded containers, instead of the default which is Tomcat.

#### `jetty` - Usage
A TODO/CRUD application connected to a Postgres database using [Jetty](https://www.eclipse.org/jetty/) as its embedded container.

Create an [Azure Database for PostgreSQL](https://docs.microsoft.com/en-us/azure/postgresql/overview) instance and set the following environment variables in the `application.properties` file to the below:
 - `${POSTGRES_HOST}`: The host name of your Postgres server
 - `${POSTGRES_DATABASE_NAME}`: The name of your Postgres database. The `jetty` example uses 'jettytodos'. Refer to the `jetty/database` folder.
 - `${POSTGRES_USER}`: The Postgres username
 - `${POSTGRESL_PASSWORD}`: Your Postgres password

- Routes:
    - `/api/v1/todo/add`: A POST request to add new tasks.
    - `/api/v1/todo/delete`: A DELETE request to delete a todo by ID.
    - `/api/v1/todo/find/{id}`: A GET request to find a todo by ID.
    - `/api/v1/todo/all`: A GET request to get all todos.
  

#### `undertow` - Usage
A CRUD application to add books connecting to a MySQL database using [Undertow](https://undertow.io/) as its embedded container.

Create an [Azure Database for MySQL](https://docs.microsoft.com/en-us/azure/mysql/) instance and set the following environment variables in the `application.properties` file to the below:
 - `${MYSQL_HOST}`: The host name of your MySQL server
 - `${MYSQL_DATABASE_NAME}`: The name of your MySQL database. The `undertow` example uses 'undertowbooks'. Refer to the `jetty/database` folder.
 - `${MYSQL_USER}`: The MySQL username
 - `${MYSQL_PASSWORD}`: Your MySQL password

- Routes:
    - `/api/v1/books/add`: A POST request to add new books.
    - `/api/v1/books/delete`: A DELETE request to delete a book by ID.
    - `/api/v1/books/find/{id}`: A GET request to find a book by ID.
    - `/api/v1/books/all`: A GET request to get all books.
- Both examples have a Swagger endpoint available to them by accessing the `/swagger-ui/` endpoint.
