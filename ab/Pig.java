package angry_birds.java.lwjgl3;

abstract class Pig {
    private int health;
    private int x;
    private int y;

    public abstract void manageHealth() throws PigException;

    public boolean isDead(){
        if(health<=0){
            return true;
        }
        return false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class SmallPig extends Pig{

    public void manageHealth() throws PigException {

    }
}

class MediumPig extends Pig{

    public void manageHealth() throws PigException {

    }
}

class LargePig extends Pig{

    public void manageHealth() throws PigException {

    }
}
