package pl.sda.javaldz6.project.serviceImplementation;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javaldz6.project.model.Continent;
import pl.sda.javaldz6.project.repository.ContinentJpaRepository;
import pl.sda.javaldz6.project.service.ContinentService;

import java.util.List;

@Service
public class ContinentServiceImpl implements ContinentService {
    private Logger log;

    @Autowired
    private ContinentJpaRepository continentRepository;

    @Override
    public void addContinent(String name) {

        continentRepository.save(new Continent(name));
    }

    @Override
    public Continent getContinentById(long continentId) {

        return continentRepository.findById(continentId).get();
    }

    @Override
    public Continent modifyContinent(Continent continent) {

        return continentRepository.save(continent);
    }

    @Override
    public boolean deleteContinent(long continentId) {
        Continent continent = getContinentById(continentId);
        continentRepository.delete(continent);
        return true;
    }

    @Override
    public List<Continent> getAll() {

        return continentRepository.findAll();
    }

}
