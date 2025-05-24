public class Employee {
    int id;
    String name;

    Double salary;

    String deptName;

    int age;

    String gender;

    String city;

    public Employee(int id, String name, Double salary, String deptName, int age, String gender, String city) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptName = deptName;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deptName=" + deptName +
                ", age=" + age +
                ", gender=" + gender +
                ", city=" + city +
                '}';
    }
}
