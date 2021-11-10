package cn.tedu.reivew;
//打印10000次26个英文字母
public class Test {
    public static void main(String[] args) {
        //定义字符串
        String s="";
        for(int i=0;i<26;i++){
            s=s+(char)(97+i);
        }
        System.out.println(s);
//    创建方法
//        method(s);

    }
    private static void method(String s) {
        //创建StringBuffer对象
        StringBuffer sb=new StringBuffer();
        //测试开始时间
        long s1 = System.currentTimeMillis();
        //创建for循环 调用StringBuffer对象的append方法拼接字符串
        for (int i = 0; i < 10000; i++) {
            sb.append(s);
        }
        //测试结束时间
        long end = System.currentTimeMillis();
        //打印拼接的字符串的内容
        System.out.println(sb);
        //测试时间
        System.out.println(end-s1);
    }
}
