package SelfStudy.StageProject.MineSweep;

import java.util.Random;

public class LogicAI1 {
    private final int width;
    private final int height;
    private final int mineCount;
    private final char[][] mineMap;  // 'X'=雷，数字=周围雷数
    private final char[][] viewMap;  // '#'=未打开，'F'=旗，' '=已打开
    private boolean firstClick = true;
    private boolean gameOver;

    public LogicAI1(int width, int height, int mineCount) {
        this.width = width;
        this.height = height;
        this.mineCount = mineCount;
        this.mineMap = new char[height][width];
        this.viewMap = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                viewMap[i][j] = '#';
            }
        }
    }

    public void processInput(int x, int y, int action) {
        if (gameOver || viewMap[y][x] == 'F') return;
        
        if (firstClick) {
            generateMines(x, y);
            firstClick = false;
        }

        if (action == 1) { // 展开
            if (mineMap[y][x] == 'X') {
                gameOver = true;
                return;
            }
            expand(y, x);
            checkWin();
        } else if (action == 2) { // 插旗
            viewMap[y][x] = (viewMap[y][x] == 'F') ? '#' : 'F';
            checkWin();
        }
    }

    private void generateMines(int safeX, int safeY) {
        Random rand = new Random();
        int placed = 0;
        while (placed < mineCount) {
            int rx = rand.nextInt(width);
            int ry = rand.nextInt(height);
            if (rx == safeX && ry == safeY) continue;
            if (mineMap[ry][rx] != 'X') {
                mineMap[ry][rx] = 'X';
                placed++;
            }
        }
        calculateNumbers();
    }

    private void calculateNumbers() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (mineMap[y][x] != 'X') {
                    int count = countMinesAround(x, y);
                    mineMap[y][x] = count > 0 ? (char) (count + '0') : ' ';
                }
            }
        }
    }

    private int countMinesAround(int x, int y) {
        int count = 0;
        for (int dy = -1; dy <= 1; dy++) {
            for (int dx = -1; dx <= 1; dx++) {
                if (dx == 0 && dy == 0) continue;
                int nx = x + dx, ny = y + dy;
                if (nx >= 0 && nx < width && ny >= 0 && ny < height) {
                    if (mineMap[ny][nx] == 'X') count++;
                }
            }
        }
        return count;
    }

    private void expand(int y, int x) {
        if (x < 0 || x >= width || y < 0 || y >= height || viewMap[y][x] != '#') return;
        
        viewMap[y][x] = mineMap[y][x];
        if (mineMap[y][x] == ' ') {
            for (int dy = -1; dy <= 1; dy++) {
                for (int dx = -1; dx <= 1; dx++) {
                    expand(y + dy, x + dx);
                }
            }
        }
    }

    private void checkWin() {
        int correctFlags = 0;
        int opened = 0;
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (viewMap[y][x] == 'F' && mineMap[y][x] == 'X') correctFlags++;
                if (viewMap[y][x] != '#' && viewMap[y][x] != 'F') opened++;
            }
        }
        
        if (correctFlags == mineCount || opened == (width * height - mineCount)) {
            gameOver = true;
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public char[][] getViewMap() {
        return viewMap;
    }
}