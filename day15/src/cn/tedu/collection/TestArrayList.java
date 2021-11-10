package cn.tedu.collection;

import java.util.ArrayList;
/*本类用于ArrayList的相关测试*/
public class TestArrayList {
    public static void main(String[] args) {
        //1.创建对应集合对象
        /*底层会自动帮我们创建数组来存放对象，并且数据初始容量为10*/
        ArrayList<Integer> list =new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(400);
        list.add(300);
        System.out.println(list);

        //中午自行测试继承自Collection与list中的方法
        list.set(1,100);
        list.isEmpty();
        list.size();
        list.remove(0);
        list.contains(100);

    }
}
