package me.portfolio.repository;

import me.portfolio.model.entity.Experience;
import me.portfolio.model.entity.Realisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "projects")
public interface IRealisationRepository extends JpaRepository<Realisation, Long> {
}
