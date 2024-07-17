package me.portfolio.repository;

import me.portfolio.model.entity.Certification;
import me.portfolio.model.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "certifications")
public interface ICertificationRepository extends JpaRepository<Certification, Long> {
}
