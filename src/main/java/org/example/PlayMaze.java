package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlayMaze {

    public PlayMaze() {
    }

    public List<Direction> getHistory() {
        Maze maze = new Maze("*******" + "*..*..*" + "*S**.**" + "*.....*" + "*****.*" + "*G....*" + "*******", 7);
        Piece piece = new Piece(maze);

        while (!piece.isAtGoal()) {
            piece.turnLeft();
            while (!piece.tryStepForward()) {
                piece.turnRight();
            }
        }
        List<Direction> history = piece.getHistory();
        for (int i = 1; i < history.size(); i++) {
            if (history.get(i - 1) == history.get(i).left().left()) {
                history.remove(i - 1);
                history.remove(i - 1);
                i = 1 < 2 ? 0 : i - 2;
            }
        }
        return new ArrayList<>(history);
    }
}
