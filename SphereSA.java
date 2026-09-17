import java.util.Scanner;
public static class SphereSA {
    
    public static void getSurfaceArea() {
    public String displayEquation(){
        System.out.println("This is the formula to solve the equation: 4 * PI * r^2");
    }
    public void acceptValues() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the measurement of the radius: ");
        double radius = input.nextDouble();
    }

    double radiusPow = Math.pow(radius, 2);
    
    double result = radiusPow * Math.PI * 4
    return result;
    }
}
