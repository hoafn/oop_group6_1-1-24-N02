package Kiemtragiuaki.Cau1;
// Yêu cầu 2
public class DiscreteSignal1 implements Signal {

    private int[] signalData;

    // Constructor cho DiscreteSignal
    public DiscreteSignal1(int[] signalData) {
        this.signalData = signalData;
    }

    @Override
    public void sendSignal(String message) {
        System.out.println("Sending discrete signal with message: " + message);
        // Logic gửi tín hiệu rời rạc dựa trên dữ liệu
        System.out.println("Signal data: ");
        for (int bit : signalData) {
            System.out.print(bit + " ");
        }
        System.out.println();
    }

    @Override
    public boolean receiveSignal() {
        System.out.println("Receiving discrete signal...");
        // Logic nhận tín hiệu rời rạc, giả sử luôn nhận thành công
        return true;
    }

    // Phương thức đặc biệt cho DiscreteSignal
    public void displaySignalData() {
        System.out.println("Displaying discrete signal data: ");
        for (int bit : signalData) {
            System.out.print(bit + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] signalBits = {1, 0, 1, 1, 0, 0, 1};
        DiscreteSignal1 discreteSignal = new DiscreteSignal1(signalBits);

        // Sử dụng phương thức của giao diện Signal
        discreteSignal.sendSignal("Hello, Discrete Signal!");
        boolean received = discreteSignal.receiveSignal();
        System.out.println("Signal received: " + received);

        // Sử dụng phương thức đặc biệt của DiscreteSignal
        discreteSignal.displaySignalData();
    }
}
