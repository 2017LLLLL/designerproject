package entity;

import java.util.List;

/*
* 实体类
* */
public class UserAgent {

    private Integer age;

    private String name;

    // 权限列表必备
    private List<String> role;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public UserAgent(Integer age, String name, List<String> role) {
        this.age = age;
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserAgent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
