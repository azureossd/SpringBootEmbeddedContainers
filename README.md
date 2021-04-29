# SpringBootEmbeddedContainers
A repo of CRUD examples in the form of a Todo application that uses different embedded containers, instead of the default which is Tomcat.

Directories - 
- `/jetty` - A TODO/CRUD application connected to a Postgres database using Jetty as its embedded container.
- `/undertow` - A CRUD application to add books connecting to a MySQL database using Undertow as its embedded container.
- Both examples have a Swagger endpoint available to them by accessing the `/swagger-ui/` endpoint.
