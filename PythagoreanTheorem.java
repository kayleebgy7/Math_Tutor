
public class PythagoreanTheorem {
    private double a;
    private double b;
    public void solvePythagorean(double a, double b){
        System.out.println("This is the formula : a^2 + b^2 = c^2");
        this.a = a;
        this.b = b;
}
    

public double getHypotenuse(){

    return  Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

}
}