package cn.tedu.reflection;
/*本类用于暴力反射的物料类*/
public class Person {
    //1.提供私有属性
    private String name;
    private int age;
    private String addr;

    //2.提供私有方法
    public void save(int n,String s){
        System.out.println("save方法"+n+s);
    }
    private void update(){
        System.out.println("update方法");
    }
}
