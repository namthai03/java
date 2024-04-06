class Shape {
    public double Dientich() {
        return 0.0;
    }
    public double Chuvi() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double Dientich() {
        return this.width * this.length;
    }
    @Override
    public double Chuvi() {
        return 2 * (this.width + this.length);
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Dientich() {
        return 3.14 * this.radius * this.radius;
    }
    @Override
    public double Chuvi() {
        return 2 * 3.14 * this.radius;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double Dientich() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }
    @Override
    public double Chuvi() {
        return this.side1 + this.side2 + this.side3;
    }
}

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(2, 5, 4);
        System.out.println("Hinh chu nhat - Dien tich: " + rectangle.Dientich() + ", Chu vi: " + rectangle.Chuvi());
        System.out.println("Hinh tron - Dien tich: " + circle.Dientich() + ", Chu vi: " + circle.Chuvi());
        System.out.println("Hinh tam giac - Dien tich: " + triangle.Dientich() + ", Chu vi: " + triangle.Chuvi());
    }
}
