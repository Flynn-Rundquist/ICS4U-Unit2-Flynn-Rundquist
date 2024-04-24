/**
 * Airplane class.
 *
 * @author Flynn
 * @version 1.0
 * @since 2024-04-24
 */

public class Airplane{
    private int speed;
    /**
     * This is the default constructor for the Airplane class.
     *
     * @param speed the speed
     */
    public Airplane(){
        speed = 0;
    }

    /**
     * This is the constructor for the Airplane class.
     *
     * @param speed the speed
     */
    public Airplane(int speed){
        this.speed = speed;
    }

    /**
     * This method sets the speed of the airplane.
     *
     * @param speed the speed
     * @return the speed
     */
    public int setSpeed(int speed){
        this.speed = speed;
        return speed;
    }
}
