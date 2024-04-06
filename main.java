class Shape {
    public double Dientich() {
        return 0.0;
    }
    public double Chuvi() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double rong;
    private double dai;
    public Rectangle(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    @Override
    public double Dientich() {
        return this.rong * this.dai;
    }
    @Override
    public double Chuvi() {
        return 2 * (this.rong + this.dai);
    }
}

class Circle extends Shape {
    private double bankinh;
    public Circle(double bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public double Dientich() {
        return 3.14 * this.bankinh * this.bankinh;
    }
    @Override
    public double Chuvi() {
        return 2 * 3.14 * this.bankinh;
    }
}

class Triangle extends Shape {
    private double canh1;
    private double canh2;
    private double canh3;
    public Triangle(double canh1, double canh2, double canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    @Override
    public double Dientich() {
        double p = (this.canh1 + this.canh2 + this.canh3) / 2;
        return Math.sqrt(p * (p - this.canh1) * (p - this.canh2) * (p - this.canh3));
    }
    @Override
    public double Chuvi() {
        return this.canh1 + this.canh2 + this.canh3;
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
