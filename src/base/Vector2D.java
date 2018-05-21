package base;

public class Vector2D {

    public float x;
    public float y;

    public static final Vector2D ZERO = new Vector2D(0,0);
    public static final Vector2D ONE = new Vector2D(1,1);
    public static final Vector2D DOWN = new Vector2D(0,1);
    public static final Vector2D UP = new Vector2D(0,-1);

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2D set(float x, float y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vector2D set(Vector2D vector2D) {
        return this.set(vector2D.x, vector2D.y);
    }

    public Vector2D addUp(float x, float y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vector2D addUp(Vector2D vector2D) {
        return this.addUp(vector2D.x, vector2D.y);
    }

    public Vector2D add(float x, float y) {
        return new Vector2D(this.x + x, this.y + y);
    }

    public Vector2D add(Vector2D vector2D) {
        return this.add(vector2D.x, vector2D.y);
    }

    public Vector2D subtractBy(float x, float y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vector2D subtractBy(Vector2D vector2D) {
        return this.subtractBy(vector2D.x, vector2D.y);
    }

    public Vector2D subtract(float x, float y) {
        return new Vector2D(this.x - x, this.y - y);
    }

    public Vector2D subtract(Vector2D vector2D) {
        return this.subtract(vector2D.x, vector2D.y);
    }

    public Vector2D multiply(float number) {
        this.x *= number;
        this.y *= number;
        return this;
    }

    public Vector2D copy() {
        return new Vector2D(this.x, this.y);
    }

    public float length() {
        return (float) Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Vector2D normalize() {
        float length = this.length();
        return new Vector2D(this.x / length, this.y / length);
    }

    public Vector2D rotate(double angle) {
        double radian = Math.toRadians(angle);
        float sin = (float) Math.sin(radian);
        float cos = (float) Math.cos(radian);
        return new Vector2D(this.x * cos - this.y * sin, this.x * sin + this.y * cos);
    }

    @Override
    public Vector2D clone() {
        return new Vector2D(x, y);
    }
//
//    public void set(Vector2D other) {
//        set(other.x, other.y);
//    }

    public Vector2D rotate(float degree) {
        double rad = Math.toRadians(degree);
        double sinRad = Math.sin(rad);
        double cosRad = Math.cos(rad);
        return new Vector2D(
                (float)(cosRad * x - sinRad * y),
                (float)(sinRad * x + cosRad * y)
        );
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
