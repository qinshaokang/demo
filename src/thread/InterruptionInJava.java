package thread;

/**
 * @author qinshaokang
 * @description:
 * @date 2019-11-28 17:42
 */
public class InterruptionInJava implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        Thread testThread = new Thread(new InterruptionInJava(),"InterruptionInJava");
        //start thread
        testThread.start();
        Thread.sleep(1000);
        //interrupt thread
        testThread.interrupt();

        System.out.println("main end");

    }

    @Override
    public void run() {
        while(true){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("Yes,I am interruted,but I am still running");

            }else{
                System.out.println("not yet interrupted");
            }
        }
    }
}