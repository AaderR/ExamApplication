package pl.adrianstec.ExamApplication.repository;

import org.springframework.data.repository.CrudRepository;
import pl.adrianstec.ExamApplication.model.Car;

public interface CarRepository extends CrudRepository<Car,Integer> {

   // List<Car> findCarsByName(@Param("carName") String carName);


}
