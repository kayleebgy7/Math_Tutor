

import java.util.Scanner;
public class MathTutor {
public static void main(String[] args){
        System.out.println("Welcome to Math Tutor, please choose a question!");
        System.out.println("Questions: Cylinder Volume(a), Pythagorean Theorm(b), Sphere Volume(c), and Sphere Surface Area(d)");
    Scanner input = new Scanner(System.in);
        String questionType = input.nextLine();

        if (questionType.equals("a")){
             Cylinder_Volume cylinderVolume = new Cylinder_Volume();
              cylinderVolume.getVolume();
        }
         else if (questionType.equals("b")){
            PythagoreanTheorem pythagoreanTheorem = new PythagoreanTheorem();
            pythagoreanTheorem.solvePythagorean();
        }
        else if (questionType.equals("c")){
            SphereVolume sphereVolume = new SphereVolume();
            sphereVolume.getVolume();
        }
        else if (questionType.equals("d")){
            SphereSA sphereSurfaceArea = new SphereSA();
            sphereSurfaceArea.getSurfaceArea();
        }
        else if (questionType.equal("e")){
            QuadraticFormula quadraticFormula = new QuadraticFormula();
            quadraticFormula.getQuadraticFormula();
        }
        else{
            System.out.println("Invalid input, please try again");
        }
input.close();
}
}