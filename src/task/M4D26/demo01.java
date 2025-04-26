package task.M4D26;

public class demo01 {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str);
        System.out.println(temp01Reverse(str));
        System.out.println(temp02Reverse(str));
    }

    public static String temp01Reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String temp02Reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
