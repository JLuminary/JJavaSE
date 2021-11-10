package cn.tedu.map;

import java.util.*;

/*本类用于测试Map接口*/
public class MapDome {
    public static void main(String[] args) {
        //1.创建map对象
        /*map中的数据要符合映射规则，需要同时指定K和V的数据类型
         * 至于K和V具体指定什么类型，取决于业务要求*/
        Map<Integer, String> map = new HashMap<>();
        map.put(9527, "白骨精");
        map.put(9528, "黑熊精");
        map.put(9529, "鲤鱼精");
        map.put(9530, "黄梅大王");
        map.put(9531, "黑熊精");
        map.put(9527, "女儿国国王");

        System.out.println(map.get(9527));
        System.out.println(map);
        /*1.Map中存放着的都是无序的数据
         * 2.Map中的value可以重复--比如我们可以存两个黑熊精
         * 3.Map中的key不可一重复，如果重复，新value会把旧value覆盖掉
         * 比如女儿国国王和白骨精key都是9527，白骨精会被覆盖*/

        //3.进行方法测试
//        map.clear();//清空集合
//        System.out.println(map);//{}
        System.out.println(map.equals("黄梅大王"));//false,判断“黄梅大王”是否与集合中相等
        System.out.println(map.isEmpty());//false,判断是否为空
        System.out.println(map.size());//5，获取集合中键值对的个数

        //判断Map集合中是否包含指定的Key-键
        System.out.println(map.containsKey(9527));//true
        System.out.println(map.containsValue("白骨精"));//false


        //将Map集合中的所有value值放入Collection集合中
        //Collection<values>中的Type的类型，取决于map中value的类型
        Collection<String> values = map.values();
        System.out.println(values);//[女儿国国王, 黑熊精, 鲤鱼精, 黄梅大王, 黑熊精]


        //4.map集合的迭代方式一
        /*我们想要遍历map集合的数据，但是map集合本身没有自己的迭代器
         * 所以需要先将map集合转为Set集合以后，在使用set的迭代器及逆行迭代
         * 代码：Set<Key> = map.keySet();
         * 作用：将map中所有的Key值取出，存入set集合，慈湖set泛型是Integer*/
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //5.map的迭代方式二
        /*遍历map集合，需要先把map集合转换为set集合
         * 本方案是把一对键值堪称一个Entry
         * 代码：Map.Entry<key,value> = map.entrySet();
         * Map.Entry<k,v>,这里是Map.Entry<Integer,String>*/

        Set<Map.Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set2.iterator();
        while (it2.hasNext()) {
//            System.out.println(it2.next());//可以直接打印
            //方式二：接下来本轮循环获取到的next
            Map.Entry<Integer, String> entry= it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("{["+key+"="+value+"]}");
        }
    }
}