import java.util.Scanner;
public class QuadraticFormula {
    public double getQuadraticFormula() {
        System.out.println("This is the formula for solving for the roots of a quadratic equation: (-b + sqrt(b^2 - 4ac)/2a) and (-b - sqrt(b^2 - 4ac)/2a)");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.println("Enter the value of b:");
        double b = input.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();

        double positiveRoot = (-b + Math.sqrt(b * b - 4 * a * c) / (2 * a));
        double negativeRoot = (-b - Math.sqrt(b * b - 4 * a * c) / (2 * a));

        System.out.println("The positive root is: " + positiveRoot);
        System.out.println("The negative root is: " + negativeRoot);
        input.close();

        return positiveRoot;
    
}
}
