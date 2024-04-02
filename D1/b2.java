/* Bài tập đổi đơn vị
Chúng ta biết 01 inch = 2.54 cm.
Viết chương trình ConvertUnit1.java cho phép nhập một số thực x qua đối dòng lệnh, sau đó
coi x là chiều dài tính bằng mét, hãy in ra số đo y của chiều dài đó tính bằng inches
Kết quả được làm tròn đến 2 số phần thập phân, sử dụng công thức Math.round(a * 100.0) /
100.0 để làm tròn số a */


public class b2 {
    public static void main(String[] args){
        
        double x = 0;
            x = Double.parseDouble(args[0]);
            x = Math.round( (x * 100 / 2.54) * 100.0 ) / 100.0;
        System.out.println(x);
    }
}