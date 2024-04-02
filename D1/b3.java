/* Bài tập tính khoảng cách
Viết chương trình nhập vào 4 số nguyên x1, y1, x2, y2 từ đối dòng lệnh
Tính và in ra khoảng cách Euclide giữa hai điểm (x1, y1) và (x2, y2).
Kết quả được làm tròn đến 2 số phần thập phân, sử dụng công thức Math.round(a * 100.0) /
100.0 để làm tròn số a */


public class b3 {
    public static void main(String[] args){
        
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        double x = 0;
        x1 = Integer.parseInt(args[0]);
        y1 = Integer.parseInt(args[1]);
        x2 = Integer.parseInt(args[2]);
        y2 = Integer.parseInt(args[3]);
        x  = Math.round(Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)*100.0)/100.0);
        System.out.println(x);
    }
}