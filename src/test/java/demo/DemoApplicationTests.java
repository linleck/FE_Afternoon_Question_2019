package demo;

import org.example.Direction;
import org.example.PlayMaze;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DemoApplicationTests {

    @Test
    void 連続移動でゴール達成可能かテストする() {
        PlayMaze playMaze = new PlayMaze();
        List<Direction> actualHistory = playMaze.getHistory();
        List<Direction> expectedHistory = new ArrayList<>(Arrays.asList(SOUTH, EAST, EAST, EAST, EAST, SOUTH, SOUTH, WEST, WEST, WEST, WEST));
        assertEquals(expectedHistory, actualHistory);

    }

}
