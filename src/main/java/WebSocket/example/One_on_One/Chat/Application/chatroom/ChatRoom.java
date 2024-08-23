package WebSocket.example.One_on_One.Chat.Application.chatroom;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ChatRoom {
    @Id
    private String Id;
    private String chatId;
    private String senderId;
    private String recipientId;
}
