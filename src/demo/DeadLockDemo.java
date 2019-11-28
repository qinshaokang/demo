package demo;

/**
 * @author qinshaokang
 * @description: TODO
 * @date 2019-11-11 16:47
 */
public class DeadLockDemo {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        new Thread(new Thread1(lock1,lock2)).start();
        new Thread(new Thread2(lock1,lock2)).start();
    }

//    private void test1(){
//        System.out.println("test1 want lock1");
//        synchronized (lock1){
//            System.out.println("test1 want lock2");
//            synchronized (lock2){
//                System.out.println("test1 get lock1 lock2");
//            }
//        }
//    }
//
//    private void test2(){
//        System.out.println("test2 want lock2");
//        synchronized (lock2){
//            System.out.println("test2 want lock1");
//            synchronized (lock1){
//                System.out.println("test1 get lock1 lock2");
//            }
//        }
//    }
}
