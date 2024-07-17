package me.portfolio.repository;

import me.portfolio.model.entity.Experience;
import me.portfolio.model.entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "courses")
public interface IFormationRepository extends JpaRepository<Formation, Long> {
}
