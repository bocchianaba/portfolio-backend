package me.portfolio.repository;

import me.portfolio.model.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comments")
public interface ICommentRepository extends JpaRepository<Comment, Long> {
}
