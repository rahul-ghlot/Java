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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
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
