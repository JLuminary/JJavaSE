package cn.tedu.basic;

/*本类用作类型转换*/
public class TestTypeChange {
    public static void main(String[] args) {
        byte a = 10;

        short b = a;

        int c = 1;

        long d = c;

        float f = 3.1415f;

        double e = f;

        long g = 141412412L;

        float h = g;

        char i = 'a';

        int j = a;


        int a1 = 1;

        byte b1 = 2;

        byte c1 = (byte) (a1 + b1);

        byte d1 = (byte) 128;

        System.out.println(d1);

        short e1 = 'a' + 'b';//97+98
        char f1 = 111;

        System.out.println(e1);
        System.out.println(f1);

        float h1 = 14124.245465335f;
        int i1 = (int) h1;//大转小
        System.out.println(i1); //浮点数转整数 小数没


    }
}
