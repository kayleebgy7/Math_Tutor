/*Title: PythagoreanTheorem
* Author: Kaylee Begay
* Purpose: uses the values inputed by the user to get the length of the hypotenus
*
* Resources: None
*/

public class PythagoreanTheorem {
    //declares a and b as instance variables
    private double a;
    private double b;
     //contains parameters that are inputed from the MathTutor class
    public void solvePythagorean(double a, double b){
        //outprints the formula
        System.out.println("This is the formula : a^2 + b^2 = c^2");
         //declares the instances apart of the class
        this.a = a;
        this.b = b;
}
    

public double getHypotenuse(){
    //the equations filled in with the inputed values and returns the answer
    double answer =  Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    return answer;

}
}