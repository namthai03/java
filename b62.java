public class b62 {
    public static void main(String[] args){
        
        double s = 0, v0 = 0, a = 0, delta = 0, t1 = 0, t2 = 0;
        s = Double.parseDouble(args[0]);
        v0 = Double.parseDouble(args[1]);
        a = Double.parseDouble(args[2]);
        delta = v0 * v0 + 2 * a * s;
        if ((s > 0) && (v0 > 0) && (a > 0)){
            if (delta > 0){
                t1 = (double) ((-v0 + Math.sqrt(delta)) / (2 * a));
                t2 = (double) ((-v0 - Math.sqrt(delta)) / (2 * a));
                if (t1 > 0){
                    System.out.println("t =" + t1);
                }
                else {
                    System.out.println("t =" + t2);
                }
            }
        }
        else {
            System.out.println("-1");
        }
    }
}