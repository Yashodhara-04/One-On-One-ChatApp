# One-On-One Chat App

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

## Introduction

This is a One-on-One Chat Application built using Spring Boot and WebSocket, with Docker for containerization, MongoDB for data storage, and Mongo Express for database management. The application allows users to chat with each other in real time.

## Features

- **Real-Time Messaging:** Utilizes WebSocket to facilitate real-time communication between users.
- **Chat History:** Stores and retrieves chat history from MongoDB.
- **Database Management:** Use Mongo Express for managing MongoDB data through a web interface.

## Technologies Used

- **Spring Boot:** For creating the REST API and WebSocket endpoints.
- **WebSocket:** For real-time communication.
- **MongoDB:** To store user data and chat messages.
- **Mongo Express:** For managing MongoDB data via a web interface.
- **Docker:** For containerizing the application and MongoDB.
- **HTML:** For structuring the user interface.
- **CSS:** For styling the user interface and ensuring responsiveness.
- **JavaScript:** For client-side scripting and handling real-time chat interactions.

## Getting Started

1. Add nickname and fullname.
       Start by adding your nickname and full name within the application.

![image](https://github.com/user-attachments/assets/6e7ad9b7-ff07-4c17-bd93-28deb37fc009)

2. Start chatting.
       Begin chatting with other connected users in real time.
   
![image](https://github.com/user-attachments/assets/0b59e08b-abdf-4a52-8f91-952d3c5b54d6)

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/Yashodhara-04/One-On-One_ChatApp.git
    ```
 
2. Start the Docker Containers

     ```bash
    docker-compose up --build
    ```

4. Run the `Main` class:

    ```bash
    java Main
    ```

5. Running Application
    Create a database with the name specified in the `application.config`. You can also change the database name in the `application.config` file if needed.
  
   ```bash
   Mongo Express: http://localhost:8081 (for managing MongoDB data)
   ```

   ```bash
   Chat Application: http://localhost:8080
   ```

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. Ensure that your changes are well-tested and documented.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

- Yashodhara C H(https://github.com/yourusername)
