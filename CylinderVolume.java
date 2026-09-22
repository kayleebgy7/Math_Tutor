/*Title: CylinderVolume
* Author: Kaylee Begay
* Purpose: uses user input to find the cylinder volume and out print the answer
*
* Resource: None
*/
public class CylinderVolume{
    //declares radius and height as instance variables
    private double radius;
    private double height;
   //getCylinderVolume contains the parameters that are collected in the Math Tutor class
    public void getCylinderVolume(double radius, double height) {

        //displays the formula to find the volume of a cylinder
        System.out.println("This is the formula to find the volume of a cylinder: (PI * r^2) * H");
        //declares the instances apart of the class
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
   //squares the radius
    double radiusSquared = Math.pow(radius, 2);
    //declares the answer of the equation as answer
    double answer = Math.PI * radiusSquared * height;
    
    return answer;

    
    }

}