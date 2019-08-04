package pl.adrianstec.ExamApplication.repository;

import org.springframework.data.repository.CrudRepository;
import pl.adrianstec.ExamApplication.model.ThingToDo;

public interface ThingToDoRepository extends CrudRepository<ThingToDo,Integer> {


}
