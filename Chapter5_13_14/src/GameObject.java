//for Challenge
public abstract class GameObject {
    protected int distance;
    protected int x, y;
    public GameObject(int starX, int starY, int distance){
            this.x = starX;
            this.y = starY;
            this.distance = distance;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public boolean collide(GameObject p){
        if(this.x==p.getX() && this.y==p.getY()) return true;
        else return false;
    }
    protected abstract void move(String input);
    protected abstract char getShape();

}
