# Spaceship Management API

## Descripción
La API de Gestión de Naves Espaciales permite realizar operaciones CRUD sobre naves espaciales de series y películas pedido por prueba tecnica

## Requisitos
- Java 11 o superior
- Maven
- Spring Boot

## Instalación
1. Clona el repositorio:
   ```sh
   git clone <URL del repositorio>
   cd spaceship-api

2. Construye el proyecto:
mvn clean install

3.Ejecución
Para ejecutar la aplicación:
mvn spring-boot:run
La aplicación estará disponible en http://localhost:8080.

4. Endpoints
GET /api/spaceships - Consultar todas las naves utilizando paginación.
GET /api/spaceships/{id} - Consultar una única nave por id.
GET /api/spaceships/search?name={name} - Consultar todas las naves que contienen el valor del parámetro en su nombre.
POST /api/spaceships - Crear una nueva nave.
PUT /api/spaceships/{id} - Modificar una nave existente.
DELETE /api/spaceships/{id} - Eliminar una nave.

5. Documentación de la API
La documentación completa de la API está disponible en http://localhost:8080/swagger-ui/.

6. Configuración de Swagger
Swagger está configurado para proporcionar documentación interactiva de la API. La configuración se encuentra en com.mycompany.spaceshipapi.config.SwaggerConfig.

7. Detalles tecnicos

Controladores
El controlador principal SpaceshipController maneja las solicitudes HTTP y coordina las operaciones CRUD para las naves espaciales.

Servicios
El servicio SpaceshipService implementa la lógica de negocio para las operaciones CRUD.

Repositorios
El repositorio SpaceshipRepository maneja la interacción con la base de datos utilizando Spring Data JPA.

Entidades
La entidad Spaceship representa las naves espaciales en la base de datos.
