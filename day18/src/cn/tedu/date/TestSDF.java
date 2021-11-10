package cn.tedu.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*本类用于测试SimpleDateFormat*/
public class TestSDF {
    public static void main(String[] args) {
        Date d=new Date();
        //2.创建日期格式转换工具类对象，此时使用的是无参构造
        SimpleDateFormat sdf=new SimpleDateFormat();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf2.format(d);
        System.out.println(s);
    }
}
