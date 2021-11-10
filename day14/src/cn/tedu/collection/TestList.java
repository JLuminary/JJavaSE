package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//本类用于测试List接口
public class TestList {
    public static void main(String[] args) {
        //1.创建List多态对象，注意List是一个接口，不可实例化
        List<String> list=new ArrayList<>();
        //2.继承自Collection
        list.add("大娃");//向list集合当中存入数据
        list.add("二娃");
        list.add("三娃");
        list.add("四娃");
        list.add("五娃");
        list.add("六娃");
        list.add("七娃");
        System.out.println(list);//打印查看集合当中的元素
//        list.clear();
//        System.out.println(list);
        System.out.println(list.contains("三娃"));//true
        System.out.println(list.equals("三娃"));//false
        System.out.println(list.isEmpty());//fasle
        System.out.println(list.remove("七娃"));
        System.out.println(list);//[大娃, 二娃, 三娃, 四娃, 五娃, 六娃]
        System.out.println(list.size());//6
        System.out.println(Arrays.toString(list.toArray()));//[大娃, 二娃, 三娃, 四娃, 五娃, 六娃]

        //3.测试List自己的方法，由于List有顺序，所以可以根据索引/下标来操作集合中的元素
        list.add("小蝴蝶");
        list.add(0,"蛇精");
        list.add(1,"小蝴蝶");
        list.add(2,"蜈蚣精");
        System.out.println(list);
        System.out.println(list.indexOf("小蝴蝶"));
        System.out.println(list.lastIndexOf("小蝴蝶"));

        System.out.println(list.remove(5));//根据指定的索引值删除集合当中的元素
        System.out.println(list);
        System.out.println(list.get(3));//获取集合中指定索引处的元素
        System.out.println(list.set(4,"蝎子精"));
        list.set(4,"蝎子精");
        System.out.println(list);

        //4.创建集合间的操作
        List<String> list2=new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println(list2);

        System.out.println(list.addAll(list2));
        System.out.println(list);
        System.out.println(list.addAll(1,list2));
        System.out.println(list);
        System.out.println(list.containsAll(list2));
        System.out.println(list);
        System.out.println(list.removeAll(list2));
        System.out.println(list);

        //



    }
}
