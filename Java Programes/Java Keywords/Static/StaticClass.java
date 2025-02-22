class MathUtil {
    //Inner Class
    public static class Geometry {
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        double area = MathUtil.Geometry.calculateArea(2);
        System.out.println("Area: " + area);
    }
}