/* Viết chương trình theo mô tả: Đầu vào là 3 số nguyên nhận từ đối dòng lệnh, kết quả là 3 số
theo thứ tự tăng dần in trên 1 dòng, các số cách nhau bởi 01 khoảng trống. (dùng phương thức
println in kết quả) */


public class b1 {
    public static void main(String[] args){
        
        int num1 = 0, num2 = 0, num3 = 0;
        int min = 0, max = 0, mid = 0;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        num3 = Integer.parseInt(args[2]);
        max = Math.max(num1, Math.max(num2,num3));
        min = Math.min(num1, Math.min(num2,num3));
        mid = num1 + num2 + num3 - min -max;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}


