
public class CylinderVolume{
    private double radius;
    private double height;

    public void getCylinderVolume(double radius, double height) {

   
        System.out.println("This is the formula to find the volume of a cylinder: (PI * r^2) * H");
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
   
    double radiusSquared = Math.pow(radius, 2);
    double answer = Math.PI * radiusSquared * height;
    
    return answer;

    }

}