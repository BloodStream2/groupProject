package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Continent;

import java.util.List;

public interface ContinentService {
    void addContinent(String name);

    Continent getContinentById(int index);

    Continent modifyContinent(int index, Continent continent);

    boolean deleteContinent(int index);

    void init();

    void close();

    List<Continent> getAll();

    Continent getRestContinent();
}
