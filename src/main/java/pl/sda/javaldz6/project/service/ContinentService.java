package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Continent;

import java.util.List;

public interface ContinentService {

    void addContinent(String name);

    Continent getContinentById(long continentId);

    Continent modifyContinent(Continent continent);

    boolean deleteContinent(long continentId);

    List<Continent> getAll();

    Continent getRestContinent();
}
