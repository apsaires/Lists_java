import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("How many employee's will be registered?");
        int numberEmployees = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i<numberEmployees; i++){

            System.out.println();
            System.out.println("Employee #"+ (i+1));
            System.out.print("Id: ");
            Integer number = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(number, name, salary);

            list.add(emp);

        }

        System.out.print("Enter the Employee's Id number who will see the salary incremented: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
        if(pos == null){
            System.out.println("the id does not exist!");
        }else{
            System.out.print("Insert percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).incrementSalary(percent);
        }

        System.out.println();
        System.out.println("Employee list: ");
        for(Employee emp : list) {
            System.out.println(emp);
        }


        sc.close();

    }

    public static Integer position(List<Employee> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumber() == number)
                return i;
        }
        return null;
    }


}