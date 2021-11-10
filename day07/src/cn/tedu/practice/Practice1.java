package cn.tedu.practice;
//this练习
public class Practice1 {
    public static void main(String[] args) {
        Pig p= new Pig();
        p.eat();
    }
}
class Pig{
    int sum=10;
    public void eat(){
        int sum =100;
        System.out.println(sum);
        System.out.println(this.sum);
    }
}