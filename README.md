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
## API Endpoints

### EmployeeController: Entity Manager Implementation (Approach 1)

**Class Diagram:**

![EmployeeController Diagram](https://github.com/viveksumanth/SpringBoot-Crud-Hibernate/assets/61607315/a88d6838-a62a-4d88-8d50-e5886edfe877)

#### Endpoints

- **Insert New Employee**
    - **POST** `http://localhost:8080/api/employees`
    - **Request Body**:
    ```json
    {
        "id": 1,
        "firstName": "Leslie",
        "lastName": "Andrews",
        "age": 10,
        "gender": "Male",
        "role": "Software Engineer 1"
    }
    ```

- **Get All Employees**
    - **GET** `http://localhost:8080/api/allemployees`

- **Get Employee by ID**
    - **GET** `http://localhost:8080/api/employees/{id}`

- **Update Existing Employee**
    - **PUT** `http://localhost:8080/api/employees`
    - **Request Body**:
    ```json
    {
        "id": 1,
        "firstName": "Leslie",
        "lastName": "Andrews",
        "age": 10,
        "gender": "Male",
        "role": "Software Engineer 1"
    }
    ```

- **Delete Existing Employee**
    - **DELETE** `http://localhost:8080/api/employees/{id}`

### ProductController: Spring Boot Data JPA Implementation (Approach 2)

**Class Diagram:**

![ProductController Diagram](https://github.com/viveksumanth/SpringBoot-Crud-Hibernate/assets/61607315/f1ec9837-8140-4eb3-a369-26e6f4b63f6f)

#### Endpoints

- **Insert New Product**
    - **POST** `http://localhost:8080/api/products`
    - **Request Body**:
    ```json
    {
        "productId": 4,
        "productName": "sharpner",
        "productPrice": 5.0,
        "productStatus": "IN_STOCK"
    }
    ```

- **Get All Products**
    - **GET** `http://localhost:8080/api/allProducts`

- **Get Product by ID**
    - **GET** `http://localhost:8080/api/products/{id}`

- **Update Existing Product**
    - **PUT** `http://localhost:8080/api/products`
    - **Request Body**:
    ```json
    {
        "productId": 4,
        "productName": "sharpner",
        "productPrice": 5.0,
        "productStatus": "IN_STOCK"
    }
    ```

- **Delete Existing Product**
    - **DELETE** `http://localhost:8080/api/products/{id}`

- **Get Products by Name**
    - **GET** `http://localhost:8080/api/products?productName={productName}`

### CompanyController: Spring Boot Data JPA REST Implementation (Approach 3)

**Class Diagram:**

![CompanyController Diagram](https://github.com/viveksumanth/SpringBoot-Crud-Hibernate/assets/61607315/ba14c813-57ae-4d1b-807d-db17b7947e8f)

#### Endpoints

- **Insert New Company**
  - **POST** `http://localhost:8080/base/api/companies`
    - **Request Body**:
      ```json
      {
      "companyId": 3,
      "companyName": "amazon"
      }
      ```

- **Get All Companies**
  - **GET** `http://localhost:8080/base/api/companies`

- **Get Company by ID**
  - **GET** `http://localhost:8080/base/api/companies/{id}`

- **Update Existing Product**
  - **PUT** `http://localhost:8080/base/api/companies/{id}`
  - **Request Body**:
  ```json
  {
  "companyName": "zotec partners"
  }
  ```

- **Delete Existing Product**
  - **DELETE** `http://localhost:8080/base/api/companies/{id}`

---
