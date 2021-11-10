package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//本类用于测试Collection接口
public class TestCollection {
    public static void main(String[] args) {
        //1.创建collection相关对象
        //<Integer>是泛型，用来约束集合中的数据类型，必须是引用类型
        Collection<Integer> c = new ArrayList();

        //2.1 测试集合中的常用方法
        c.add(100);//向集合中添加元素
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);//直接打印集合名，查看集合中的元素
//        c.clear();//清空集合中所有元素
//        System.out.println(c);

        System.out.println(c.hashCode());//获取当前对象哈希码值
        System.out.println(c.toString());//不推荐写
        System.out.println(c.equals(200));//false,集合对象c与集合中的元素200不等

        System.out.println(c.contains(200));//true 判断c集合中是否有元素200
        System.out.println(c.isEmpty());//false 判断c集合是否为空
        System.out.println(c.remove(100));//true 用于移除集合中指定元素
        System.out.println(c);
        System.out.println(c.size());//4  获取集合中元素个数
        Object[] a = c.toArray();//将指定的集合转为Object类型的数组
        System.out.println(Arrays.toString(a));//[200, 300, 400, 500]

        //2.2测试多个集合之间的操作

        Collection<Integer> c2=new ArrayList<>();
        c2.add(2);
        c2.add(4);
        c2.add(5);
        System.out.println(c2);//[2, 4, 5]

        c.addAll(c2);//将c2集合的所有元素添加到c集合
        System.out.println(c);//[200, 300, 400, 500, 2, 4, 5]
        System.out.println(c2);//

        c.removeAll(c2);//将c集合中属于c2的元素删除
        System.out.println(c);

        System.out.println(c.containsAll(c2));//c里面是否包含c2集合的所有元素

        c.add(5);
        System.out.println(c);//[200, 300, 400, 500, 5]
        System.out.println(c.retainAll(c2));//保留c集合中属于c2集合的公共元素
        System.out.println(c2);//[2, 4, 5]
        System.out.println(c);//[5]

        //3.集合的迭代/集合的遍历
        /*迭代步骤：
        * 1.获取集合的迭代器c2.iterator
        * 2.判断集合中是否仍有下一个元素可以迭代 it.hasNext
        * 3.获取当前迭代到的元素 it.next
        * */

        Iterator<Integer> it = c2.iterator();
        while(it.hasNext()){
            //打印本轮循环获取到的元素
            System.out.println(it.next());
        }




    }
}
