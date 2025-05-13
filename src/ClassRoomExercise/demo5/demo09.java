package ClassRoomExercise.demo5;

//test
public class demo09 {
    public static void main(String[] args) {
        String str = new String("hello");

        Object obj = str;
        System.out.println(obj);
        System.out.println("===============");
        String st = (String) obj;
        System.out.println(st);
        System.out.println("===============");

        int[] arr = {1, 2, 3, 4, 5};
        char[] myString = {'h', 'e', 'l' , 'l', 'o'};
        System.out.println(arr);
        System.out.println(myString);
    }
}
