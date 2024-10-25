package angry_birds.java.lwjgl3;

public class Settings {
    private String difficulty; //level difficulty
    private boolean soundEnabled;

    public void setDifficulty(String level) throws ResourceException{
        this.difficulty=level;
    }

    public void toggleSound() throws ResourceException{
        this.soundEnabled=!this.soundEnabled;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
