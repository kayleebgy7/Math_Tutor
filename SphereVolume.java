/*Title: Math_Tutor
* Author's Name: Kaylee Begay
* Purpose: To calculate the volume of a sphere by using input from the user, like the radius, to 
* output an answer
*
*Resource: NONE
*/

public class SphereVolume {
//declares radius as a instance that can be accessed from this class
    private double radius;
    //contains parameters that are inputed from the MathTutor class
    public void getVolume(double radius)
    {   
        //outprints the formula
        System.out.println("This is the formula for solving for the volume of a sphere: 4* PI * r^2");
         //declares the instances apart of the class
        this.radius = radius;
    }
 

    public double calculateSphereVolume()
    {
        double multipler = 4.0 / 3.0;
        //the equations filled in with the inputed values
        double volume = multipler * (Math.PI * Math.pow(radius, 3));
        //returns the volume
        return volume;
    }

}

