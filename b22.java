/* Viết chương trình ConvertUnit3.java cho phép nhập một số thực x qua đối dòng lệnh, sau
đó coi x là nhiệt độ Celsius, in ra số đo y của nhiệt độ đó tính theo thang Fahrenheit theo
công thức: C/5 = (F-32)/9 (C – nhiệt độ theo thang Celsius; F – nhiệt độ theo
thang Fahrenheit).
Kết quả được làm tròn đến 2 số phần thập phân, sử dụng lệnh in có định dạng printf để
in kết quả.
Hướng dẫn: Sử dụng phương thức printf để in số thực x với <m> chữ số, trong đó <n>
chữ số ở phần thập phân có mẫu như sau
System.out.printf("%m.nf", x ); */

public class b22{
    public static void main(String[] args){

        double x = 0, y = 0;
        x = Double.parseDouble(args[0]);
        y = x * 1.8 + 32;
        System.out.printf("%10.2f", y );
    }
}