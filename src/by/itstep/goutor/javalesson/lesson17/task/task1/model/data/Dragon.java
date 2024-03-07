package by.itstep.goutor.javalesson.lesson17.task.task1.model.data;

public class Dragon {


    private String name;
    private int age;

    public Dragon(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public Dragon() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;

        }
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name = " + name + '\'' +
                ", age = " + age +
                '}';
    }
}

