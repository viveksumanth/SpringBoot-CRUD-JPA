# REST CRUD API Implementations

This repository provides a RESTful CRUD API implementation using Spring Boot. It includes three different approaches for managing entities: `EmployeeController`, `ProductController`, and `CompanyController`.

## Setup

### Prerequisites

Ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL
### Dependencies

Add the following dependencies in your `pom.xml` file:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-rest</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.32</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
### Database Setup
- Create a MySQL database.
- Update the application.properties file with your database configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### Application Properties Setup
```properties
#
# Spring data Rest properties
#
spring.data.rest.base-path=/base/api
```
### Running the Application 


```bash
 mvn spring-boot:run
```
-----
## API End Points
### EmployeeController : Entity manager implementation (Approach 1)

**Class diagram:** 

![employeeController drawio (1)](https://github.com/viveksumanth/SpringBoot-Crud-Hibernate/assets/61607315/a88d6838-a62a-4d88-8d50-e5886edfe877)

### endpoints: 

#### Insert new Employee in DB

    * POST http://localhost:8080/api/employees

Body
```dtd
{
    "id": 1,
    "firstName": "Leslie",
    "lastName": "Andrews",
    "age": 10,
    "gender": "Male",
    "role": "Software Engineer 1"
}
```

#### Get all employees from DB
    * GET http://localhost:8080/api/allemployees

#### Get all employees by id
    * GET http://localhost:8080/api/employees/{id}

#### Update existing Employee in DB
    * POST http://localhost:8080/api/employees

Body
```dtd
{
    "id": 1,
    "firstName": "Leslie",
    "lastName": "Andrews",
    "age": 10,
    "gender": "Male",
    "role": "Software Engineer 1"
}
```
-----------
### ProductController : Spring boot data jpa implementation (Approach 2)
![ProductController drawio](https://github.com/viveksumanth/SpringBoot-Crud-Hibernate/assets/61607315/f1ec9837-8140-4eb3-a369-26e6f4b63f6f)

### endpoints

* Write documentation about which part of the code it replaces

------------
### CompanyController : Spring boot data jpa rest implementation (Approach 3)
* **Class diagram:**

### endpoints
* Write documentation about which part of the code it replaces

------------
4. Setup PostMan steps
5. Include sql file. 
5. 
