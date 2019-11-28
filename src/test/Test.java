package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qinshaokang
 * @description:
 * @date 2019-11-19 17:41
 */
public class Test implements Cloneable{
    private int age;


    public static void main(String[] args) throws CloneNotSupportedException {
        Object o = new Object();
        Test test = new Test();
        Test clone = (Test)test.clone();

        test.age = 1;
        clone.age = 2;
        System.out.println(test.age);
        System.out.println(clone.age );


    }

}
