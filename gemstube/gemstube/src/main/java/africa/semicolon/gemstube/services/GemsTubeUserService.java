package africa.semicolon.gemstube.services;

import africa.semicolon.gemstube.dtos.request.RegisterRequest;
import africa.semicolon.gemstube.dtos.response.RegisterResponse;
import africa.semicolon.gemstube.models.User;
import org.springframework.stereotype.Service;
import africa.semicolon.gemstube.repositories.UserRepository;


@Service
public class GemsTubeUserService implements UserService {
    private final UserRepository userRepository;
    public GemsTubeUserService(UserRepository userRepository){
        this.userRepository  = userRepository;
    }
    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        User user = new User();
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        User savedUser = userRepository.save(user);
        return new RegisterResponse(savedUser.getId());
    }
}
