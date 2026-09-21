public class SphereVolume {
//declares radius as a instance that can be accessed from this class
double radius;

    public void getVolume(double radius)
    {
        System.out.println("This is the formula for solving for the volume of a sphere: 4* PI * r^2");
        //declares the radius different from the method parameters
        this.radius = radius;
    }
 

    public double calculateSphereVolume()
    {
        double multipler = 4.0 / 3.0;
        double volume = multipler * (Math.PI * Math.pow(radius, 3));
        return volume;
    }

}

