package me.portfolio.repository;

import me.portfolio.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users")
public interface IUserRepository extends JpaRepository<User, Long> {
}
