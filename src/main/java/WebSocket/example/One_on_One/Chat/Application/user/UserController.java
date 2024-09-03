package WebSocket.example.One_on_One.Chat.Application.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @MessageMapping("/user.addUser")
    @SendTo("/user/topic")
    public User addUser(@Payload User user)
    {
        userService.saveUser(user);
        return user;
    }

    @MessageMapping("/user.disconnectUser")
    @SendTo("/user/topic")
    public User disconnectUser(@Payload User user)
    {
        userService.disconnectUser(user);
        return user;
    }

    @Operation(
            tags = "GET Users",
            description = "Gets all the online user details",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200Ok"
                    ),
                    @ApiResponse(
                            description = "Error!! Api not found",
                            responseCode = "404Not Found"
                    )
            }
    )
    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAllUser()
    {
        return new ResponseEntity<>(userService.getConnectedUser(), HttpStatus.OK);

    }

}
