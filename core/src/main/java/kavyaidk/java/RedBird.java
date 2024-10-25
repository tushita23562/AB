package kavyaidk.java;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
public class RedBird extends Bird{
    public RedBird(SpriteBatch batch) {
        super(batch);
        colour=new Texture("red.png");
    }
    public void launch() throws BirdException {

    }
    public void hit() throws BirdException {

    }
}
