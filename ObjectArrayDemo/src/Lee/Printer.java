package Lee;
import java.lang.String;

/**
 * Created by Administrator on 2017/8/3.
 */
public class Printer implements Output,Product {
    private String[] printData=new String[MAX_CACHE_LINE];
    //记录当前需要打印的作业数
    private int dataNumber=0;
    //重写接口Output中的out方法
    public void out()
    {
        //只要有作业就继续打印
        while(dataNumber>0)
        {
            System.out.println("打印机打印："+printData[0]);
            //把作业队列整体前移一位，并将剩下的作业数减1
            System.arraycopy(printData,1,printData,0,--dataNumber);
        }
    }
    public void getData(String msg)
    {
        if (dataNumber>MAX_CACHE_LINE) {
            System.out.println("输出队列已满，添加失败");
        }
            else
            {
                //把打印数据添加到队列里，已保存的数据的数量加1
                printData[dataNumber++]=msg;
            }
    }
    //重写接口Product中的方法
    public int getProduceTime(){
        return 45;
    }
    public static void main(String[] args){
        //创建一个Printer对象，当成output使用
        Output o=new Printer();
        o.getData("疯狂java讲义");
        o.out();
        //创建一个Printer对象，当成Product使用
        Product p=new Printer();
        System.out.println(p.getProduceTime());
    }


}
