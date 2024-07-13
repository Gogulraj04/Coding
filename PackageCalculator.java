import Calculator.CalcMethods;   
public class PackageCalculator {
    public static void main(String[] args) {
        CalcMethods calc=new CalcMethods();
        System.out.println();
        System.out.println("Add= "+calc.Add(2, 4));
        System.out.println("Sub= "+calc.Sub(4, 2));
        System.out.println("Div= "+calc.Div(4, 2));
        System.out.println("Mul= "+calc.Mult(2, 4));
        System.out.println("Mod= "+calc.Mod(3, 2));

    }
}
