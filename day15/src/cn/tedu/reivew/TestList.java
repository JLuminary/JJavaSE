package cn.tedu.reivew;

import java.util.*;

/*复写继承自Collection与List独有的方法*/
public class TestList {
    public static <list> void main(String[] args) {
        //1.创建多态对象
        Collection<String> list1 = new ArrayList();
        List<String> list = new ArrayList<>();
        //2.向list集合添加元素
        list.add("大娃");
        list.add("二娃");
        list.add("三娃");
        list.add("四娃");
        list.add("五娃");
        list.add("六娃");
        list.add("七娃");
        System.out.println(list);//打印查看添加的所有数据
//        list.clear();
//        System.out.println(list);//清空集合
        System.out.println(list.contains("三娃"));//true 判断是否包含此元素
        System.out.println(list.equals("三娃"));//false
        System.out.println(list.hashCode());//返回的是哈希码的值
        System.out.println(list.isEmpty());//判断集合是否为空
        System.out.println(list.remove("三娃"));
        System.out.println(list);//移除此元素
        System.out.println(list.size());//6，获取元素个数
        System.out.println(Arrays.toString(list.toArray()));//获取元素数组

        //创建第二个集合
        List<String> list2 = new ArrayList<>();
        //向几个中添加元素
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println(list2);
        System.out.println(list.addAll(list2));//将list2的所有元素添加到list集合中
        System.out.println(list);
        System.out.println(list.containsAll(list2));//判断集合list里是否包含list2集合的所有元素
        System.out.println(list.retainAll(list2));
        System.out.println(list);
        System.out.println(list.removeAll(list2));//移除集合list中list2 的所有元素
        System.out.println(list);

        //测试list独有的方法
        list.add("大娃");
        list.add("二娃");
        list.add("三娃");
        list.add("四娃");
        list.add("五娃");
        list.add("六娃");
        list.add("七娃");
        list.add(1,"蛇精");
        list.add(5,"蛇精");
        System.out.println(list);
        System.out.println(list.indexOf("蛇精"));
        System.out.println(list.lastIndexOf("蛇精"));
        System.out.println(list.remove(5));
        System.out.println(list.get(0));
        System.out.println(list.set(3,"蜈蚣精"));
        System.out.println(list.addAll(0,list2));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.indexOf(i));
        }
        for (String s:list
             ) {
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
