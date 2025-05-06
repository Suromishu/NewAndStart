package task.M4D27;

import OtherCode.PerTools.FlexibleOperate;

public class demo06 {
    public static void main(String[] args) {
        String[] names = {"tom", "lilei", "jack"};

        while (true) {
            String name = FlexibleOperate.readLine("请输入用户名：");
            if (name.length() < 3 || name.length() > 7) {
                System.out.println("用户名必须3-7位");
            } else {
                boolean flag = false;
                for (String s : names) {
                    if (s.equals(name)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("账号被占用，换一个！");
                } else break;
            }
        }
        while (true) {
            String password = FlexibleOperate.readLine("设置密码：");
            if (password.length() != 6) {
                System.out.println("密码必须6位");
            } else {
                String conPassword = FlexibleOperate.readLine("确认密码：");
                if (conPassword.equals(password)) {
                    System.out.println("注册成功！");
                    break;
                } else {
                    System.out.println("两次密码不一致，请重新设置！");
                }
            }
        }
    }
}
