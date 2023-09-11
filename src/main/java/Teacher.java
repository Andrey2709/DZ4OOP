public class Teacher {
    private String name;
    private int salary;
    private int postCode;

    public Teacher(String name, int salary, int postCode) {
        this.name = name;
        this.salary = salary;
        this.postCode = postCode;
    }

    public int getSalary() {
        return salary;
    }

    public int getPostCode() {
        return postCode;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", postCode=" + postCode +
                '}';
    }
}
