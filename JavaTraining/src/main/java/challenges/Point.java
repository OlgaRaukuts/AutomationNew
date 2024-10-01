package challenges;

public class Point {
    private int x;
    private int y;
    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }
    public double distance(Point point){
        return Math.sqrt((x-point.x)*(x-point.x)+(y-point.y)*(y-point.y));
    }
    public double distance(int Ax, int Ay){
        return Math.sqrt((x-Ax)*(x-Ax)+(y-Ay)*(y-Ay));
    }
}
