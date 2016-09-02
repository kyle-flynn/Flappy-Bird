package lwjgl.playground.flappy.physics;

/**
 * Created by John on 9/1/2016.
 */
public class Point {

    private float x;
    private float y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }

}
