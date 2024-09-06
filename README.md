# One-On-One Chat App

A real-time messaging application for private, one-on-one conversations, built using Spring Boot.

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

This is a One-on-One Chat Application built using Spring Boot and WebSocket, with Docker for containerization, MongoDB for data storage. The application allows users to chat with each other in real-time.

## Features

- **Real-Time Messaging:** Utilizes WebSocket to facilitate real-time communication between users.
- **Chat History:** Stores and retrieves chat history from MongoDB.
- **User details:** Stores connected user details.

## Technologies Used

- **Spring Boot:** For creating the REST API and WebSocket endpoints.
- **WebSocket:** For real-time communication.
- **MongoDB:** To store user data and chat messages.
- **Docker:** For containerizing the application and MongoDB.
- **Swagger:** To design, build, document, and consume REST APIs.
- **HTML:** For structuring the user interface.
- **CSS:** For styling the user interface and ensuring responsiveness.
- **JavaScript:** For client-side scripting and handling real-time chat interactions.

  ## Usage

**1. Run Application**
   - The project has been successfully deployed on Render. Kindly use the below URL.
     
   ```bash
   https://one-on-one-chatapplication.onrender.com/
   ```

**2. Add a nickname and full name**
- Begin by entering your nickname and full name. You may also invite a friend to do the same or open another tab to add a new user.

![image](https://github.com/user-attachments/assets/6e7ad9b7-ff07-4c17-bd93-28deb37fc009)

**3. Start chatting**
- When the second user joins the chat, he will be able to see all the other connected users.
- Begin texting with other connected users in real time.
   
![image](https://github.com/user-attachments/assets/0b59e08b-abdf-4a52-8f91-952d3c5b54d6)


## Getting Started

**1. Clone the repository:**

  ```bash
  https://github.com/Yashodhara-04/One-On-One_ChatApp.git
   ``` 

**2. Add Connection string:**
   - Create a new database with the name specified in the `application.config` file. You can also modify the database name in the `application.config` if needed. I have used MongoDB Atlas in my application, but feel free to use any database of your choice and configure it accordingly.

      
**4. Run the `Main` class:**

  ```bash
  java Main
   ```

**5. Running Application**

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
