package lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author qinshaokang
 * @description:
 * @date 2019-11-28 15:31
 */
public class TryLockDemo {
    List<Integer> list = new ArrayList<>();
    private Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {

        TryLockDemo demo = new TryLockDemo();
        Thread thread = new Thread(demo::insert);
        thread.interrupt();
        new Thread(demo::insert).start();
        Thread.sleep(1000);
        new Thread(demo::insert).start();
    }

    public void insert(){
        if(lock.tryLock()){
            try{
                lock.lock();
                for (int i = 0; i < 5; i++) {
                    list.add(i);
                }
                System.out.println(Thread.currentThread()+"得到了锁...");
            }catch (Exception e){

            }finally {
                lock.unlock();
                lock.unlock();
                System.out.println(Thread.currentThread() + "释放了锁...");
            }
        }else{
            System.out.println("获取锁失败...");
        }


    }
}
