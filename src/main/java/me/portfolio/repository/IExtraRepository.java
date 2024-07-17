package me.portfolio.repository;

import me.portfolio.model.entity.Experience;
import me.portfolio.model.entity.Extra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "extras")
public interface IExtraRepository extends JpaRepository<Extra, Long> {
}
