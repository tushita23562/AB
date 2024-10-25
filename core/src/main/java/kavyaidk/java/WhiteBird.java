package kavyaidk.java;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WhiteBird extends Bird{
    public WhiteBird(SpriteBatch batch) {
        super(batch);
        colour=new Texture("white.png");
    }
    public void dropEggBomb(){

    }
    public void launch() throws BirdException {

    }
    public void hit() throws BirdException {

    }
}
