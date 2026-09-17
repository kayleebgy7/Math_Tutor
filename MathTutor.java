import java.util.Scanner;

public class MathTutor {
public static void main(String[] args){
        System.out.println("Welcome to Math Tutor, please choose a question!");
        System.out.println("Questions: Cylinder Volume(a), Pythagorean Theorm(b), Sphere Volume(c), Sphere Surface Area(d), and Quadratic Formula(e)");
    Scanner input = new Scanner(System.in);
        String questionType = input.nextLine();

        if (questionType.equalsIgnoreCase("a")){
           Cylinder_Volume cylinderVolume = new Cylinder_Volume();
              cylinderVolume.getVolume();
        } else if (questionType.equalsIgnoreCase("b")){
            Pythagorean_Theorem pythagoreanTheorem = new Pythagorean_Theorem();
            pythagoreanTheorem.getHypotenuse();
        }
        else if (questionType.equalsIgnoreCase("c")){
            SphereVolume sphereVolume = new SphereVolume();
            sphereVolume.getVolume();
        }
        else if (questionType.equalsIgnoreCase("d")){
            SphereSA sphereSurfaceArea = new SphereSA();
            sphereSurfaceArea.getSurfaceArea();
        }
        else if (questionType.equalsIgnoreCase("e")){
            QuadraticFormula quadraticFormula = new QuadraticFormula();
            quadraticFormula.getQuadraticFormula();
        }
        else{
            System.out.println("Invalid input, please try again");
        }
input.close();
}
}
