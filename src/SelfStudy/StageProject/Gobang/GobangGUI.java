package SelfStudy.StageProject.Gobang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GobangGUI {
    private final Logic gameLogic;
    private final JFrame frame;
    private final BoardPanel boardPanel;
    private final int CELL_SIZE = 40;

    public GobangGUI(int boardSize) {
        gameLogic = new Logic(boardSize);
        frame = new JFrame("五子棋");
        boardPanel = new BoardPanel(boardSize, CELL_SIZE);

        initializeUI();
        gameLogic.gameStart(); // 移除原控制台逻辑的循环
    }

    private void initializeUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        boardPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX() / CELL_SIZE;
                int y = (boardPanel.getHeight() - e.getY()) / CELL_SIZE; // 坐标转换
                handleMove(x, y);
            }
        });

        frame.add(boardPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void handleMove(int x, int y) {
        // 修改原userPlay逻辑，直接调用检查流程
        if (isValidMove(x, y)) {
            int player = (gameLogic.getAct() % 2 == 0) ? 2 : 1;
            gameLogic.getBoard()[x][y] = player;
            boardPanel.repaint();

            if (gameLogic.check(x, y)) {
                showGameResult();
                resetGame();
            } else {
                gameLogic.setAct(gameLogic.getAct() + 1);
            }
        }
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < gameLogic.getBoard().length &&
                y >= 0 && y < gameLogic.getBoard().length &&
                gameLogic.getBoard()[x][y] == 0;
    }

    private void showGameResult() {
        String message = gameLogic.isUser1win() ? "玩家1获胜" :
                gameLogic.isUser2win() ? "玩家2获胜" : "平局";
        JOptionPane.showMessageDialog(frame, message);
    }

    private void resetGame() {
        int choice = JOptionPane.showConfirmDialog(frame, "是否开始新游戏？",
                "游戏结束", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            gameLogic.resetGame();
            boardPanel.repaint();
        } else {
            System.exit(0);
        }
    }

    class BoardPanel extends JPanel {
        private final int size;
        private final int cellSize;

        public BoardPanel(int size, int cellSize) {
            this.size = size;
            this.cellSize = cellSize;
            setPreferredSize(new Dimension(size * cellSize, size * cellSize));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 绘制棋盘
            g.setColor(new Color(215, 165, 75));
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.BLACK);
            for (int i = 0; i < size; i++) {
                g.drawLine(cellSize / 2, cellSize / 2 + i * cellSize,
                        cellSize / 2 + (size - 1) * cellSize, cellSize / 2 + i * cellSize);
                g.drawLine(cellSize / 2 + i * cellSize, cellSize / 2,
                        cellSize / 2 + i * cellSize, cellSize / 2 + (size - 1) * cellSize);
            }

            // 绘制棋子
            int[][] board = gameLogic.getBoard();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (board[i][j] != 0) {
                        int yPos = getHeight() - (j * cellSize + cellSize / 2);
                        if (board[i][j] == 1) {
                            g.setColor(Color.WHITE);
                        } else {
                            g.setColor(Color.BLACK);
                        }
                        g.fillOval(i * cellSize, yPos - cellSize / 2, cellSize, cellSize);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int boardSize = 15;
        new GobangGUI(boardSize);
    }
}