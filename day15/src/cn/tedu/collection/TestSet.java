package cn.tedu.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*本类用于测试Set*/
public class TestSet {
    public static void main(String[] args) {
        //1.创建集合对象
        Set<String> set =new HashSet<>();
        //2.向集合中添加数据
        set.add("紫霞仙子");
        set.add("至尊宝");
        set.add("蜘蛛精");
        set.add("紫霞仙子");
        set.add(null);
        System.out.println(set);//打印查看集合元素
        /*1.set集合中的元素都是没有顺序的
        * 2.set集合中的元素不能重复
        * 3.set集合可以存null值，最多存一个*/
        System.out.println(set.contains("孙悟空"));
        System.out.println(set.isEmpty());
        System.out.println(set.remove(null));
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(Arrays.toString(set.toArray()));

        Set<String> set2=new HashSet<>();
        set2.add("黄梅大王");
        set2.add("玉兔");
        set2.add("黄大王");
        set2.add("发福蝶");
        System.out.println(set2);
        System.out.println(set.addAll(set2));
        System.out.println(set);
        System.out.println(set.containsAll(set2));
        System.out.println(set);
        System.out.println(set.retainAll(set2));//交集
        System.out.println(set);
        System.out.println(set.remove(set2));
        System.out.println(set);
        //获取set集合对应的迭代器

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
