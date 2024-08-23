package WebSocket.example.One_on_One.Chat.Application.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {
    List<User> findAllByStatus(UserStatus userStatus);
}
