

public class ThreadsInJava {
        public static void main(String[] args) {
            System.out.println("Behold, Programme starting");
            MyThreads t1=new MyThreads(),t2 = new MyThreads(), t3=new MyThreads(),t4=new MyThreads();
            t1.setName("Cat");
            t2.setName("Dog");
            t3.setName("Hyrax");
            t4.setName("Parrot");
            t1.setPriority(Thread.MAX_PRIORITY); //10 
            t2.setPriority(Thread.NORM_PRIORITY); //5
            t3.setPriority(Thread.MIN_PRIORITY); //1
            t4.setPriority(7);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
}
class MyThreads extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" starting operation with priority "+Thread.currentThread().getPriority());
        
        try {
            Thread.sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            } 
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" says "+i);
        }
    }
}

