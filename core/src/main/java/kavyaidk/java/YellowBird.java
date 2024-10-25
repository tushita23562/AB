package kavyaidk.java;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class YellowBird extends Bird{
    Texture yellow=new Texture("yellow.png");
    public YellowBird(SpriteBatch batch){
        super(batch);
        colour=new Texture("yellow.png");
    }
    public void speedBoost(){

    }

    public void launch() throws BirdException {

    }

    public void hit() throws BirdException {

    }
}
