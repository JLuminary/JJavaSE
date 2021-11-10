package cn.tedu.reflection;

import cn.tedu.reflection.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/*本类用于反射测试*/
public class TestReflect {
    /*单元测试方法：是java中最小的测试单位，使用灵活，推荐指数5颗星
     * 语法要求：@Test + public + void + 没有参数
     * 执行方式：玄选中当前要测试方法名前的绿色小三角，成功执行会有绿色小对勾*/
    //注意：JUnit 单元测试框架使用时需要导入资源，选择”Add JUnit to classpath“
    //成功导入会显示导包语句：import org.junit.Test
    @Test
    public void getClazz() throws ClassNotFoundException {
        //练习获取字节码对象的3种方式
        Class<?> clazz1 = Class.forName("cn.tedu.reflection.Student");
        Class<?> clazz2 = Student.class;
        Class<?> clazz3 = new Student().getClass();
        System.out.println(clazz1);//class cn.tedu.reflection.Student
        System.out.println(clazz1.getName());//通过字节码对象，获取他的名字 cn.tedu.reflection.Student
        System.out.println(clazz1.getSimpleName());//通过字节码对象获取类名 Student
        System.out.println(clazz1.getPackage());//通过字节码对象，获取包对象 package cn.tedu.reflection
        System.out.println(clazz1.getPackage().getName());//通过字节码对象，先获取包对象，在获取包对象的名字


    }

    /*通过单元测试方法获取Student目标类中的成员变量*/
    @Test
    public void getFie() throws ClassNotFoundException {
        //1.获取字节码对象
        Class<?> clazz = Class.forName("cn.tedu.reflection.Student");
        //2.获取类中的成员变量
        Field[] fs = clazz.getFields();
//        System.out.println(Arrays.toString(fs));
        /*注意！目前要获取的成员变量的修饰符必须是public才能获取到
        不然，像默认修饰符的成员变量也是获取不到的*/
        for (Field f : fs) {
            System.out.println(f.getName());
            System.out.println(f.getType());
        }
    }

    @Test
    public void getStudent() {
        Student s1 = new Student("张三", 3);
        Student s2 = new Student("李四", 4);
        Student s3 = new Student("王五", 5);
        Student s4 = new Student("赵钱", 6);
        Student[] s = {s1, s2, s3, s4};
        for (Student s11 : s
        ) {
            System.out.println(s11.name);
            System.out.println(s11.age);
            s11.play();
            s11.eat(888);
        }
    }


    /*通过单元测试方法，获取Student目标类中的成员方法*/
    @Test
    public void getFunction() {
        Class<?> clazz = Student.class;
        Method[] ms = clazz.getMethods();
        for (Method m : ms
        ) {
            System.out.println("遍历啦：");
            System.out.println("方法名字：" + m.getName());
            Class<?>[] pt = m.getParameterTypes();
            System.out.println(Arrays.toString(pt));
        }
    }

    /*通过单元测试方法获取构造方法*/
    @Test
    public void getCons() {
        Class<?> clazz = new Student().getClass();
        Constructor<?>[] cs = clazz.getConstructors();
        for (Constructor c : cs
        ) {
            System.out.println("又要遍历了");
            System.out.println("构造方法名：" + c.getName());
            Class[] pt = c.getParameterTypes();
            System.out.println("构造方法参数类型：" + Arrays.toString(pt));
        }
    }


    /*通过单元测试方法，利用反射创建目标类对象*/
    @Test
    public void getObject() throws Exception {
        Class<Student> clazz = Student.class;

        //2.利用反射创建目标业务类对象
        /*反射创建对象的方案1：通过触发目标类的无参构造创建对象*/
        Object o = clazz.newInstance();//无参构造
        System.out.println(o);

        /*反射创建对象的方案2：先获取指定的全参构造对象，再通过构造对象创造student对象*/
        Constructor<Student> c = clazz.getConstructor(String.class, int.class);
        Object o2 = c.newInstance("赵六", 6);
        System.out.println(o2);
    }
}
