import Salary.SalaryMethods;
public class PackageSlararyImplementation {
    public static void main(String[] args) {
        System.out.println();
        SalaryMethods obj=new SalaryMethods();
        obj.setSalary(1000);
        obj.getSalary();
        obj.incresaseSalary(1000);
        obj.getSalary();
        obj.DeduceSalary(500);
        obj.getSalary();
    }
}
