package _42_MultiThread.Les28_Practice_2;

public class GuessNumberThread implements Runnable {
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
            System.out.println(Thread.currentThread().getName() + " đoán số " + randomNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (userNumber != randomNumber);
        System.out.println(Thread.currentThread().getName() + " đã đoán số: " + randomNumber + " - trong: " + count + " lần.");
    }
}
