/**
 * Created by Administrator on 2017/6/25.
 */
public class EnumTest {
    public void judge(EnumSeason s) {
        switch (s) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }

    }

    public static void main(String[] args) {
        for (EnumSeason s : EnumSeason.values()) {
            System.out.println(s);
        }
        new EnumTest().judge(EnumSeason.SUMMER);
    }
}
