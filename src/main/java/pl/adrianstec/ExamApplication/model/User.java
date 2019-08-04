package pl.adrianstec.ExamApplication.model;

import java.util.List;

public class User {

    private Integer id;

    private String userName;

    private String password;


    public User(Integer id, String userName, String password, List<Car> cars) {
        this.id = id;
        this.userName = userName;
        this.password = password;

    }
}
