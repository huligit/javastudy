package collection;



//import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;


public class DiamondTest  {

    public static void main(String[] args) {
        Map<String,List<String>> schoolsInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        schools.add("斜月三星洞");
        schools.add("西天取经路");
        schoolsInfo.put("孙悟空", schools);
        schoolsInfo.forEach((key, value) -> System.out.println(key + "->" + value));


    }
}