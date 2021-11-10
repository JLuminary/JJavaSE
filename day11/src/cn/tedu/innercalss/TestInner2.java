package cn.tedu.innercalss;
//本类测试成员内部类被private修饰
public class TestInner2 {
    public static void main(String[] args) {
        //创建内部类对象 测试内部类资源
//        Outor2.Inner2 i= new Outor2().new Inner2();
//        i.eat();
        /*如果inner2被private修饰，无法创建对象 该怎么办？*/
        Outor2 o=new Outor2();
        o.play();
    }
}
//创建外部类
class Outor2{ //Modifier 'private' not allowed here
    //6.提供本类的公共方法，在本方法内部创建内部类对象，使用内部类功能
    public void play(){
        System.out.println("吃完就玩");
        Inner2 i=new Inner2();
        i.eat();
    }
    //创建成员内部类
     private class Inner2{
        //创建内部类的普通方法
        public void eat(){
            System.out.println("一生只为干饭王 牛牛牛");
        }
    }
}