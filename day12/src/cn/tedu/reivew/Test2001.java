package cn.tedu.reivew;
//打印10000【a-z】
public class Test2001 {
    public static void main(String[] args) {
        String s="";
        for (int i = 0; i < 26; i++) {
            s=s+(char)(97+i);
        }
        System.out.println(s);
        method(s);
    }

    private static void method(String s) {
        StringBuffer sb=new StringBuffer();
        Long t=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(s);
        }
        Long end=System.currentTimeMillis();
        System.out.println(sb);
        System.out.println(end-t);
    }
}
