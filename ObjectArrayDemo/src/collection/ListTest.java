package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Administrator on 2017/7/2.
 */
public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList<>();
        books.add("轻量级JAVA EE企业应用实践");
        books.add("疯狂java讲义");
        books.add("疯狂Android讲义");
        System.out.println(books);
        //将新字符串插入到第二个位置
        books.add(1,"疯狂Ajax讲义");
        System.out.println(books);
        for (int i=1;i<books.size();i++)
        {
            System.out.println(books.get(i));
        }
    }
}
