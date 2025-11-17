/**
 * This is the RoomSize class. It stores the name and dimensions of a room and calculates both the area and room information.
 * 
 *
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 11/16/2025
 */
public class RoomSize {

    private String name;
    private double length;
    private double width;

    /**
     * Standard constructor that initializes the room name, length, and width. It allows us to set up the name, length, and width, with in(variable).
     * 
     * @param inName  the name of the room
     * @param inLen   the length of the room in feet
     * @param inWidth the width of the room in feet
     */
    public RoomSize(String inName, double inLen, double inWidth) {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    /**
     * Copy constructor that creates a copy of another RoomSize object.
     * 
     * @param object2 the RoomSize object to copy
     */
    public RoomSize(RoomSize object2) {
        this.name = object2.name;
        this.length = object2.length;
        this.width = object2.width;
    }

    /**
     * Calculates and returns the area of the room.
     * 
     * @return the area (length × width)
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Returns the the name, length, width, and area

     * @return formatted room info
     */
    public String toString() {
        return "Room Name: " + name +
               "\nLength: " + length +
               "\nWidth: " + width +
               "\nArea: " + String.format("%.2f", getArea());
    }
}
