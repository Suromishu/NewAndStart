package task.M4D28;

import OtherCode.PerTools.FlexibleOperate;

public class demo02 {
    public static void main(String[] args) {
        String[] names = {"tom", "lilei", "jack"};
        String inputName = inputUserName();
        for (String name : names) {
            if (name.equals(inputName)) {
                throw new UserNameExistsException("用户名被占用，换一个！");
            }
        }
        while (true) {
            String password = FlexibleOperate.readLine("设置密码：");
            if (password.length() != 6) {
                System.out.println("密码必须6位");
            } else {
                if (FlexibleOperate.readLine("确认密码：").equals(password)) {
                    System.out.println("注册成功！");
                    break;
                } else {
                    System.out.println("两次密码不一致，请重新设置！");
                }
            }
        }
    }
    public static String inputUserName() {
        String userName = FlexibleOperate.readLine("请输入用户名：");
        if (userName.length() < 3 || userName.length() > 7) {
            System.out.println("用户名必须3-7位");
            return inputUserName();
        } else {
            return userName;
        }
    }
}
