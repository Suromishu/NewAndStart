package task.M5D14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo05 {
    public static void main(String[] args) {
        ArrayList<String> boy=new ArrayList<>();
        boy.add("王俊凯");
        boy.add("肖战");
        boy.add("吴亦凡");
        boy.add("黄晓明");
        boy.add("李易峰");
        boy.add("鹿晗");
        ArrayList<String> girl=new ArrayList<>();
        girl.add("林依晨");
        girl.add("杨幂");
        girl.add("林志玲");
        girl.add("赵丽颖");
        girl.add("刘诗诗");
        girl.add("林心如");

        List<String> oBoys = boy.stream()
                                .filter(name -> name.length() == 3)
                                .limit(3)
                                .collect(Collectors.toList());

        List<String> oGirl = girl.stream()
                                .filter(name -> name.startsWith("林"))
                                .skip(1)
                                .collect(Collectors.toList());

        Stream<String> merge = Stream.concat(oBoys.stream(), oGirl.stream());

        List<Actor> list = new ArrayList<>();
        merge.forEach(name -> {
            Actor actor = new Actor(name);
            list.add(actor);
        });

        oBoys.forEach(System.out::println);
        System.out.println("========================");
        oGirl.forEach(System.out::println);
        System.out.println("========================");
        list.forEach(Actor::show);


    }
}

class Actor {
    private String name;

    public Actor() {
    }
    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("演员：" + name);
    }
}