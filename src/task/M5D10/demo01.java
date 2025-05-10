package task.M5D10;

/*
使用IO流实现学生信息管理：
	1:查看所有学生信息
	2:根据学号查看学生信息
	3:添加
	4:修改学生信息
	5:删除学生信息
	6:备份当前学生信息
	7:退出系统
*/

import OtherCode.PerTools.FlexibleRead;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo01 {
    File file = new File("E:\\ZlS\\TEST2\\Students.txt");

    //主界面
    public void showMenu() {
        System.out.println("欢迎使用学生信息管理系统");
        while (true) {
            System.out.println("1:查看所有学生信息" +
                    "2.根据学号查看学生信息" +
                    "3.添加学生信息" +
                    "4.修改学生信息" +
                    "5.删除学生信息" +
                    "6.备份当前学生信息" +
                    "7.退出系统");
            switch (FlexibleRead.readLine("请输入你的需求：")) {
                case "1":
                    showAllStudents();
                    break;
                case "2":
                    findStudent();
                    break;
                case "3":
                    addStudent();
                    break;
                case "4":
                    updateStudent();
                    break;
                case "5":
                    deleteStudent();
                    break;
                case "6":
                    backupStudentInfo();
                    break;
                case "7":
                    System.out.println("退出成功，欢迎下次使用学生管理系统");
                    System.exit(0);
               default:
                   System.out.println("无效输入");
            }
        }
    }

    //查看所有学生信息
    public void showAllStudents() {
        if (file.length() == 0) {
            System.out.println("当前没有学生信息");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t性别");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //根据学号查看学生信息
    public void findStudent() {
        if (file.length() == 0) {
            System.out.println("当前没有学生信息");
            return;
        }
        String id = FlexibleRead.readLine("请输入学生编号：");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            boolean flag = false;
            while (br.readLine() != null) {
                if (br.readLine().contains(id)) {
                    flag = true;
                    System.out.println("学号\t姓名\t年龄\t性别");
                    System.out.println(br.readLine());
                }
            }
            if (!flag) {
                System.out.println("没有该学生信息");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //添加学生信息
    public void addStudent() {
        System.out.println("请输入学生信息：");
        System.out.println("学号\t姓名\t年龄\t性别");
        String str = FlexibleRead.readLine();

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
            if  (str.isEmpty()) {
                System.out.println("输入不能为空");
                return;
            }
            bw.write(str);
            System.out.println("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //修改学生信息
    public void updateStudent() {
        if (file.length() == 0) {
            System.out.println("当前没有学生信息");
            return;
        }

        String id = FlexibleRead.readLine("请输入需要修改学生的编号：");
        if (isContain(id)) return;

        BufferedReader br2 = null;
        BufferedWriter bw2 = null;
        try {
            br2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            StringBuffer allStr = new StringBuffer();
            String newStu = FlexibleRead.readLine("请输入修改后的学生信息：");
            String str;

            while ((str = br2.readLine()) != null) {
                if (str.contains(id)) {
                    allStr.append(newStu + "\r\n");
                } else {
                    allStr.append(str + "\r\n");
                }
            }
            bw2.write(allStr.toString());
            System.out.println("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br2 != null) {
                    br2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //删除学生信息
    public void deleteStudent() {
        if (file.length() == 0) {
            System.out.println("当前没有学生信息");
            return;
        }

        String id = FlexibleRead.readLine("请输入需要删除学生的编号：");
        if (isContain(id)) return;

        BufferedReader br2 = null;
        BufferedWriter bw2 = null;
        try {
            br2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            StringBuffer allStr = new StringBuffer();
            String str;
            while ((str = br2.readLine()) != null) {
                if (str.contains(id)) {
                    continue;
                } else {
                    allStr.append(str + "\r\n");
                }
            }
            bw2.write(allStr.toString());
            System.out.println("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br2 != null) {
                    br2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //备份当前学生信息
    public void backupStudentInfo() {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(file);

            String bakTime = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 ").format(new Date());

            fos = new FileOutputStream("E:\\ZlS\\TEST2\\" + bakTime + " " + file.getName());

            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("备份成功");
    }


    //判断学生信息是否存在
    private boolean isContain(String id) {
        if (id.isEmpty()) {
            System.out.println("输入不能为空");
            return true;
        }
        boolean flag = false;
        BufferedReader br1 = null;
        try {
            br1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (br1.readLine() != null) {
                if (br1.readLine().contains(id)) {
                    flag = true;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br1 != null) {
                    br1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!flag) {
            System.out.println("没有该学生信息");
            return true;
        }
        return false;
    }
}
