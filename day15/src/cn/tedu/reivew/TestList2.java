package cn.tedu.reivew;
/*本类用于复写集合的迭代*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestList2 {
    public static void main(String[] args) {
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

        //集合的迭代：
        //因为list集合是有序的，元素是有下标的，就可以根据元素下标遍历集合
        //方式1：for循环的遍历
        //从哪开始 到哪结束
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------方式一***************");
        //方式二：使用高效for循环
        //因为普通for循环效率较低，语法复杂，格式
        //for（每轮遍历到的元素类型 元素名字：要遍历的内容）{循环体}
        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("*************方式二**************");
        //方式三：使用从父类接口Collection中继承过来的迭代器来遍历
        //1.获取集合对应的迭代器对象
        //2.通过刚刚获取到的迭代器，循环迭代集合中所有元素
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("************方式三**************");
        //方式四：使用List独有的迭代器
        ListIterator<String> sli = list.listIterator();
        while(sli.hasNext()){
            System.out.println(sli.next());
        }
        System.out.println("*********************");
        ListIterator<String> it2 = list.listIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        if(!it2.hasNext()){
            System.out.println("开始逆序");
            while(it2.hasPrevious()){
                System.out.println(it2.previous());
            }
            break;
           }
        }
    }
}
