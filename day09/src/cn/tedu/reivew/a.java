package cn.tedu.reivew;

public class a {
    public static class Test {
  public static void main(String[] args) {
         MyClass obj=new MyClass("Hello");
   obj.Info+=",World!";
      System.out.println(obj.Info);
}
      }
 }
  class MyClass  {
        public String Info="Hello";
         public MyClass(String Info)
       {
            this.Info=Info;
      }
 }
