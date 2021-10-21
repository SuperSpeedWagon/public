
/**
 * Write the specification here
 */
public final class Vector3 {

    private final double x, y, z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean isZeroVector() {
        return (x == 0 && y == 0 && z == 0);
    }

    public double dot(Vector3 that) {
        return this.x * that.x + this.y * that.y + this.z * that.z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3 crossProduct(Vector3 v) {
        return new Vector3(y * v.z - z * v.x, z * v.x - x * v.z, x * v.z - y * v.x);
    }

    public Vector3 normalize() {
        double t = x + y + z;
        return new Vector3(x / t, y / t, z / t);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vector3) {
            Vector3 v = (Vector3) o;
            return (v.x == x && v.y == y && v.z == z);
        } else return false;
    }
}
