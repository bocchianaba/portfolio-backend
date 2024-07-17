package me.portfolio.repository;

import me.portfolio.model.entity.ToolUsed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tools")
public interface IToolUsedRepository extends JpaRepository<ToolUsed, Long> {
}
