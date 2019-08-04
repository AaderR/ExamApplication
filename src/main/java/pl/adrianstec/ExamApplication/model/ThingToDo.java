package pl.adrianstec.ExamApplication.model;

import javax.persistence.*;

@Entity
public class ThingToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public ThingToDo() {
    }

    @OneToOne
    private Car car;

    private String name;

    private boolean isFinish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public ThingToDo(String name, boolean isFinish) {
        this.name = name;
        this.isFinish = isFinish;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String toString() {
        return getName() + " " + isFinish();
    }
}
