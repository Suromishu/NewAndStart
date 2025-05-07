package SelfStudy.StageProject.MineSweep;

import OtherCode.PerTools.FlexibleOperate;

public class test {
    public static void main(String[] args) {
        LogicAI1 logic = new LogicAI1(10, 10, 10);

        while (!logic.isGameOver()) {
            int x = FlexibleOperate.readInt();
            int y = FlexibleOperate.readInt();
            int act = FlexibleOperate.readInt();
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
