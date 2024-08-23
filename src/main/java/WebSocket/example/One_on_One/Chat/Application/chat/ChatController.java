package WebSocket.example.One_on_One.Chat.Application.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final ChatMessageService chatMessageService;
    private final SimpMessagingTemplate messagingTemplate;

    @GetMapping("/chat/{senderId}/{recipientId}")
    public ResponseEntity<List<ChatMessage>> getChatMessage(
            @PathVariable("senderId") String senderId,
            @PathVariable("recipientId") String recipientId)
    {
        return ResponseEntity.ok(chatMessageService.findChatMessages(senderId,recipientId));
    }

    @MessageMapping("/chat")
    public void processMessage(@Payload ChatMessage chatMessage) {
    ChatMessage savedMsg = chatMessageService.save(chatMessage);
    messagingTemplate.convertAndSendToUser(
            chatMessage.getRecipientId(), "/queue/messages",
            new ChatNotification(
                    savedMsg.getId(),
                    savedMsg.getSenderId(),
                    savedMsg.getRecipientId(),
                    savedMsg.getMessage()
            )
    );
    }
}
