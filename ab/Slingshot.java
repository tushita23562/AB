package angry_birds.java.lwjgl3;
import java.util.List;

public class Slingshot {
    private List<Bird> birdQueue;
    private Bird currentBird;
    private double launchAngle;
    private double launchForce;
    private double birdSpeed;
    private double distance;

    public void launchBird() throws BirdException{

    }

    public void calculateTrajectory(){

    }

    public List<Bird> getBirdQueue() {
        return birdQueue;
    }

    public void setBirdQueue(List<Bird> birdQueue) {
        this.birdQueue = birdQueue;
    }

    public Bird getCurrentBird() {
        return currentBird;
    }

    public void setCurrentBird(Bird currentBird) {
        this.currentBird = currentBird;
    }

    public double getLaunchAngle() {
        return launchAngle;
    }

    public void setLaunchAngle(double launchAngle) {
        this.launchAngle = launchAngle;
    }

    public double getLaunchForce() {
        return launchForce;
    }

    public void setLaunchForce(double launchForce) {
        this.launchForce = launchForce;
    }

    public double getBirdSpeed() {
        return birdSpeed;
    }

    public void setBirdSpeed(double birdSpeed) {
        this.birdSpeed = birdSpeed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
