package Lee;

//定义一个shape抽象类
public abstract class Shape {
    {
        System.out.println("执行shape初始化块");
    }
    private String color;
    //定义计算周长的抽象方法
    public abstract double calPerimeter();
    //定义返回形状的抽象方法
    public abstract String getType();
    //定义构造器，供子类调用
    public Shape(){};
    public Shape(String color)
    {
        System.out.println("执行shape的构造器");
        this.color=color;

    }
    //color的setter方法
    public void setColor(String color)
    {
        this.color=color;
    }
    //color的getter方法
    public String getColor()
    {
        return this.color;
    }

}
