

public class b32{

    static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        if ((x2 - x1)/(x3 - x1) != (y2 - y1)/(y3 - y1)){
            return true;
        }
        else{
            return false;
        }
    } 
    static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        double a = 0, b = 0, c = 0;
        a = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        b = Math.sqrt((x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3));
        c = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
        if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)){
            return true;
        }
        else{
            return false;
        }
    } 
    public static void main(String [] args){
        if (isTriangle(1,3,2,5,4,7) == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        while (isTriangle(1,3,2,5,4,7) == true){
            if (isRightTriangle(1,3,2,5,4,7) == true){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
            break;
        }
    }
}