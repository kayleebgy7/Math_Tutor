

import java.util.Scanner;
public class MathTutor {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //declares questionType as a integer
        int questionType;

        System.out.println("Welcome to Math Tutor, please choose a question!");
        System.out.println("Choose a problem type: ");
        //allows the code to run multiple times as long as the while statement is true
        do{
        System.out.println("Cylinder Volume(1), Pythagorean Theorm(2), Sphere Volume(3), Sphere Surface Area(4), Quadratic Formula(5), and Exit(6)");    
        //assigns the questionType to the next integer
        questionType = input.nextInt();
        //takes the user input of the question type to 
        if (questionType == 1){
            CylinderVolume problem = new CylinderVolume();
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            System.out.print("Enter the height: ");
            double height = input.nextDouble();
            problem.getCylinderVolume(radius, height);
            System.out.println("The volume of the cylinder is: " + problem.calculateVolume());
        }
         else if (questionType == 2){
            PythagoreanTheorem problem = new PythagoreanTheorem();
            System.out.print("Enter a side a: ");
            double a = input.nextDouble();

            System.out.print("Enter a side b: ");
            double b = input.nextDouble();
            problem.solvePythagorean(a, b);

            System.out.println("The hypotenuse is: " + problem.getHypotenuse());
            
        }
        else if (questionType == 3){
            SphereVolume problem = new SphereVolume();
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            problem.getVolume(radius);

            System.out.println("The volume of the sphere is: " + problem.calculateSphereVolume());
        }
        else if (questionType == 4){
            SphereSA problem = new SphereSA();
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            problem.getRadius(radius);

            System.out.println("The surface area of the sphere is: " + problem.calculateSurfaceArea());
        }
        else if (questionType == 5){
            QuadraticFormula problem = new QuadraticFormula();
             System.out.println("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.println("Enter the value of b:");
        double b = input.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();
        
        problem.getNumbers(a,b,c);
        System.out.println("The positive root is: " + problem.calculateRoots());
            
        }
        else{
            System.out.println("You have exited the program, thank you for using Math Tutor!");
        }

} while (questionType != 6);
input.close();
}

}