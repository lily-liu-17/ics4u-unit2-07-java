/*
* Vehicle Class
*
* @author  Lily Liu
* @version 1.0
* @since   2022-10-31
*/

/**
 * Vehicle Class.
 */
public class Vehicle {
    /**
     * The current speed of the vehicle.
     */
    private int speed;

    /**
     * Colour of the vehicle.
     */
    private String colour;

    /**
     * The maximum speed of the vehicle.
     */
    private int maxSpeed;

    /**
     * Vehicle constructor.
     *
     * @param colour - the colour
     * @param maxSpeed - the maximum speed of the vehicle
     */
    public Vehicle(
        String colour,
        int maxSpeed) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
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
            String.format("%s\n%s\n%s",
                "       --> Speed: " + String.valueOf(this.speed),
                "       --> MaxSpeed: " + String.valueOf(this.maxSpeed),
                "       --> Color: " + this.colour)
        );
    }

    /**
     * The getColor() function.
     *
     * @return colour
     */
    public String getColor() {
        return this.colour;
    }

    /**
     * The setColor() function.
     *
     * @param color - the colour
     */
    public void setColor(String color) {
        this.colour = color;
    }

    /**
     * The getSpeed() function.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * The setSpeed() function.
     *
     * @param speed - the speed of the vehicle.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * The getMaxSpeed() function.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * The accelerate() function.
     *
     * <p>
     * Increases the speed over a period of time.
     * </p>
     *
     * @param accelerationPower - the power
     * @param accelerationTime - the period of time
     */
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = accelerationPower * accelerationTime + this.speed;

        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * The break() function.
     *
     * <p>
     * Decreases the speed over a period of time.
     * </p>
     *
     * @param breakPower - the power
     * @param breakTime - the period of time
     */
    public void breakVehicle(int breakPower, int breakTime) {
        this.speed = this.speed - breakPower * breakTime;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
