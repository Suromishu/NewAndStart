package ClassRoomExercise.demo5.demo08;

public enum KeyOperation {
    W('8',  "上"),
    S('2',  "下"),
    A('4',  "左"),
    D('6',  "右"),
    DS('3',"右下"),
    AS('1',"左下"),
    AW('7',"左上"),
    DW('9',"右上"),
    J('A',  "轻拳"),
    K('B',  "重拳"),
    U('X',  "轻踢"),
    I('Y',  "重踢");

    private char instruct;
    private String name;

    KeyOperation(){

    }
    KeyOperation(char instruct, String name){
        this.instruct = instruct;
        this.name = name;
    }

    public char getInstruct() {
        return instruct;
    }

    public String getName() {
        return name;
    }
}
