/**
 * Created by Administrator on 2017/4/9.
 */
public class Test {
    //统计男生人数，女生人数
    public static int getGenderNumber(Students[] stus,char gender) //注意，Students后面要有[]
    {
        int malenumbers=0;//男生人数
        int femalnumbers=0;//女生人数
        for (Students s:stus)
        {
            if (s.gender=='M'||s.gender=='m')
            {
                malenumbers++;
            }
            else if (s.gender=='F'||s.gender=='f')
            {
                femalnumbers++;
            }
        }
        if (gender=='m'||gender=='M')
        {
            return malenumbers;
        }else
        {
            return femalnumbers;
        }
    }

    //统计平均分
    public static int getAverge(Students[] stus)//注意，Students后面要有[]
    {
        int sum=0;//年龄和，注意，总年龄不要用s，会和下面的s一样，报错
        for (Students s:stus)
        {
            sum+=s.age;
        }
        return sum/(stus.length);
    }



    public static void main(String[] args){
        //创建对象组
        Students[] stus={
                new Students("张三",'M',20),
                new Students("张四",'M',19),
                new Students("张五",'M',20),
                new Students("王柳柳",'F',21),
                new Students("刘丽丽",'F',18),
        };
        //强制for循环
        for (Students s:stus)
        {
            s.showIntroduce();
        }
        System.out.println("男生人数："+getGenderNumber(stus,'M'));//getGenderNumber(stus,'M')括号里一地个元素只需要写stus就行了，不要写成Students stus
        System.out.println("女生人数："+getGenderNumber(stus, 'F'));
        System.out.println("平均年龄："+getAverge(stus));
    }
}
