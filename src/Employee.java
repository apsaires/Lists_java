public class Employee {

    private Integer number;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer number, String name, Double salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void incrementSalary (double percentage){
        salary += salary * percentage/100;
    }

    public String toString() {
        return number + "; " + name + ", " + String.format("%.2f" , salary);
    }

}
