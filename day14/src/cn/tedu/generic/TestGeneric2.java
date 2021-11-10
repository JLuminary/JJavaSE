package cn.tedu.generic;

//本类用于测试泛型的优点
public class TestGeneric2 {
    public static void main(String[] args) {
        //需求：打印指定数组中的所有元素
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(a);
        String[] b = {"大哥", "二弟", "三弟", "四弟", "五弟"};
        print(b);
        Double[] c = {6.6, 6.66, 6.666, 6.6666, 6.66666};
        print(c);

    }

    /*1.泛型可以实现通用的代码编写，使用E表示元素的类型是Element元素
     * 2.泛型的语法要求，如果在方法上使用泛型，必须两处同时出现
     * 一个是传入参数类型为泛型，一个是返回之前的泛型类型，表示这是一个泛型方法*/
    private static <E> void print(E[] e) {
//e        for (int i = 0; i < e.length; i++) {
//            System.out.println(e[i]);
//        }
        for (E e1 : e) {
            System.out.println(e1);
        }
    }

    private static void print(Double[] c) {
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
        for (Double c1 : c
        ) {
            System.out.println(c1);
        }
    }

    private static void print(String[] b) {
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");

        for (String b1 : b) {
            System.out.println(b1);
        }
    }

    private static void print(Integer[] a) {
//        for (int i = 0; i < a.length; i++) {
//            //a时传入的数组a,a[i]表示本轮循环中遍历到的数组元素
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
        /*高效for循环/foreach循环：
         * 好处：比普通的for循环写法简单，而且效率高
         * 语法for(1 2:3){循环体}
         * 3-要遍历的数据，1-每轮遍历到的数据的类型 2-变量名：可以随意起名*/
        for (Integer a1 : a) {
            System.out.println(a1);
        }
    }
}
