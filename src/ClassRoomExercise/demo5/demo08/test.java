package ClassRoomExercise.demo5.demo08;

import static ClassRoomExercise.demo5.demo08.KeyOperation.*;

public class test {
    public static void main(String[] args) {
        Skill ski = new Skill();

        ski.setup_skill1(S,DS,D,DW,K);
        ski.deSkill_1();

        System.out.println();

        ski.setup_skill2(A,DS,S,AS,D,J,K);
        ski.deSkill_2();
    }
}
