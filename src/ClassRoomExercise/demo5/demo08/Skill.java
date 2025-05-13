package ClassRoomExercise.demo5.demo08;

public class Skill {

    private KeyOperation[] skill_1;
    private KeyOperation[] skill_2;
    private KeyOperation[] skill_3;

    public void setup_skill1(KeyOperation... key1){
        this.skill_1 = key1;
    }

    public void deSkill_1() {
        for (KeyOperation key : skill_1)
            System.out.print(key.getInstruct());
    }
    public void setup_skill2(KeyOperation... key2){
        this.skill_2 = key2;
    }

    public void deSkill_2() {
        for (KeyOperation key : skill_2)
            System.out.print(key.getInstruct());
    }
    public void setup_skill3(KeyOperation... key3){
        this.skill_3 = key3;
    }

    public void deSkill_3() {
        for (KeyOperation key : skill_3)
            System.out.print(key.getInstruct());
    }
}
