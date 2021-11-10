package cn.tedu.reivew;
//测试泛型方法使用
public class Test2 {
    public static void main(String[] args) {
     String[] s={"小鲤鱼历险记"};
     Integer[] i={1,2,3,4,5,6,7,8,9,10};
     Double[]  d={6.6,6.66,6.666};
     print(s);
     print(i);
     print(d);


        }

    private static <E>void print(E[] e) {
        for(int i=0;i<e.length;i++){
            System.out.println(e[i]);
    }
}
}
