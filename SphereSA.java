import java.util.Scanner;
public static class SphereSA {
    public static void main(String[] args){
        double answer = getSurfaceArea();
        System.out.println(answer);
    }
   
    public String displayEquation(){
        System.out.println("This is the formula to solve the equation: 4 * PI * r^2");
        return "";
    }
    public void acceptValues() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the measurement of the radius: ");
        double radius = input.nextDouble();
        double radiusPow = Math.pow(radius, 2);
    }
    public double calculateSurfaceArea(double radiusPow){
    double result = radiusPow * Math.PI * 4;
    return result;

    }
    }


