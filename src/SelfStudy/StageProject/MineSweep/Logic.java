package SelfStudy.StageProject.MineSweep;

import java.util.Random;

public class Logic {
    private final Grid[][] board;
    private final int mineCount;
    private int flagCount;
    private boolean gameOver;
    private boolean gameWin;

    public Logic(int width, int length, int mineCount) {
        this.board = new Grid[width][length];
        this.mineCount = mineCount;
        this.flagCount = 0;
        this.gameOver = false;
        this.gameWin = false;
    }

    // 初始化地图，随机放置地雷
    public void initBoard() {
        Random random = new Random();
        int placedMines = 0;

        // 随机放置地雷
        while (placedMines < mineCount) {
            int x = random.nextInt(board.length);
            int y = random.nextInt(board[0].length);
            if (board[x][y] == null) {
                board[x][y] = new Grid(-1);
                placedMines++;
            }
        }

        // 初始化其他格子并计算周围地雷数量
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    board[i][j] = new Grid(countAdjacentMines(i, j));
                }
            }
        }
    }

    // 计算指定格子周围的地雷数量
    private int countAdjacentMines(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newX = x + i;
                int newY = y + j;
                if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[0].length) {
                    if (board[newX][newY] != null && board[newX][newY].getState() == -1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // 判断玩家是否获胜
    public boolean checkWin() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!board[i][j].isShow() && board[i][j].getState() != -1) {
                    return false; // 存在未揭开的非地雷格子
                }
            }
        }
        return true;
    }

    // 判断玩家是否失败
    public boolean checkLose() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].isShow() && board[i][j].getState() == -1) {
                    return true; // 揭开了地雷
                }
            }
        }
        return false;
    }

    // 揭开指定格子
    public void revealCell(int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y].isShow() || board[x][y].isFlag()) {
            return; // 无效操作
        }

        board[x][y].setShow(true);

        if (board[x][y].getState() == -1) {
            gameOver = true; // 揭开了地雷，游戏结束
            return;
        }

        if (board[x][y].getState() == 0) {
            // 如果是空白格子，递归揭开周围格子
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newX = x + i;
                    int newY = y + j;
                    if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[0].length) {
                        revealCell(newX, newY);
                    }
                }
            }
        }

        if (checkWin()) {
            gameWin = true; // 所有非地雷格子已揭开，玩家获胜
        }
    }

    // 放置或移除旗子
    public void toggleFlag(int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y].isShow()) {
            return; // 无效操作
        }

        board[x][y].setFlag(!board[x][y].isFlag());
        if (board[x][y].isFlag()) {
            flagCount++;
        } else {
            flagCount--;
        }
    }

    // 获取格子状态
    public Grid getGrid(int x, int y) {
        return board[x][y];
    }

    // 获取游戏是否结束
    public boolean isGameOver() {
        return gameOver;
    }

    // 获取游戏是否获胜
    public boolean isGameWin() {
        return gameWin;
    }

    // 获取剩余旗子数量
    public int getRemainingFlags() {
        return mineCount - flagCount;
    }
}

class Grid {
    private int state; // -1 地雷，0 空白，1-8 数字
    private boolean show;
    private boolean flag;

    public Grid(int state) {
        this.state = state;
        this.show = false;
        this.flag = false;
    }

    public int getState() {
        return state;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}