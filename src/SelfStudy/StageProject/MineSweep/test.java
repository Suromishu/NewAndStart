package SelfStudy.StageProject.MineSweep;

import OtherCode.PerTools.FlexibleRead;

public class test {
    public static void main(String[] args) {
        LogicAI1 logic = new LogicAI1(10, 10, 10);

        while (!logic.isGameOver()) {
            int x = FlexibleRead.readInt();
            int y = FlexibleRead.readInt();
            int act = FlexibleRead.readInt();
            logic.processInput(x, y, act);
            char[][] viewMap = logic.getViewMap();
            for (char[] chars : viewMap) {
                for (char aChar : chars) {
                    System.out.print(aChar + " ");
                }
                System.out.println();
            }
        }
    }
}
