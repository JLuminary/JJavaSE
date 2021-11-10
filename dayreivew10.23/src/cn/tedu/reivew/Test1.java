package cn.tedu.reivew;
//测试List
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("大娃");
        l1.add("二娃");
        l1.add("三娃");
        l1.add("四娃");
        l1.add("五娃");
        l1.add("六娃");
        l1.add("七娃");
        System.out.println(l1.contains("二娃"));//判断是否有二娃
        System.out.println(l1.remove("七娃"));//移除七娃
        System.out.println(l1.size());//判断元素个数
        System.out.println(l1.isEmpty());//判断是否为空
        System.out.println(Arrays.toString(l1.toArray()));//打印数组
        List<String> l2=new ArrayList<>();
        l2.add("小蝴蝶");
        l2.add("蛇精");
        l2.add("蜈蚣精");
        System.out.println(l2);
        System.out.println(l1.indexOf("三娃"));
        System.out.println(l1);
        System.out.println(l1.addAll(l2));
        System.out.println(l1);
        System.out.println(l1.addAll(2,l2));
        System.out.println(l1);
        System.out.println(l1.get(5));
        System.out.println(l1);
        System.out.println(l1.set(4,"螳螂精"));
        System.out.println(l1);

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }//普通的for方法
            for (String s:l1
                 ) {
                System.out.println(s);
            }//高效的for方法
        Iterator<String> it = l1.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
        }//迭代方法
    }

 }


