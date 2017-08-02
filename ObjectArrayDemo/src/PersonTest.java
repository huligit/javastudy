/**
 * Created by Administrator on 2017/6/6.
 */
class Person
{
    public String name;
    public static int eyeNum;
}
public class PersonTest
{
    public static void main(String[] args)
        {
            //
            System.out.println(Person.eyeNum);
            //System.out.println(Person.name);
            Person p1=new Person();
            System.out.println(p1.eyeNum+p1.name);
            p1.name="张三";
            p1.eyeNum=10;
            System.out.println(p1.eyeNum+p1.name);
            System.out.println(Person.eyeNum);
            Person p2=new Person();
            System.out.println(p2.eyeNum+p2.name);
            System.out.println(Person.eyeNum);




        }
}

