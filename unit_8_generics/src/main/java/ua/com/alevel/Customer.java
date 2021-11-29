package ua.com.alevel;

public class Customer extends BaseType {

    private String name;
    private Integer age;

    public Customer() { }

    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Customer(String id, String name, Integer age) {
        this(name, age);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
