/*Title: Math_Tutor
* Author: Kaylee Begay
* Purpose: asks the user which question they would like to have solves and go to that class
*
* Resources: Code AI
*/

import java.util.Scanner;
public class MathTutor {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //declares questionType as a integer
        int questionType;

        System.out.println("Welcome to Math Tutor, please choose a question!");
        do{
        System.out.println("Choose a problem type: ");
        //allows the code to run multiple times as long as the while statement is true
        System.out.println("Cylinder Volume(1), Pythagorean Theorm(2), Sphere Volume(3), Sphere Surface Area(4), Area of the Sector(5), and Exit(6)");    
        //assigns the questionType to the next integer
        questionType = input.nextInt();
        //takes the user input of the question type to run the specific method
        if (questionType == 1){
            //creates object of the class
            CylinderVolume problem = new CylinderVolume();
            //asks for user input
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            System.out.print("Enter the height: ");
            double height = input.nextDouble();
            //pushes radius and height as parameters to the getCylinderVolume class
            problem.getCylinderVolume(radius, height);
            //returns the answer from the calculateVolume method
            System.out.println("The volume of the cylinder is: " + problem.calculateVolume());
        }
         else if (questionType == 2){
            //creates object of the class
            PythagoreanTheorem problem = new PythagoreanTheorem();
            //asks for user input
            System.out.print("Enter a side a: ");
            double a = input.nextDouble();

            System.out.print("Enter a side b: ");
            double b = input.nextDouble();
            //pushes an argument to the solvePythagorean method
            problem.solvePythagorean(a, b);
            //returns the answer for the getHypothenuse method
            System.out.println("The hypotenuse is: " + problem.getHypotenuse());
            
        }
        else if (questionType == 3){
            //creates object of the class
            SphereVolume problem = new SphereVolume();
            //asks for user input
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            //assigns an agrument to the getVolume method
            problem.getVolume(radius);
            //returns the answer from the calculateSphereVolume method
            System.out.println("The volume of the sphere is: " + problem.calculateSphereVolume());
        }
        else if (questionType == 4){
            //create an object of the class
            SphereSA problem = new SphereSA();
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            //assigns radius to the parameters for the getRadius method
            problem.getRadius(radius);
            //returns the answer
            System.out.println("The surface area of the sphere is: " + problem.calculateSurfaceArea());
        }
        else if (questionType == 5)
        {
            //creates an object of the class
            AreaOfSector problem = new AreaOfSector();
            //asks for user input
             System.out.print("Enter the value of the radius: ");
        double radius = input.nextDouble();
            System.out.print("Enter the degrees of the angle of the sector: ");
            double angle = input.nextDouble();
        //assigns the parameters to the getNumbers method
        problem.getNumbers(radius, angle);
        //outprints the answer from the calculateArea method in the AreaOfSector class
        System.out.println("The area of a sector is " + problem.calculateArea());
            
        }
        else if (questionType == 6)
        {
            //ends the program when the user inputs the number 6
            System.out.println("You have exited the program, thank you for using Math Tutor!");
           
        }
        else 
        {
            //asks the user to put in another value that corrlates to a question
            System.out.println("Input is invaild, please input another value.");
        }

} while (questionType != 6);
//closes the scanner object
input.close();
}

}