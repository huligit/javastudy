package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/2.
 */
public class MapTest {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put("轻量级JAVA EE企业应用实践",11);
        map.put("疯狂java讲义",22);
        map.put("疯狂Android讲义",33);
        map.put("疯狂ios讲义",53);
        System.out.println(map);
        System.out.println(map.put("疯狂java讲义",12));
        System.out.println(map);
        System.out.println("包含指定key："+map.containsKey("疯狂java讲义"));
        System.out.println("包含指定value："+map.containsValue(22));
        for (Object key:map.keySet())
        {
            System.out.println(key+"->"+map.get(key));
        }
        map.remove("疯狂ios讲义");
        System.out.println(map);



    }
}
