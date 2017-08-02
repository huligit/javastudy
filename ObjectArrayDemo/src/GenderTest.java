/**
 * Created by Administrator on 2017/6/25.
 */
public class GenderTest {
    public static void main(String[] args)
    {
       // Gender g=Enum.valueOf(Gender.class,"FEMALE");
        Gender g= Gender.valueOf("FEMALE");
        g.setName("男");
        System.out.println(g+"代表:"+g.getName());
    }
}
