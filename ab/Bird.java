package kavyaidk.java;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import static com.badlogic.gdx.Gdx.graphics;
abstract class Bird{
    private double speed;
    private int damage_level;
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

class RedBird extends Bird{
    Texture red;
    red=new Texture("red.png");
    public void render(){
        batch.begin();
        batch.draw(red, 10, 60,40,50);
        batch.end();
    }
    public void launch() throws BirdException {

    }
    public void hit() throws BirdException {

    }
}

class YellowBird extends Bird{

    public void speedBoost(){

    }

    public void launch() throws BirdException {

    }

    public void hit() throws BirdException {

    }
}

class WhiteBird extends Bird{

    public void dropEggBomb(){

    }

    public void launch() throws BirdException {

    }

    public void hit() throws BirdException {

    }
}
