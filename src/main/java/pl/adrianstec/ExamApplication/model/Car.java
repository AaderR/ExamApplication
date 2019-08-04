package pl.adrianstec.ExamApplication.model;


import pl.adrianstec.ExamApplication.model.ThingToDo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {

    public Car() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String carName;

    private boolean isFixed;

    private String owner;


    @OneToMany(mappedBy = "car")
    private List<ThingToDo> things = new ArrayList<>();

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public List<ThingToDo> getThings() {
        return things;
    }

    public void setThings(List<ThingToDo> things) {
        this.things = things;
    }

    public Car(String carName, boolean isFixed, List<ThingToDo> things) {
        this.carName = carName;
        this.isFixed = isFixed;
        this.things = things;
    }
    @Override
    public String toString() {
        return getCarName()+" "+ getThings();
    }


}
