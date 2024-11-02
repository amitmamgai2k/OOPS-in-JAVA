class ChildThread extends Thread {
    public ChildThread(String name) {
        super(name); 
    }
    @Override
    public void run() {
        System.out.println(getName() + " is starting...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " operation " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }

        System.out.println(getName() + " is complete.");
    }
}
public class Question10 {
    public static void main(String[] args) {
        System.out.println("Main thread is starting");
        ChildThread childThread = new ChildThread("Child");
        childThread.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main thread operation " + i);
            try {
                Thread.sleep(700); // Pause for 700 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread is complete.");
    }
}

