package me.portfolio.repository;

import me.portfolio.model.entity.Experience;
import me.portfolio.model.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "informations")
public interface IInformationRepository extends JpaRepository<Information, Long> {
}
