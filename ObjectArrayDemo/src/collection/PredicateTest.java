package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2017/7/1.
 */
public class PredicateTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("轻量级JAVA EE企业应用实践");
        books.add("疯狂java讲义");
        books.add("疯狂Android讲义");
        System.out.println(calAll(books,ele -> ((String)ele).contains("疯狂")));
        System.out.println(calAll(books,ele -> ((String)ele).contains("java")));

    }
    public static int calAll(Collection books, Predicate p)
    {
        int total=0;
        for (Object obj:books) {
            if (p.test(obj))

            {
                total++;
            }
        }
        return total;
    }
}
