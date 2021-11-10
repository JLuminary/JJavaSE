package cn.tedu.reivew;
//测试Collection
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);
        System.out.println(c.isEmpty());//判断是否为空
        System.out.println(c.remove(500));//移除元素
        System.out.println(c.contains(100));//判断是否为指定元素
        System.out.println(c.size());//查看元素的个数
        System.out.println(Arrays.toString(c.toArray()));//打印数组


        Collection<Integer> c2=new ArrayList();
        c2.add(600);
        c2.add(700);
        c2.add(800);
        System.out.println(c.addAll(c2));
        System.out.println(c.containsAll(c2));



        Iterator<Integer> it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
