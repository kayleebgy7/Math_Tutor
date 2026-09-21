
public class CylinderVolume{
    //declares radius and height as doubles that are apart of the class
    double radius;
    double height;
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