package lambda;

import java.util.List;

/**
 * @author qinshaokang
 * @description:
 * @date 2019-11-27 16:07
 */
@FunctionalInterface
public interface IFunctionSum<T extends Number> {
    T sum();

}
