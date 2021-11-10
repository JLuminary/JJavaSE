package cn.tedu.generic;

public class TetsForEach {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] b = {"大哥", "二弟", "三弟", "四弟", "五弟"};
        for (Integer i : a) {
            System.out.println(i);
        }
        for (String s : b) {
            System.out.println(s);
        }
        for (int i = 0; i <a.length; i++) {
            for (Integer o:a) {
                System.out.println(o);
            }
        }
    }
}
