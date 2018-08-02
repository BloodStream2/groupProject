package pl.sda.javaldz6.project.serviceImplementation;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javaldz6.project.model.TypesOfMeals;
import pl.sda.javaldz6.project.repository.TypesOfMealsJpaRepository;
import pl.sda.javaldz6.project.service.TypesOfMealsService;

import java.util.List;

@Service
public class TypesOfMealsImpl implements TypesOfMealsService {

    private Logger log;

    @Autowired
    private TypesOfMealsJpaRepository typesOfMealsRepository;

    @Override
    public void addTypeOfMeal(String name, String description) {
        typesOfMealsRepository.save(new TypesOfMeals(name, description));
    }

    @Override
    public TypesOfMeals getTypeOfMealById(long typesOfMealsId) {
        TypesOfMeals typesOfMeals = typesOfMealsRepository.findById(typesOfMealsId).get();
        return typesOfMeals;
    }

    @Override
    public TypesOfMeals modifyTypeOfMeal(TypesOfMeals typeOfMeal) {
        return typesOfMealsRepository.save(typeOfMeal);
    }

    @Override
    public boolean deleteTypeOfMeal(long typesOfMealsId) {
        TypesOfMeals typesOfMeals = getTypeOfMealById(typesOfMealsId);
        typesOfMealsRepository.delete(typesOfMeals);
        return true;
    }

    @Override
    public List<TypesOfMeals> getAll() {
        return typesOfMealsRepository.findAll();
    }
}
