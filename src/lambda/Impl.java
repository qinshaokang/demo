package lambda;

import java.util.function.Consumer;

/**
 * @author qinshaokang
 * @description:
 * @date 2019-11-27 18:10
 */
public class Impl implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
