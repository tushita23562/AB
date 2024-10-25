package kavyaidk.java;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import static com.badlogic.gdx.Gdx.graphics;

public class Main extends ApplicationAdapter {
    SpriteBatch batch;
    Texture image, quit, levels, bg, back, pause, settings, credits, play, menu, parade, fly;
    Texture leveln, level1, level2, level3;
    Music music;
    OrthographicCamera camera;
    RedBird red, red1;
    YellowBird yellow;
    WhiteBird white;
    Slingshot sling;

    boolean isLevel1Unlocked = true;
    boolean isLevel2Unlocked = false;
    boolean isLevel3Unlocked = false;
    public void create(){
        batch = new SpriteBatch();
        red = new RedBird(batch);
        red1 = new RedBird(batch);
        yellow = new YellowBird(batch);
        white = new WhiteBird(batch);
        sling = new Slingshot(batch);
        image = new Texture("libgdx.png");
        quit = new Texture("quit.png");
        pause = new Texture("pause.png");
        back = new Texture("home.png");
        play = new Texture("play.png");
        menu = new Texture("menu.png");
        parade = new Texture("parade.png");
        fly = new Texture("fly.png");
        levels = new Texture("levels.png");
        leveln = new Texture("4.png");
        level1 = new Texture("1.png");
        level2 = new Texture("2.png");
        level3 = new Texture("3.png");
        bg = new Texture("bg.png");
        settings = new Texture("settings.png");
        credits = new Texture("credits.png");
        music = Gdx.audio.newMusic(Gdx.files.internal("abc.mp3"));
        music.setLooping(true);
        music.setVolume(.5f);
        music.play();
    }
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        int m=input();
        batch.begin();
        if (m==0){
            batch.draw(image, 0, 0, graphics.getWidth(), graphics.getHeight());
            batch.draw(menu, 170, 250, 100, 50);
            batch.draw(play, 280, 250, 100, 50);
            batch.draw(parade, 390, 250, 100, 50);
        }
        if (m==1){
            batch.draw(levels, 0, 0, graphics.getWidth(), graphics.getHeight());
            batch.draw(level1, 180, 200, 50, 50);
            batch.draw(leveln, 280, 200, 50, 50);
            batch.draw(leveln, 380, 200, 50, 50);
            batch.draw(back, 280, 50, 50, 50);
            if (isLevel2Unlocked) {
                batch.draw(level2, 280, 200, 50, 50);
            }
            if (isLevel3Unlocked) {
                batch.draw(level3, 380, 200, 50, 50);
            }
        }
        if (m==2){
            batch.draw(fly, 0, 0, graphics.getWidth(), graphics.getHeight());
            batch.draw(back, 10, graphics.getHeight()-40,30,30);
        }
        if (m==3){
            batch.draw(settings, 0, 0, graphics.getWidth(), graphics.getHeight());
            batch.draw(back, 10, graphics.getHeight()-40,30,30);
        }
        if (m==4){
            batch.draw(bg, 0, 0, graphics.getWidth(), graphics.getHeight());
            red.render(10, 60, 40, 50);
            sling.render(10, 60, 80, 80);
            batch.draw(pause, 10, graphics.getHeight() - 60, 50, 50);
        }
        if (m==5){
            batch.draw(bg, 0, 0, graphics.getWidth(), graphics.getHeight());
            yellow.render(10, 60, 40, 50);
            sling.render(10, 60, 80, 80);
            batch.draw(pause, 10, graphics.getHeight() - 60, 50, 50);
        }
        if (m==6){
            batch.draw(bg, 0, 0, graphics.getWidth(), graphics.getHeight());
            white.render(10, 60, 40, 50);
            sling.render(10, 60, 80, 80);
            batch.draw(pause, 10, graphics.getHeight() - 60, 50, 50);
        }
        if (m==7 || m==8 || m==9){
            batch.draw(quit, 0, 0, graphics.getWidth(), graphics.getHeight());
        }
        if (m==10){
            batch.draw(credits, 0, 0, graphics.getWidth(), graphics.getHeight());
            batch.draw(back, 10, graphics.getHeight()-40,30,30);
        }
        batch.end();
    }
    int k=0;
    private int input() {
        int mouseX = Gdx.input.getX();
        int mouseY = graphics.getHeight() - Gdx.input.getY();
        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT) && k==0){ // home screen
            if (mouseX >= 280 && mouseX <= 380 && mouseY >= 250 && mouseY <= 300){
                k=1;
                return k;
            }
            if (mouseX>=390 && mouseX<=490 && mouseY>=250 && mouseY<=300){
                k=2;
                return k;
            }
            if (mouseX>=170 && mouseX<=270 && mouseY>=250 && mouseY<=300){
                k=3;
                return k;
            }
        }
        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT) && k==1){ // level 1 screen
            if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
                if (mouseX>=280 && mouseX<=330 && mouseY>=50 && mouseY<=100){
                    k=0;
                    return k;
                }
                if(mouseX>=180 && mouseX<=230 && mouseY>=200 && mouseY<=250 && isLevel1Unlocked){
                    k=4;
                    return k;
                }
                if(mouseX>=280 && mouseX<=330 && mouseY>=200 && mouseY<=250 && isLevel2Unlocked){
                    k=5;
                    return k;
                }
                if(mouseX>=380 && mouseX<=430 && mouseY>=200 && mouseY<=250 && isLevel3Unlocked){
                    k=6;
                    return k;
                }
            }
        }
        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT) && k==3){ // menu options
            if (mouseX>=150 && mouseX<=420 && mouseY>=250 && mouseY<=300){
                music.setVolume(.5f);
            }
            if (mouseX>=150 && mouseX<=320 && mouseY>=200 && mouseY<=250){
                music.setVolume(0f);
            }
            if (mouseX>=150 && mouseX<=400 && mouseY>=130 && mouseY<=180){
                k=10;
                return k;
            }
        }
        if(k==4 && Gdx.input.isKeyPressed(Input.Keys.ENTER)){
            //enter will be replaced with level completion logic later
            isLevel2Unlocked=true;
            k=1;
        }
        if(k==5 && Gdx.input.isKeyPressed(Input.Keys.ENTER)){
            //enter will be replaced with level completion logic later
            isLevel3Unlocked=true;
            k=1;
        }
        if(k==6 && Gdx.input.isKeyPressed(Input.Keys.ENTER)){
            //enter will be replaced with level completion logic later
            k=1;
        }
        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT) && (k==2 || k==3 || k==10)){ //home button
            if (mouseX>=10 && mouseX<=60 && mouseY>= graphics.getHeight()-40 && mouseY<= graphics.getHeight()-10){
                k=0;
                return k;
            }
        }
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT) && (k==4||k==5||k==6)){
            if(mouseX>=10 && mouseX<=60 && mouseY>= graphics.getHeight()-60 && mouseY<= graphics.getHeight()-10){
                k=k+3;
                return k;
            }
        }
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT) && (k==7||k==8||k==9)){
            if (mouseY>=200 && mouseY<=250){
                if (mouseX>=100 && mouseX<=300){
                    k=k-3;
                }
                if (mouseX>=350 && mouseX<=500){
                    k=0;
                }
            }
        }
        return k;
    }
    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
