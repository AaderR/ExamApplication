package pl.adrianstec.ExamApplication.model;

public class Admin {

    private Integer id;

    private String adminName;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Admin(Integer id, String adminName, String password) {
        this.id = id;
        this.adminName = adminName;
        this.password = password;
    }


}
