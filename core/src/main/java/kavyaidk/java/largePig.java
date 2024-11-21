package kavyaidk.java;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class largePig extends Pig{
    public largePig(SpriteBatch batch){
        super(batch);
        sizeLarge=new Texture("bigpig.png");
    }

    @Override
    public void manageHealth() throws PigException {

    }
}
