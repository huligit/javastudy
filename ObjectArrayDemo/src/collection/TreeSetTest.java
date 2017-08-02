package collection;

import java.util.TreeSet;

/**
 * Created by Administrator on 2017/7/2.
 */
public class TreeSetTest {
    public static void main(String[] args)
    {
        TreeSet nums=new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        //默认从大到小排序
        System.out.println(nums);
        //输出集合中的第一个元素
        System.out.println(nums.first());
        System.out.println(nums.last());
        System.out.println(nums.tailSet(5));
        System.out.println(nums.headSet(4));
        System.out.println(nums.subSet(-3,5));

    }
}
