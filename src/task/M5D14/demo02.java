package task.M5D14;

import java.util.ArrayList;
import java.util.Collection;

public class demo02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");

        list.stream().limit(2).forEach(System.out::println);
        System.out.println("------------------");
        list.stream().skip(list.size()-2).forEach(System.out::println);
    }
}