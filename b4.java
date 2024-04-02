/* Viết chương trình cho phép đọc 3 tham đối từ đối dòng lệnh và trả về kết quả là true nếu 3
giá trị bằng nhau và là false nếu ngược lại.
- Chú ý:
1. Giá trị của tham đối là kiểu xâu ký tự (String) chứ không bắt buộc phải là số.
2. Kết quả được in ra bằng lệnh println() và chỉ in kết quả (true hoặc false), không kèm theo
thông báo gì khác. */


public class b4 {
    public static void main(String[] args){
        
        if(args[0].equals(args[1]) && args[2].equals(args[1]) && args[0].equals(args[2]))
            System.out.println("True");
        else 
            System.out.println("False");
    }
}
      