package Kiemtragiuaki.Cau1;

public class ContinuousSignal implements Signal {

    private double[] signalData;  // Dữ liệu tín hiệu liên tục (dạng mảng số thực)

    // Constructor cho ContinuousSignal
    public ContinuousSignal(double[] signalData) {
        this.signalData = signalData;
    }

    @Override
    public void sendSignal(String message) {
        System.out.println("Sending continuous signal with message: " + message);
        // Logic gửi tín hiệu liên tục dựa trên dữ liệu
        System.out.println("Signal data: ");
        for (double value : signalData) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    @Override
    public boolean receiveSignal() {
        System.out.println("Receiving continuous signal...");
        // Logic nhận tín hiệu liên tục, giả sử nhận thành công
        return true;
    }

    // Phương thức đặc biệt cho ContinuousSignal
    public void displaySignalData() {
        System.out.println("Displaying continuous signal data: ");
        for (double value : signalData) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Tạo một mảng tín hiệu liên tục
        double[] signalValues = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7};
        ContinuousSignal continuousSignal = new ContinuousSignal(signalValues);

        // Sử dụng phương thức của giao diện Signal
        continuousSignal.sendSignal("Hello, Continuous Signal!");
        boolean received = continuousSignal.receiveSignal();
        System.out.println("Signal received: " + received);

        // Sử dụng phương thức đặc biệt của ContinuousSignal
        continuousSignal.displaySignalData();
    }
}
