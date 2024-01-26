package study.graph.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.graphql.data.GraphQlRepository;
import study.graph.user.entity.User;

@GraphQlRepository
public interface UserRepository extends JpaRepository<User,Long> {
}
