/*
* Bicycle Class
*
* @author  Lily Liu
* @version 1.0
* @since   2022-10-31
*/

/**
 * Bicycle Class.
 */
public class Bicycle extends Vehicle {
    /**
     * Cadence field.
     */
    private int cadence;

    /**
     * Bicycle constructor.
     *
     * @param colour - the colour
     * @param maxSpeed - the maximum speed of the vehicle
     */
    public Bicycle(
        String colour,
        int maxSpeed) {
        super(colour, maxSpeed);
    }

    /**
     * The status() function.
     *
     * <p>
     * Shows the status and properties of the vehicle
     * </p>
     */
    public void status() {
        System.out.println(
            String.format("%s\n%s\n%s\n%s",
                "       --> Speed: " + String.valueOf(super.getSpeed()),
                "       --> MaxSpeed: " + String.valueOf(super.getMaxSpeed()),
                "       --> Color: " + super.getColor(),
                "       --> Cadence: " + this.cadence)
        );
    }

    /**
     * The getCadence() function.
     *
     * <p>
     * Returns the value of the cadence.
     * </p>
     *
     * @return cadence - the value of the cadence.
     */
    public int getCadence() {
        return this.cadence;
    }

    /**
     * The accelerate() function.
     *
     * <p>
     * Increases the cadence and the speed of the bike
     * </p>
     *
     * @param appliedPower - the appliedPower to the bike.
     */
    public void accelerate(int appliedPower) {
        this.cadence = this.cadence + appliedPower;
        super.setSpeed(this.cadence * 2);
    }

    /**
     * The ringBell() function.
     *
     * <p>
     * Prints out the sound of the bell.
     * </p>
     */
    public void ringBell() {
        System.out.println("Ding Ding!\n");
    }

}
