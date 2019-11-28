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
public class Demo {
    List<Integer> list = new ArrayList<>();
    private Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        new Thread(demo::insert).start();
        new Thread(demo::insert).start();
    }

    public void insert(){
        try{
            lock.lock();
            for (int i = 0; i < 5; i++) {
                list.add(i);
            }
            System.out.println(Thread.currentThread()+"得到了锁...");
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println(Thread.currentThread() + "释放了锁...");
        }

    }
}
