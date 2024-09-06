package Kiemtragiuaki.Cau1;

// Yêu cầu 1
public interface Signal {
    // Phương thức để gửi tín hiệu với một thông điệp
    void sendSignal(String message);

    // Phương thức để nhận tín hiệu, trả về true nếu nhận thành công
    boolean receiveSignal();
}
