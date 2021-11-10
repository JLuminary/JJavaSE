package cn.tedu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dome {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(9527, "白骨精");
        map.put(9528, "黑熊精");
        map.put(9529, "鲤鱼精");
        map.put(9530, "黄梅大王");
        map.put(9531, "黑熊精");
        map.put(9527, "女儿国国王");

        System.out.println(map);
        //遍历
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Set<Map.Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set2.iterator();
        while(it2.hasNext()){
//            System.out.println(it2.next());
            Map.Entry<Integer, String> next = it2.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println("********"+key+"="+value+"*****");
        }
    }
}
