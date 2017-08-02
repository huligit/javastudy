package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


/**
 * Created by Administrator on 2017/7/1.
 */
public class InteratorTest  {
    public static void main(String[] args){
        Collection books=new HashSet();
        books.add("轻量级JAVA EE企业应用实践");
        books.add("疯狂java讲义");
        books.add("疯狂Android讲义");
        //foreach方法遍历，lambda表达式
        books.forEach(obj -> System.out.println(obj));

        //使用Interator遍历集合
        Iterator it=books.iterator();
        //System.out.println("#####"+it);
        //it.forEachRemaining(obj -> System.out.println(obj));
       /* while(it.hasNext())
        {
            String book=(String)it.next();
            System.out.println("##"+book);
            if (book.equals("疯狂java讲义"))
            {
                it.remove();
            }
            book="测试子串";

        }*/







    }
}
