package me.portfolio.repository;

import me.portfolio.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "posts")
public interface IPostRepository extends JpaRepository<Post, Long> {
}
