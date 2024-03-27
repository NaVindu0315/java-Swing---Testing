package floor3d;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class FloorPanel extends JPanel {
    private List<FloorObject> objects = new ArrayList<>();

    public FloorPanel() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);
        objects.add(new FloorObject(new Rectangle(100, 100, 50, 50), Color.BLUE));
        objects.add(new FloorObject(new Rectangle(200, 200, 50, 50), Color.RED));
        objects.add(new FloorObject(new Rectangle(300, 300, 50, 50), Color.GREEN));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (FloorObject obj : objects) {
            obj.draw(g);
        }
    }

    public static class FloorObject {
        private Rectangle boundingBox;
        private Color color;

        public FloorObject(Rectangle boundingBox, Color color) {
            this.boundingBox = boundingBox;
            this.color = color;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);
        }
    }
}