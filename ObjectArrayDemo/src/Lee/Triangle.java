package Lee;

//定义三角形类实现Shape类中的所有抽象方法
public class Triangle extends Shape{
    //定义三角形的三边
    private double a;
    private double b;
    private double c;
    //构造器
    public Triangle(String color,double a,double b,double c)
    {
        super(color);//调用父类的构造器
        this.setSides(a,b,c);

    }
    public void setSides(double a,double b,double c)
    {
        if (a>=b+c||b>=a+c||c>=a+b)
        {
            System.out.println("两边之和必须大于第三边");
            return;
        }
        this.a=a;
        this.b=b;
        this.c=c;
    }
    //重写shape类中计算周长的方法
    public double calPerimeter()
    {
        return a+b+c;
    }
    //重写shape类中返回形状的抽象方法
    public String getType()
    {
        return getColor()+"三角形";
    }
    public static void main(String args[])
    {
        Shape s1=new Triangle("黑色",2,2,3);
        System.out.println(s1.calPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.getType());


    }

}
