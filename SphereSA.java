/*Title: Math_Tutor
* Purpose: uses user input to calculate the surface area of a sphere
*
*
*
*/

public class SphereSA {
   //declares radius as a instance variable
   private double radius;
    //contains parameters that are inputed from the MathTutor class
    public void getRadius(double radius){
       //declares the instances apart of the class
       this.radius = radius;
       //outprints the formula
       System.out.println("This is the formula for solving for the surface area of a sphere: 4 * PI * r^2");

    }
    public double calculateSurfaceArea() {
   //the equations filled in with the inputed values
    double radiusPow = Math.pow(radius, 2);
   //return answer
    return radiusPow * Math.PI * 4;

    }
    }


