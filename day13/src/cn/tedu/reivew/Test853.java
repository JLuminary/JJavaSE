package cn.tedu.reivew;
//拼接1000次26个字母
public class Test853 {
    public static void main(String[] args) {
        String s="";
        for(int i=0;i<26;i++){
            s=s+(char)(97+i);
        }
        System.out.println(s);
        method(s);
    }

    private static void method(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sb.append(s);
        }
        System.out.println(sb);
    }
}
