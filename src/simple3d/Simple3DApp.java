package simple3d;

import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.geometry.ColorCube;
import javax.media.j3d.*;
import javax.vecmath.*;

public class Simple3DApp {

    public Simple3DApp() {
        // Create the universe using a convenience utility
        SimpleUniverse universe = new SimpleUniverse();

        // Set the view platform location and direction
        setViewPlatform(universe);

        // Create a branch group to hold the scene graph
        BranchGroup scene = createSceneGraph();

        // Add the branch group to the universe
        universe.addBranchGraph(scene);
    }

    public static void main(String[] args) {
        // Create an instance of the application
        Simple3DApp app = new Simple3DApp();
    }

    private void setViewPlatform(SimpleUniverse universe) {
        TransformGroup viewTransformGroup = universe.getViewingPlatform().getViewPlatformTransform();

        Transform3D viewTransform = new Transform3D();
        viewTransform.lookAt(new Point3d(0, 0, 10), new Point3d(0, 0, 0), new Vector3d(0, 1, 0));
        viewTransform.invert();
        viewTransformGroup.setTransform(viewTransform);
    }

    private BranchGroup createSceneGraph() {
        // Create a branch group to hold the scene graph
        BranchGroup scene = new BranchGroup();

        // Create a transform group to hold the cube and its rotation behavior
        TransformGroup cubeTransformGroup = new TransformGroup();
        cubeTransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        scene.addChild(cubeTransformGroup);

        // Create a color cube and add it to the transform group
        ColorCube cube = new ColorCube(0.4);
        cubeTransformGroup.addChild(cube);

        // Create a rotation behavior and add it to the transform group
        Alpha rotationAlpha = new Alpha(-1, 4000);
        RotationInterpolator rotationBehavior = new RotationInterpolator(rotationAlpha, cubeTransformGroup);
        BoundingSphere bounds = new BoundingSphere(new Point3d(0, 0, 0), 100);
        rotationBehavior.setSchedulingBounds(bounds);
        cubeTransformGroup.addChild(rotationBehavior);

        // Return the scene graph
        return scene;
    }

}