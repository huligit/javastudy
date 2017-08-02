package collection;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 2017/7/1.
 */
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is=IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
        System.out.println("is所有元素中的最大值："+is.max().getAsInt());
        //System.out.println("is所有元素中的最小值："+is.min().getAsInt());
       // newIs.forEach(System.out::println);
    }
}
