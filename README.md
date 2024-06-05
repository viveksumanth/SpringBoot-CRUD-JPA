##  REST CRUD API Implementations

### EmployeeController : Entity manager implementation

**Class diagram:** 

![employeeController drawio (1)](https://github.com/viveksumanth/SpringBoot-Crud-Hibernate/assets/61607315/a88d6838-a62a-4d88-8d50-e5886edfe877)


### endpoints

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
2. Write documentation for JPA implementation
* Product class
* draw implementation diagram
* List out endpoints
* Write documentation about which part of the code it replaces

------------
3. Write documentation for data spring-boot-starter-data-rest<
* Companies class
* Draw implementation diagram
* List out endpoints
* Write documentation about which part of the code it replaces
---------
4. Include sql file. 
5. 
