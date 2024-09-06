package Kiemtragiuaki.Cau2;

public class Radar {

    // Phương thức tính tín hiệu x(n) theo công thức [2]
    public double calculateSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (double) n / 15;
        } else {
            return 0;  // Tín hiệu bằng 0 nếu n ngoài khoảng [0, 15]
        }
    }

    // Phương thức phân tích tín hiệu với giá trị n và in ra kết quả
    public void analyzeSignal(int n) {
        double result = calculateSignal(n);
        System.out.println("Signal at n = " + n + " is: " + result);
    }

    public static void main(String[] args) {
        Radar radar = new Radar();

        // Phân tích tín hiệu tại n = 4 theo yêu cầu
        radar.analyzeSignal(4);  
    }
}

