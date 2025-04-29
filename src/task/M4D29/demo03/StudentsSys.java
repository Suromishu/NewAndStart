package task.M4D29.demo03;

//学生信息管理系统

import OtherCode.PerTools.FlexibleRead;

import java.util.ArrayList;
import java.util.Collection;

public class StudentsSys {
    public static void main(String[] args) {
        Collection<Students> students = new ArrayList<>();

        System.out.println("欢迎使用学生信息管理系统");
        while (true) {
            System.out.println("1.添加学生\n" +
                    "2.删除学生\n" +
                    "3.修改学生信息\n" +
                    "4.查询学生信息\n" +
                    "5.展示所有学生\n" +
                    "6.退出系统\n" +
                    "--------------------");
            String choice = FlexibleRead.readLine("请输入你的选择：\n");
            switch (choice) {
                case "1":
                    addStudent(students);
                    break;
                case "2":
                    deleteStudent(students);
                    break;
                case "3":
                    updateStudent(students);
                    break;
                case "4":
                    findStudent(students);
                    break;
                case "5":
                    showAllStudent(students);
                    break;
                case "6":
                    System.out.println("退出成功，欢迎下次使用学生管理系统");
                    System.exit(0);
                default:
                    System.out.println("无效输入");
            }
        }
    }

    //添加学生
    public static void addStudent(Collection<Students> students) {
        Students s = new Students();

        s.setName(FlexibleRead.readLine("请输入学生姓名："));
        System.out.println("请输入学生编号：");
        s.setId(FlexibleRead.readInt());
        System.out.println("请输入学生年龄：");
        s.setAge(FlexibleRead.readInt());

        if (students.contains(s)) {
            System.out.println("该学生编号已存在");
        } else {
            students.add(s);
            System.out.println("添加成功");
        }
        FlexibleRead.readLine();
    }

    //删除学生
    public static void deleteStudent(Collection<Students> students) {
        Students s = new Students();

        System.out.println("请输入学生编号：");
        s.setId(FlexibleRead.readInt());

        if (students.contains(s)) {
            students.remove(s);
            System.out.println("删除成功");
        } else {
            System.out.println("该学生编号不存在");
        }
    }

    //修改学生信息
    public static void updateStudent(Collection<Students> students) {
        Students s = new Students();

        System.out.println("请输入学生编号：");
        s.setId(FlexibleRead.readInt());
        if (!students.contains(s)) {
            System.out.println("该学生编号不存在");
        } else {
            students.remove(s);
            System.out.println("请输入学生姓名：");
            s.setName(FlexibleRead.readLine());
            s.setName(FlexibleRead.readLine());
            System.out.println("请输入学生年龄：");
            s.setAge(FlexibleRead.readInt());
            students.add(s);
            System.out.println("修改成功");
        }
    }

    //查询学生信息
    public static void findStudent(Collection<Students> students) {
        Students s = new Students();
        System.out.println("请输入学生编号：");

        s.setId(FlexibleRead.readInt());
        if (students.contains(s)) {
            System.out.println(s);
        } else {
            System.out.println("该学生编号不存在");
        }
    }

    //展示所有学生
    public static void showAllStudent(Collection<Students> students) {
        if (students.isEmpty()) {
            System.out.println("暂无学生信息");
            return;
        }
        for (Students s : students) {
            System.out.println(s);
        }
    }
}
