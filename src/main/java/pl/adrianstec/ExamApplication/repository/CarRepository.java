package pl.adrianstec.ExamApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.adrianstec.ExamApplication.model.Car;

import java.util.List;

public interface CarRepository extends CrudRepository<Car,Integer> {

    List<Car> findCarsByName(@Param("carName") String carName);


}
