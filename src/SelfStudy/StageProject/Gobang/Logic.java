package SelfStudy.StageProject.Gobang;

import OtherCode.PerTools.FlexibleRead;

import java.util.Arrays;

public class Logic {
    private final int[][] board;
    private int act;
    private boolean user1win;
    private boolean user2win;

    public Logic(int length) {
        this.board = new int[length][length];
        this.act = 1;
        this.user1win = false;
        this.user2win = false;
    }

    public void gameStart() {
        boolean over = false;
        while (!over) {
            act++;
            showBoard();
            if (act % 2 == 0)
                over = userPlay(2, "玩家2操作：X");
            else
                over = userPlay(1, "玩家1操作：O");
        }

        if (user1win)
            System.out.println("玩家1获胜");
        else if (user2win)
            System.out.println("玩家2获胜");
        else
            System.out.println("平局");

        System.exit(0);
    }

    private boolean userPlay(int player, String message) {
        int x, y;
        while (true) {
            System.out.println(message);
            x = FlexibleRead.readInt() - 1;
            y = FlexibleRead.readInt() - 1;

            if (x < 0 || x >= board.length || y < 0 || y >= board.length) {
                System.out.println("输入坐标超出范围，请重新操作");
                continue;
            }

            if (board[x][y] == 0) {
                board[x][y] = player;
                break;
            } else {
                System.out.println("该位置已有棋子，请重新操作");
            }
        }
        return check(x, y);
    }

    public boolean check(int x, int y) {
        int[][] direction = new int[][]{{1, 0}, {0, 1}, {1, 1}, {1, -1}};
        int count = getCount(x, y, direction);

        if (count >= 5) {
            if (board[x][y] == 1) {
                user1win = true;
            } else if (board[x][y] == 2) {
                user2win = true;
            }
            return true;
        } else {
            return false;
        }
    }

    private int getCount(int x, int y, int[][] direction) {
        int maxCount = 1;
        int player = board[x][y];

        for (int[] dir : direction) {
            int dx = dir[0], dy = dir[1];
            int currentCount = 1;

            for (int step = 1; ; step++) {
                int nx = x + dx * step;
                int ny = y + dy * step;
                if (nx < 0 || nx >= board.length || ny < 0 || ny >= board.length) break;
                if (board[nx][ny] != player) break;
                currentCount++;
            }

            for (int step = 1; ; step++) {
                int nx = x - dx * step;
                int ny = y - dy * step;
                if (nx < 0 || nx >= board.length || ny < 0 || ny >= board.length) break;
                if (board[nx][ny] != player) break;
                currentCount++;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }

    public void showBoard() {
        for (int i = board.length; i > 0; i--) {
            System.out.printf("%2d ", i);
            for (int[] ints : board) {
                if (ints[i - 1] == 0) {
                    System.out.print(" # ");
                } else if (ints[i - 1] == 1) {
                    System.out.print(" O ");
                } else if (ints[i - 1] == 2) {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int i = 1; i <= board.length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
    }


    //AI
    public int[][] getBoard() {
        return board;
    }

    public int getAct() {
        return act;
    }

    public void setAct(int act) {
        this.act = act;
    }

    public boolean isUser1win() {
        return user1win;
    }

    public boolean isUser2win() {
        return user2win;
    }

    public void resetGame() {
        for (int[] ints : board) {
            Arrays.fill(ints, 0);
        }
        act = 1;
        user1win = false;
        user2win = false;
    }
}
