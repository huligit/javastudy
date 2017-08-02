package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Administrator on 2017/7/1.
 */
public class CollectionTest  {
    public static void main(String[] args){
        Collection c=new ArrayList();
        c.add("孙悟空");//添加元素
        c.add(6);//集合不能放基本类型的值，但是java支持自动封装
        System.out.println("c集合元素的个数为："+c.size());
        c.remove(6);//删除6
        System.out.println("c集合元素的个数为："+c.size());
        System.out.println("c集合包含元素：孙悟空："+c.contains("孙悟空"));
        c.add("java实践");
        System.out.println("c集合元素为："+c);
        Collection books=new HashSet();
        books.add("java实践");
        books.add("疯狂java讲义");
        books.forEach(obj -> System.out.println(obj));

        System.out.println("c集合包含books集合："+c.containsAll(books));
        c.removeAll(books);
        System.out.println("c集合元素为："+c);
        c.clear();
        System.out.println("c集合元素为："+c);
        books.retainAll(c);
        System.out.println("books集合元素为："+books);




    }
}
