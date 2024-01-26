package study.graph.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import study.graph.user.entity.User;
import study.graph.user.repository.UserRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @QueryMapping
    public User getMember(@Argument Long id){
        return userRepository.findById(id).get();
    }

    @QueryMapping
    public List<User> getMembers(){
        return userRepository.findAll();
    }

    @MutationMapping
    public User save(@Argument String name, @Argument String email){
        User user = User.builder()
                .name(name)
                .email(email)
                .build();
        return userRepository.save(user);
    }
}
