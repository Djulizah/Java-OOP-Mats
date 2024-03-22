public class Circle {
    double radius;

    //menghitung luas
    public double getArea(){
        return Math.PI * radius * radius;
    }
    //menghitung keliling
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        //koinA
        Circle koinA = new Circle(21);
        System.out.println(koinA.getArea());

        //koinB
        Circle koinB = new Circle(0);
        koinB.setRadius(25);
        System.out.println(koinB.getPerimeter());
    }
    
}
