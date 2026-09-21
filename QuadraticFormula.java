public class QuadraticFormula {
    double a;
    double b;
    double c;

    public void getNumbers(double a, double b, double c) {
        System.out.println("This is the formula for solving for the roots of a quadratic equation: (-b + sqrt(b^2 - 4ac)/2a) and (-b - sqrt(b^2 - 4ac)/2a)");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calculateRoots() {

        double positiveRoot = (-b + Math.sqrt(b * b - 4 * a * c) / (2 * a));
        double negativeRoot = (-b - Math.sqrt(b * b - 4 * a * c) / (2 * a));

        System.out.println("The positive root is: " + positiveRoot);
        System.out.println("The negative root is: " + negativeRoot);

        return positiveRoot;
    
}
}
