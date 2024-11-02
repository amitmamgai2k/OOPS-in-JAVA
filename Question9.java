public class Question9 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Default Name of main thread: " + mainThread.getName());
        System.out.println("Default Priority of main thread: " + mainThread.getPriority());
        mainThread.setName("Task1");
        mainThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Updated Name of main thread: " + mainThread.getName());
        System.out.println("Updated Priority of main thread: " + mainThread.getPriority());
        System.out.println("Main thread is performing operation printing Number from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number " + i);
        }
        System.out.println("Main thread operations complete.");
    }
}



    

