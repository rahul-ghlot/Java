public class Employee {
    int id;
    String name;

    Double salary;

    String deptName;

    int age;

    public Employee(int id, String name, Double salary, String deptName, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptName = deptName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deptName=" + deptName +
                ", age=" + age +
                '}';
    }
}
