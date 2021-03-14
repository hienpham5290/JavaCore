package _42_MultiThread.Les27_Practice_1;

public class GuessNumberThread extends Thread {
    private int userNumber;
    private int count = 0;

    public GuessNumberThread(int userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public void run() {
        int randomNumber;
        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println(getName() + " đoán số " + randomNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (randomNumber != userNumber);
        System.out.println(getName() + " đã đoán ra số: " + randomNumber + "  - trong: " + count + " lần đếm.");
    }
}
