package me.portfolio.repository;

import me.portfolio.model.entity.Competence;
import me.portfolio.model.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "competences")
public interface ICompetenceRepository extends JpaRepository<Competence, Long> {
}
