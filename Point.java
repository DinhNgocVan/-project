/**
 * Created by CCNE on 14/10/2020.
 */

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        pointX = 0.0;
        pointY = 0.0;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point f) {
        return (Math.sqrt((pointX - f.pointX)
                * (pointX - f.pointX) + (pointY - f.pointY)
                * (pointY - f.pointY));
    }

    public boolean equals(Object k) {
        if (k instanceof Point) {
            Point other = (Point) k;
            if (pointY == other.pointY && pointX == other.pointX) {
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
