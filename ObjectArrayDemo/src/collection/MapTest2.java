package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/2.
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put("疯狂java讲义",22);
        map.put("疯狂ios讲义",33);
        map.put("疯狂ajax讲义",53);
        System.out.println(map);
        map.replace("疯狂xml讲义",10);
        System.out.println(map);


    }
}
