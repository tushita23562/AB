package kavyaidk.java;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import kavyaidk.java.BirdException;

public abstract class Bird{
    SpriteBatch batch;
    private double speed;
    private int damage_level;
    Texture colour;
    public Bird(SpriteBatch batch){
        this.batch=batch;
    }
    public void render(int x, int y,int w,int h){
        //batch.begin();
        batch.draw(colour, x,y,w,h);
        //batch.end();
    }
    public abstract void launch() throws BirdException;
    public abstract void hit() throws BirdException;
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public int getDamage_level() {
        return damage_level;
    }
    public void setDamage_level(int damage_level) {
        this.damage_level = damage_level;
    }
}
