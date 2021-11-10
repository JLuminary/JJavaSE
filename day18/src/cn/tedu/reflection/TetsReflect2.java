package cn.tedu.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*本类用于测试暴力反射*/
public class TetsReflect2 {
    /*1.通过暴力反射获取与操作属性*/

    @Test
    public void getFie2() throws Exception {
        Class<?> clazz = Person.class;
        //2.获取指定的私有属性
        Field field = clazz.getDeclaredField("name");
        Field field2 = clazz.getDeclaredField("age");
        //3.根据获取到的指定对象
        System.out.println(field);//直接打印获取到的字段对象
        System.out.println(field.getType());
        System.out.println(field.getType().getName());


        //4.2暴力反射需要设置私有资源可见权限
        field.setAccessible(true);
        field2.setAccessible(true);

        //4.设置属性的值
        //4.1需要指定到底给那个对象的name属性设置一个什么值
        Object obj = clazz.newInstance();//触发无参构造创建对象
        Object person2 = clazz.newInstance();
        Object person3 = clazz.newInstance();
        //4.3通过刚刚获取到的属性对象，给刚刚创建好的obj对象设置属性值，
        //field就是我们刚刚获取的name属性
        //set(m,n)--m是给哪个对象的那么属性设置值，n是设置具体的值
        field.set(obj,"lemon");
        field2.set(person2,3);
        field2.set(person3,18);
        //4.4 打印查看刚刚的属性是否设置成功
        //field.get(m),m戴白哦的就是查看哪个对象的这个name属性的值
        System.out.println(field.get(obj));
        System.out.println(field2.get(person2));
        System.out.println(field2.get(person3));
    }
    
    @Test
    public void getFie3() throws Exception {
        Class<?> clazz = Person.class;
        Field a = clazz.getDeclaredField("addr");
        a.setAccessible(true);
        Object obj = clazz.newInstance();
        a.set(obj,"洛阳");
        System.out.println(a.get(obj));
    }

    /*通过暴力反射*/
    @Test
    public void getFie4() throws Exception {
        Class<?> clazz = new Person().getClass();
        //2.通过字节码对象获取私有方法
        /*getDeclaredMethod(m,x,y,z)
        * m:要获取方法的名字
        * x，y,z...可变参数，指的是目标方法的参数个数可以根据实际情况改变，0/1/2
        * x y z 传入的是参数对应的类型，而且这个类型也必须是字节码对象
        * */
        Method save = clazz.getDeclaredMethod("save", int.class, String.class);

        Object p1 = clazz.newInstance();

        save.setAccessible(true);
        /*invoke方法（o,x,y,z....）表示通过反射技术执行的方法
        * o:表示要给哪个对象执行此方法
        * x,y,z...可变参数，之前获取的方法参数类型是什么，此处就传对应个数与类型的值*/
        save.invoke(p1,666,"小明");


    }

    @Test
    public void getFie5() throws Exception {
        Class<?> clazz = Person.class;
        Method update = clazz.getDeclaredMethod("update");
        Object o = clazz.newInstance();
        update.setAccessible(true);
        update.invoke(o);

    }
}
