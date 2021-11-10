package cn.tedu.reivew;

import java.util.HashMap;
import java.util.Scanner;

//随机输入一串字符串，统计这串字符串中每个字母的出现次数
public class Test {
    public static void main(String[] args) {
        System.out.println("请您输入一串字符串：");
        String input = new Scanner(System.in).nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            Integer value = map.get(c);
            if (value == null) {
                map.put(c, 1);
            } else {
                map.put(c, value + 1);
            }
        }
        System.out.println("各元素出现的次数：" + map);
    }
}

