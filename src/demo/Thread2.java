package demo;

/**
 * @author qinshaokang
 * @description: TODO
 * @date 2019-11-11 16:55
 */
public class Thread2 implements Runnable {
    Object lock1 = new Object();
    Object lock2 = new Object();

    public Thread2(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        while (true){
            synchronized (lock2){
                System.out.println(Thread.currentThread()+"等待释放锁1...");
                synchronized (lock1){

                }
            }
        }
    }
}
