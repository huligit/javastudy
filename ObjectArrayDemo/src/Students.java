/**
 * Created by Administrator on 2017/4/9.
 */
public class Students {
    //创建一个学生类
    //学生属性
    String name;
    char gender;
    int age;

    //构造方法
    Students()
    {
        System.out.println("创建了一个学生。。。");
    }

    Students(String name,char gender,int age)
    {
        this();
        this.name=name;
        this.gender=gender;
        this.age=age;
        //System.out.println("姓名："+this.name+",性别："+this.gender+"，年龄"+age);
    }
    public void showIntroduce(){
        System.out.println("姓名："+this.name+",性别："+this.gender+"，年龄"+age);
    }

}
