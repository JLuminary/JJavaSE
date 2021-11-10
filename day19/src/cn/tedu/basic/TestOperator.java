package cn.tedu.basic;

import java.util.Objects;

/*本类用于测试==比较*/
public class TestOperator {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        System.out.println(c1 == c2);//false
        System.out.println(c1.equals(c2));

        int[] a1={1,2,3};
        int[] a2={1,2,3};
        System.out.println(a1 == a2);//false
        System.out.println(a1.equals(a2));//false

        int b1 =4;
        int b2 =4;
        System.out.println(b1 == b2);//true


        boolean f1=false;
        boolean f2=false;
        System.out.println(f1 == f2);//true
    }
}

class Cat {
    String name;
    int age;

    public void bark() {
        System.out.println("小猫喜欢miaomiao叫~");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

