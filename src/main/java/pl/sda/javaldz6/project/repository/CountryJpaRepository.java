package pl.sda.javaldz6.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.javaldz6.project.model.Country;

@Repository
public interface CountryJpaRepository extends JpaRepository<Country, Long> {
}
