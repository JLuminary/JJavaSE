package cn.tedu.collection;

import java.util.LinkedList;

/*本类用于LinkedList的相关测试*/
public class TestLinkedList {
    public static void main(String[] args) {
        //1.创建Linkedlist的对象
        LinkedList<String> list = new LinkedList<>();
        //添加数据
        list.add("唐三藏");
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙师弟");
        list.add("白龙马");

        System.out.println(list);

        //3.1自行测试从继承自Collection与List的方法
        //3.2测试LinkedList独有的方法
        list.addFirst("黄眉大王");//添加首元素
        list.addLast("泡泡怪");//添加尾元素
        System.out.println(list);


        System.out.println(list.getFirst());//获取首元素
        System.out.println(list.getLast());//获取尾元素


        System.out.println(list.removeFirst());//删除首元素
        System.out.println(list.removeLast());//删除尾元素
        System.out.println(list);

        ///4.其他测试
        LinkedList<String> list2=new LinkedList<>();
        //4.2 添加元素
        list2.add("水浒传");
        list2.add("三国演义");
        list2.add("西游记");
        list2.add("红楼梦");
        System.out.println(list2);
        System.out.println(list2.element());//查看首元素
        System.out.println(list2);

        /*查询序列*/
        System.out.println(list2.peek());//查看首元素
        System.out.println(list2.peekFirst());//查看首元素
        System.out.println(list2.peekLast());//查看尾元素
        System.out.println(list2);

        /*别名：新增系列*/
        System.out.println(list2.offer("斗罗大陆"));
        System.out.println(list2);//添加尾元素
        System.out.println(list2.offerFirst("斗破苍穹"));
        System.out.println(list2);//添加首元素
        System.out.println(list2.offerLast("新世界"));
        System.out.println(list2);//添加尾元素

        /*别名：移除系列*/
        System.out.println(list2.poll());
        System.out.println(list2);//删除首元素
        System.out.println(list2.pollFirst());//删除首元素
        System.out.println(list2.pollLast());//删除尾元素
        System.out.println(list2);

    }
}
