package collection;

import java.util.Collection;
import java.util.HashSet;


/**
 * Created by Administrator on 2017/7/1.
 */
public class CollectionStream {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("轻量级JAVA EE企业应用实践");
        books.add("疯狂java讲义");
        books.add("疯狂Android讲义");
        System.out.println(books.stream().filter(ele->((String)ele).contains("疯狂")).count());
    }
}
