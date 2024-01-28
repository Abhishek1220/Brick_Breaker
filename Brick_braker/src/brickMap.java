import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class brickMap {
    public int map[][];
    public int brickWith;
    public int brickHight;

    public brickMap(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }
        brickWith = 540 / col;
        brickHight = 150 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.BLACK);
                    g.fillRect(j * brickWith + 80, i * brickHight + 50, brickWith, brickHight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.WHITE);
                    g.drawRect(j * brickWith + 80, i * brickHight + 50, brickWith, brickHight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }
}
