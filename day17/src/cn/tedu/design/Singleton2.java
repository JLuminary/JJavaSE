package cn.tedu.design;

/*本类用于实现单例设计模式方案1：饿汉式*/

public class Singleton2 {
    public static void main(String[] args) {
        MySingle2 single1 = MySingle2.getSingle2();
        MySingle2 single2 = MySingle2.getSingle2();
        System.out.println(single1);
        System.out.println(single2);
        System.out.println(single1 == single2);

    }
}

class MySingle2 {
    private MySingle2() {
    }

    private static MySingle2 single2;

    public static MySingle2 getSingle2() {
        if (single2 == null) {
            single2 = new MySingle2();
        }
        return single2;
    }
}