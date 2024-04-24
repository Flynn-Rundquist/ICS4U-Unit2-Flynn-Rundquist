/**
 * This class creates a Jet object.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-24
 */
public class Jet extends Airplane {

    private static final int MULTIPLIER = 2;

    public Jet() {
        super();
    }

    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    public void accelerate() {
        setSpeed(getSpeed() * 2);
    }
}
