package WebSocket.example.One_on_One.Chat.Application.user;

import WebSocket.example.One_on_One.Chat.Application.chat.ChatMessage;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository repository;
    private final ChatMessage chatMessage;

    public void saveUser(User user)
    {
        user.setStatus(UserStatus.ONLINE);
        repository.save(user);
    }

    public void disconnectUser(User user)
    {
        User onlineUser = repository.findById(user.getNickName()).orElse(null);
        if(onlineUser != null)
        {
            user.setStatus(UserStatus.OFFLINE);
            repository.save(user);
        }
    }

    public List<User> getConnectedUser()
    {
        return repository.findAllByStatus(UserStatus.ONLINE);
    }
}
