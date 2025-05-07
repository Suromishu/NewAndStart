package task.M4D28.demo03;

import OtherCode.PerTools.FlexibleRead;

import java.util.ArrayList;
import java.util.Collection;

public class StudentsSystem {
    public static void main(String[] args) {
        Collection<Students> students = new ArrayList<>();

        System.out.println("*******************\n" +
                "\t学生信息管理系统" +
                "\n*******************");
        while (true) {
            System.out.println("  1- 添加学生信息\n" +
                    "  2- 根据编号查找学生\n" +
                    "  3- 根据姓名查找学生\n" +
                    "  4- 显示所有学生\n" +
                    "  5- 退出系统");
            String choice = FlexibleRead.readLine("请输入你的选择：");
            switch (choice) {
                case "1":
                    addStudent(students);
                    break;
                case "2":
                    String id = FlexibleRead.readLine("请输入学生id");
                    Students foundById = findStudentById(students, id);
                    if (foundById != null) {
                        System.out.println(foundById);
                    } else {
                        System.out.println("未找到该学生");
                    }
                    break;
                case "3":
                    String name = FlexibleRead.readLine("请输入学生姓名");
                    Students foundByName = findStudentByName(students, name);
                    if (foundByName != null) {
                        System.out.println(foundByName);
                    } else {
                        System.out.println("未找到该学生");
                    }
                    break;
                case "4":
                    showAllStudent(students);
                    break;
                case "5":
                    System.out.println("退出成功，欢迎下次使用学生管理系统");
                    System.exit(0);
                default:
                    System.out.println("无效输入");
            }
        }
    }

    public static void addStudent(Collection<Students> students) {
        String id = FlexibleRead.readLine("请输入学生id");
        String name = FlexibleRead.readLine("请输入学生姓名");
        String age = FlexibleRead.readLine("请输入学生年龄");

        if (isInvalidInput(id, name, age)) {
            System.out.println("输入不能为空");
        } else if (findStudentById(students, id) != null) {
            System.out.println("学生id已存在");
        } else {
            students.add(new Students(Integer.parseInt(id), name, Integer.parseInt(age)));
            System.out.println("添加成功");
        }
    }

    public static Students findStudentById(Collection<Students> students, String id) {
        if (isInvalidInput(id)) {
            System.out.println("输入不能为空");
            return null;
        }
        for (Students student : students) {
            if (student.getId() == Integer.parseInt(id)) {
                return student;
            }
        }
        return null;
    }

    public static Students findStudentByName(Collection<Students> students, String name) {
        if (isInvalidInput(name)) {
            System.out.println("输入不能为空");
            return null;
        }
        for (Students student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    private static boolean isInvalidInput(String... inputs) {
        for (String input : inputs) {
            if (input == null || input.trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void showAllStudent(Collection<Students> students) {
        if (students.isEmpty()) {
            System.out.println("暂无学生信息");
            return;
        }
        for (Students student : students) {
            System.out.println(student.toString());
        }
    }
}
