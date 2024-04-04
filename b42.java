public class b42{

    static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        if ((x2 - x1)/(x3 - x1) != (y2 - y1)/(y3 - y1)){
            return true;
        }
        else{
            return false;
        }
    } 
    public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3){
        double a = 0, b = 0, c = 0, p = 0;
        a = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        b = Math.sqrt((x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3));
        c = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
        p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static void main(String [] args){
        if (isTriangle(0,10,2,6,3,7) == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        while (isTriangle(0,10,2,6,3,7) == true){
            System.out.println("Dientich: " + getArea(0,10,2,6,3,7));
            break;
        }
    }
}