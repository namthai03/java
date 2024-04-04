
public class b12 {
    public static void main(String[] args){

        double x = 0, y = 0;
        x = Double.parseDouble(args[0]);
        y = x * 1000 / 1609;
        System.out.printf("%10.2f",y);

    }
}