package WebSocket.example.One_on_One.Chat.Application.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition( info = @Info(
        title = "Chat API",
        description = "CRUD Operation",
        summary = "This is a chat API",
        termsOfService = "T&S",
        contact = @Contact(
                name = "Yashodhara C H",
                email = "yashodhara.chowkar@gmail.com"
        ),
        license = @License(
                name = "License"
        ),
        version = "v1"
    ),
     servers = {
             @Server(
                     description = "Dev",
                     url = "http://localhost:8080"
             ),
             @Server(
                     description = "Test",
                     url = "http://localhost:8080"
             )
     }
)
public class OpenApiConfig {
}
