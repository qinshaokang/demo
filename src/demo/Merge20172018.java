package demo;

/**
 * @author qinshaokang
 * @description: TODO
 * @date 2019-11-14 17:47
 */

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Merge20172018 {
    public static void main(String[] args) throws IOException {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {

            }
        };

        List<Single> list = new LinkedList<Single>();
        Single s4 = new Single( "20160302", "20160401" );
        Single s = new Single( "20160101", "20160201" );
        Single s1 = new Single("20160111", "20160121" );
        Single s2 = new Single( "20160301", "20160401" );
        Single s3 = new Single("20160301", "20160321" );
        list.add(s4);
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        merge(list);

    }

    // 对已经用开始日期start初排序的list进行交集合并处理
    public static void merge(List<Single> list) {
        Collections.sort(list, new Comparator());

        for (int i = 0; i < list.size() - 1; i++) {
            Single outer;
            Single inner;
            for (int j = i + 1; j < list.size(); j++) {
                outer = list.get(i);
                inner = list.get(j);
                String start = outer.start;
                String end = outer.end;
                String start2 = inner.start;
                String end2 = inner.end;
                if (end.compareTo(start2) >= 0 && end.compareTo(end2) <= 0) {
                    outer.end = end2;
                    list.set(i, outer);
                    list.remove(j);
                    j--;
                } else if (end.compareTo(end2) >= 0 || start.compareTo(end2) == 0) {
                    list.remove(j);
                    j--;
                }
            }
        }
        for (Single single : list) // 輸出操作
            System.out.println(single);
    }
}

class Single {
    String start;
    String end;

    public Single(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String toString() {
        return start + "," + end;
    }

}

class Comparator implements java.util.Comparator<Single> {

    @Override
    public int compare(Single o1, Single o2) {
        return o1.start.compareTo(o2.start) > 0 ? 1 : -1;
    }

}
