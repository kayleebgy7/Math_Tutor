public class AreaOfSector {
    double radius;
    double angle;

    public void getNumbers(double radius, double angle) {
        System.out.println("This is the formula for solving for the area of a sector: (a/360) * PI * r^2");
        this.radius = radius;
        this.angle = angle;

    }

    public double calculateArea() {

        double degreeOfSector = angle/360.0;
        double radiusSquared = Math.pow(radius, 2);
        double answer = degreeOfSector * Math.PI * radiusSquared;
        
        
        return answer;
    }
    }