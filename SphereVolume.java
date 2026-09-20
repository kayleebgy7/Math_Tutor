import java.util.Scanner;
public class SphereVolume {
public static void main(String[] args){
double answer =
}
 System.out.println("This is the formula for solving for the volume of a sphere: 4* PI * r^2");

 Scanner input = new Scanner(System.in);

 System.out.println("Enter the length of the radius: ");
 double radius = input.nextDouble();
double mutlipler = 4.0 / 3.0;
double volume = multipler * (Math.PI * Math.pow(radius, 3));

System.out.println("what is your answer to the problem?: ");
double userAnswer = input.nextDouble();

if (userAnswer == volume)
{
    System.out.println("Your answer to the problem is correct!");
}
else
{
    System.out.println("Your answer to the problem is incorrect. Try again");
}


input.close();
}


