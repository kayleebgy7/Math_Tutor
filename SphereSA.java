public class SphereSA {
   private double radius;

    public void getRadius(double radius){
       this.radius = radius;
       System.out.println("This is the formula for solving for the surface area of a sphere: 4 * PI * r^2");

    }
    public double calculateSurfaceArea() {
    double radiusPow = Math.pow(radius, 2);
    return radiusPow * Math.PI * 4;

    }
    }


