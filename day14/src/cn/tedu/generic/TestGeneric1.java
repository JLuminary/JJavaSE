package cn.tedu.generic;

import java.util.ArrayList;
import java.util.List;

/*本类用于测试泛型的优点1*/
public class TestGeneric1 {
    public static void main(String[] args) {
        /*1.泛型是怎么来的？--模拟想要的数据类型的检查*/
        //数组的好处：在编译期就会检查数据类型，如果不是数组规定的类型，就报错
        //1.创建一个String类型的数组，长度为5
        String[] s = new String[5];
//        s[0]=1;
//        s[1]=6.6;
//        s[2]='a';
        s[3]="泡泡";
        s[4]="小明";

        List list=new ArrayList();//注意导包：java.util.List
        list.add("小明");
        list.add(1);
        list.add(8.8);
        list.add('v');
        System.out.println(list);

        /*2.泛型通常与集合一起使用，用来约束集合中元素的类型
        * 3.泛型的好处：可以约束集合数据类型，把报错的时机提前，而不是运行时才报错
        * 在向集合中添加元素时，会先检查元素的数据类型，不是要求的类型就编译失败*/
        List<String> list2=new ArrayList();
        //约束了集合的类型以后，集合只能存String类型的数据
        list2.add("小明");
//        list2.add(1);
//        list2.add(8.8);
//        list2.add('a');
        System.out.println(list2);

        //尖括号中存储的都是引用类型
        /*4.<type>--type的值应该如何写？
        * 这个需要根据自己业务自定义，但是type必须是引用类型，不能是基本类型
        * 如果想写基本类型，请写基本类型的包装类型*/
//        List<int> list3=new ArrayList();
        List<Integer> list3=new ArrayList();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);
        list3.add(500);
        System.out.println(list3);
    }
}
