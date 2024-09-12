# Spring Security

Implemented a Spring Security project to learn and apply authentication in a Spring Boot application.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

## Introduction

Created a Spring Security project to gain hands-on experience with authentication in a Spring Boot application. This project will help understand the internal workings of Spring Security and how to customize it for specific security needs.

## Features

- **User Authentication:** Implemented secure user login with password encryption using Spring Security’s authentication mechanisms.
- **Session Management:** Replaced traditional session management with stateless JWT token-based authentication.
- **CSRF Protection:** Disabled CSRF protection for stateless JWT authentication, ensuring secure API communication.

## Technologies Used

- **Spring Boot:** For building the core application.
- **Spring Security:** To implement authentication, authorization, and access control.
- **JWT (JSON Web Token):** For stateless user authentication and authorization.
- **Java:** The primary programming language for the project.
- **Maven:** For project management and dependency management.
- **MySQL:** For storing user data (depending on the database used).

  ## Usage

**1. Run Application**
   - Run the project.
     
  ```bash
   http://localhost:8080
   ```

**2. Save Username and Password**
  - Save Username and Password for login.
  ```bash
   http://localhost:8080/User
   ```
  ```bash
   {
    "id":   1,
    "username": "SpringSecurity",
    "password": "sp@123"
   }
   ```

![Screenshot 2024-09-12 222303](https://github.com/user-attachments/assets/aed0135b-d5a2-45ff-9496-a3656168f1db)

**3. Check DB**

![Screenshot 2024-09-12 222509](https://github.com/user-attachments/assets/4e0166dc-8b5f-43ee-a46c-b88b8c8689e9)


**4. Login API**
   - Call Login API that sets security context and returns JWT token.
  ```bash
   http://localhost:8080/login
   ```
  ```bash
   {
    "username": "SpringSecurity",
    "password": "sp@123"
  }
   ```

![Screenshot 2024-09-12 222336](https://github.com/user-attachments/assets/58d9e957-8922-4dd5-827e-acaaf550f403)

**5. Student API**
   - Call the Student API by passing the obtained JWT token to test authorization.
  ```bash
  http://localhost:8080/students
   ```

![Screenshot 2024-09-12 225351](https://github.com/user-attachments/assets/99e5e240-9f96-4437-97ae-7737036c6a9f)

## Getting Started

**1. Clone the repository:**

  ```bash
  git clone https://github.com/Yashodhara-04/Spring-Security.git
   ``` 
      
**3. Run the `Main` class:**

  ```bash
  java Main
   ```

**4. Running Application**

   ```bash
   http://localhost:8080
   ```

## Contributing
 If you would like to contribute to this project, please fork the repository and submit a pull request. Ensure that your changes
 are well-tested and documented.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Author

- Yashodhara C H(https://github.com/Yashodhara-04)
