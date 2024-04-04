



public class b52{

    static boolean isTriangle (double a, double b, double c){
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)){
            return true;
        }
        else{
            return false;
        }
    } 
    static boolean isRightTriangle(double a, double b, double c){
        if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        if (isTriangle(1,3,7) == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        while (isTriangle(1,3,7) == true){
            if (isRightTriangle(1,3,7) == true){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
            break;
        }
    }
}