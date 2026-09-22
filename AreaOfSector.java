/*Title: AreaOfSector
* Author: Kaylee Begay
* Purpose: Gets user input to find the area of a sector
*
* Resources: NONE
*/
public class AreaOfSector {
    //declares radius and angle as instance variables
    private double radius;
    private double angle;
    //contains parameters that are inputed from the MathTutor class
    public void getNumbers(double radius, double angle) {
        //outprints the formula
        System.out.println("This is the formula for solving for the area of a sector: (a/360) * PI * r^2");
        //declares the instances apart of the class
        this.radius = radius;
        this.angle = angle;

    }

    public double calculateArea() {

        double degreeOfSector = angle/360.0;
        double radiusSquared = Math.pow(radius, 2);
        //the equations filled in with the inputed values
        double answer = degreeOfSector * Math.PI * radiusSquared;
        
        //returns the answer
        return answer;
    }
    }