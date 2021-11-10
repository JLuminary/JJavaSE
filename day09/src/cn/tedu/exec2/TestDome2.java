package cn.tedu.exec2;

class TestDemo2 {
    public static void main(String[] args) {
        //新建 Soldier 士兵对象
        //内存地址，保存到变量s1
        Soldier s1 = new Soldier();
        Soldier s2 = new Soldier();
        //用s1引用第一个士兵对象
        //为它的id赋值
        s1.id = 9527;
        s2.id = 9528;
        //用s1找到第一个士兵对象
        //让第一个士兵执行go()方法代码
        s1.go();
        s2.go();
        //新建 AK47 对象，保存到s1.a
        s1.a = new AK47();
        s2.a = new AK47();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
    }
}
