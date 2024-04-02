/* : Chương trình cho phép nhận 03 số thực từ đối dòng lệnh (command line arguments) và
tính trung bình cộng của chúng.
Sử dụng hàm: Double.parseDouble(String strNumber) để chuyển một xâu dạng số thực thành
một giá trị double.
Kết quả được in ra màn hình. */

public class b5 {
    public static void main(String[] args){
        
        double x = 0, num1 = 0, num2 = 0, num3 = 0;
        num1 = Double.parseDouble(args[0]);
        num2 = Double.parseDouble(args[1]);
        num3 = Double.parseDouble(args[2]);
        x = ((num1)+(num2)+(num3))/3;
        System.out.println(x);
    }
}