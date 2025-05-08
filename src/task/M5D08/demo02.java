package task.M5D08;

import OtherCode.PerTools.FileUtil;
import OtherCode.PerTools.FlexibleRead;

import java.io.*;
import java.util.Properties;

public class demo02 {
    public static void main(String[] args) throws IOException{
        FileUtil.createFile("E:\\ZlS\\WORK_TEST2", "Students.txt");
        File file = new File("E:\\ZlS\\WORK_TEST2\\Students.txt");

        System.out.println("欢迎使用学生信息管理系统");

        while (true) {
            System.out.println("1.查看所有学生信息\n" +
                    "2.根据学号查看学生信息\n" +
                    "3.添加学生信息\n" +
                    "4.修改学生信息\n" +
                    "5.删除学生信息\n" +
                    "6.备份当前学生信息\n" +
                    "7.退出系统\n" +
                    "--------------------");

            String choice = FlexibleRead.readLine("请输入你的需求：");
            switch (choice) {
                case "1":
                    showAllStudents(file);
                    break;
                case "2":
                    findStudent(file);
                    break;
                case "3":
                    addStudent(file);
                    break;
                case "4":
                    updateStudent(file);
                    break;
                case "5":
                    deleteStudent(file);
                    break;
                case "6":
                    backupStudentInfo(file);
                    break;
                case "7":
                    System.out.println("退出成功，欢迎下次使用学生管理系统");
                    System.exit(0);
                default:
                    System.out.println("无效输入");
            }
        }
    }

    //  查看所有学生信息
    public static void showAllStudents(File file) throws IOException {
        if (!isEmptyInfo(file)) return;
        Properties prop = transStudentInfo(file);

        for (String key : prop.stringPropertyNames()) {
            System.out.println(key + ":" + prop.getProperty(key));
        }
    }

    //  根据学号查看学生信息
    public static void findStudent(File file) throws IOException {
        String id = FlexibleRead.readLine("请输入学生编号：");
        if (isExistId(file, id)) {
            Properties prop = transStudentInfo(file);
            System.out.println(id + ":" +prop.getProperty(id));
        } else {
            System.out.println("该学生编号不存在");
        }

    }

    //  添加学生信息
    public static void addStudent(File file) throws IOException {

        String id = FlexibleRead.readLine("请输入学生编号：");
        String name = FlexibleRead.readLine("请输入学生姓名：");
        String age = FlexibleRead.readLine("请输入学生年龄：");

        if (id.isEmpty() || name.isEmpty() || age.isEmpty()) {
            System.out.println("输入不能为空");
        } else {
            Properties prop = transStudentInfo(file);
            prop.setProperty(id, name + "  " + age);
            prop.store(new FileWriter(file), "");
            System.out.println("添加成功");
        }
    }

    //  修改学生信息
    public static void updateStudent(File file) throws IOException {
        String id = FlexibleRead.readLine("请输入学生编号：");
        if (!isExistId(file, id)) {
            System.out.println("该学生编号不存在");
            return;
        }
        Properties prop = transStudentInfo(file);
        String name = FlexibleRead.readLine("请输入学生姓名：");
        String age = FlexibleRead.readLine("请输入学生年龄：");

        if  (name.isEmpty() || age.isEmpty()) {
            System.out.println("输入不能为空");
        } else {
            prop.setProperty(id, name + "  " + age);
            prop.store(new FileWriter(file), "");
            System.out.println("修改成功");
        }
    }

    //  删除学生信息
    public static void deleteStudent(File file) throws IOException {
        String id = FlexibleRead.readLine("请输入学生编号：");
        if (!isExistId(file, id)) {
            System.out.println("该学生编号不存在");
            return;
        }
        Properties prop = transStudentInfo(file);
        prop.remove(id);
        prop.store(new FileWriter(file), "");
        System.out.println("删除成功");
    }

    //  备份当前学生信息
    public static void backupStudentInfo(File file) {
        if (file.length() == 0) {
            System.out.println("暂无学生信息");
            return;
        }
        FileUtil.copyFile(file, new File("E:\\ZlS\\WORK_TEST2\\Students_backup.txt"));
        System.out.println("备份成功");
    }



    //判断学号是否存在
    public static boolean isExistId(File file, String id) throws IOException {
        if (file.length() == 0) return false;
        Properties prop = transStudentInfo(file);
        return prop.containsKey(id);
    }

    //判断文件内是否存在学生信息
    private static boolean isEmptyInfo(File file) {
        if (file.length() == 0) {
            System.out.println("暂无学生信息");
            return false;
        }
        return true;
    }

    //将学生信息转入properties集合内
    private static Properties transStudentInfo(File file) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader(file));
        return prop;
    }
}
