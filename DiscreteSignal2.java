package Kiemtragiuaki.Cau2;

public class DiscreteSignal2 implements Signal {
    private double[] signalData;  // Mảng chứa dữ liệu tín hiệu rời rạc x(n)

    // Constructor cho DiscreteSignal
    public DiscreteSignal2(double[] signalData) {
        this.signalData = signalData;
    }

    // Phương thức gửi tín hiệu
    @Override
    public void sendSignal(String message) {
        System.out.println("Sending discrete signal with message: " + message);
        // Hiển thị tín hiệu rời rạc
        System.out.println("Signal data: ");
        for (double value : signalData) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Phương thức nhận tín hiệu
    @Override
    public boolean receiveSignal() {
        System.out.println("Receiving discrete signal...");
        // Giả lập việc nhận tín hiệu luôn thành công
        return true;
    }

    // Hàm xung đơn vị δ(n)
    public int deltaFunction(int n) {
        return (n == 0) ? 1 : 0;  // Trả về 1 nếu n == 0, ngược lại trả về 0
    }

    // Tính tín hiệu rời rạc x(k)
    public double calculateDiscreteSignal(int k) {
        double result = 0;
        for (int n = 0; n < signalData.length; n++) {
            result += signalData[n] * deltaFunction(k - n);
        }
        return result;
    }

    // Phương thức hiển thị giá trị tín hiệu tại thời điểm k
    public void displaySignalAt(int k) {
        double value = calculateDiscreteSignal(k);
        System.out.println("Signal at k = " + k + " is: " + value);
    }

    public static void main(String[] args) {
        // Mảng tín hiệu rời rạc x(n)
        double[] signalValues = {1.0, 2.0, 3.0, 4.0, 5.0};
        DiscreteSignal2 discreteSignal = new DiscreteSignal2(signalValues);

        // Sử dụng phương thức gửi tín hiệu
        discreteSignal.sendSignal("Test Discrete Signal");

        // Tính và hiển thị tín hiệu tại một thời điểm cụ thể k
        int k = 2;
        discreteSignal.displaySignalAt(k);
    }
}
