package demo;

/**
 * @author qinshaokang
 * @description: 
 * @date 2019-11-11 16:53
 */
public class Thread1 implements Runnable {
    Object lock1 = new Object();
    Object lock2 = new Object();

    public Thread1(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        while (true){
            synchronized (lock1){
                System.out.println(Thread.currentThread()+"等待释放锁2...");
                synchronized (lock2){

                }
            }
        }
    }
}
