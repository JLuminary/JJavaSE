package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*本类用于复写Map统计字符案例
 * 需求效果：随机输入一串字符串，统计这串字符串中每个字母的出现次数：a=1,b=2*/
public class TestMap {
    public static void main(String[] args) {
        //1.提示并接收用户输入的字符串
        System.out.println("请您输入一串字符串:");
        String input = new Scanner(System.in).nextLine();

        //2.Map集合作为容器，统计一会的数据
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            Integer value = map.get(key);
            if (value == null) {
                map.put(key, 1);
            } else {
                map.put(key, value + 1);
            }
            System.out.println(map);
        }
        System.out.println("各个元素出现的次数:"+map);
    }
}
