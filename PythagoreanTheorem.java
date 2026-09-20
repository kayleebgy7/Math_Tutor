import java.util.Scanner;
public class PythagoreanTheorem {
    public static void solvePythagorean(){
        System.out.println("This is the formula : a^2 + b^2 = c^2");
        Scanner input = new Scanner(System.in);

    System.out.println("If you are missing the leg of the triangle enter 1, if you are missing the hypotenuse enter 2: ");

    int missing = input.nextInt();

    int leg = 1;


    if (missing == leg)
    {
        getLeg();
    }
    else
    {
        //continue to find hypotenuse
       getHypotenuse();
    }
   
    input.close();


}
public static double getLeg(){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length of the other leg of the triangle: ");
    double a = input.nextDouble();

    System.out.println("Enter the length of the hypotenuse: ");
    double c = input.nextDouble();

    double leg = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
    input.close();
    return leg;
    
}
public static double getHypotenuse(){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length of one leg of the triangle: ");
    double a = input.nextDouble();

    System.out.println("Enter the length of the other leg of the triangle: ");
    double b = input.nextDouble();

    double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    input.close();
    return hypotenuse;

}
}