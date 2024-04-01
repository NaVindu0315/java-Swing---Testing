package new3d;


import javax.swing.*;
import java.awt.*;

/**
 * Created by kalayci on 06-May-17
 */
public class DisplayFrame extends JFrame {

    public DisplayFrame() {
        setLayout(new BorderLayout());
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("3D Text", new Text3DExample());
        /*tabs.addTab("Cube", new InteractiveCubeExample());
        tabs.addTab("Cone", new ConeExample());
        tabs.addTab("Sphere", new SphereExample());
        tabs.addTab("Colored Box", new ColoredBoxExample());
        tabs.addTab("Cylinder", new CylinderExample());
        tabs.addTab("Texture", new TextureExample());
        tabs.addTab("Texture 2", new TexturedBox());

        tabs.addTab("Animated Text", new TextAnimationExample());
        tabs.addTab("Lightning", new LightningExample());
        tabs.addTab("Loading Object", new ObjectLoadingExample());*/

        add(tabs, BorderLayout.CENTER);
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DisplayFrame();
    }
}