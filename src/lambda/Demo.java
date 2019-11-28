package lambda;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * @author qinshaokang
 * @description:
 * @date 2019-11-27 16:09
 */
public class Demo {

    public void test(Consumer consumer){
        consumer.accept(1);
    }
    public static void main(String[] args) {
        Map map = new ConcurrentHashMap();



    }

}
