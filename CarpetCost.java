/**
 * The CarpetCost class stores a RoomSize object and the cost per square foot of carpet. It calculates the total cost of the carpet for each room.
 *
 * Uses aggregation with safe copies (copy constructor).
 * 
 * @author Andrew Chang, andrewchang2906@gmail.com
 * @version v1.0
 * @since 2/20/2025
 */
public class CarpetCost {

    private RoomSize size;
    private double costPerSqFt;

    /**
     * Constructor that initializes the CarpetCost object using a RoomSize object and a carpet cost per square foot. A safe copy of the RoomSize object is stored.
     * 
     * @param area the RoomSize object for the room
     * @param cost the cost per square foot of the carpet
     */
    public CarpetCost(RoomSize area, double cost) {
        size = new RoomSize(area); 
        costPerSqFt = cost;
    }

    /**
     * Calculates the total cost of putting carpet in the room.
     * 
     * @return the total cost (area × cost per sq ft)
     */
    public double getCost() {
        return size.getArea() * costPerSqFt;
    }

    /**
     * Returns all room details, cost per sq ft, and total carpet cost.
     * 
     * @return formatted carpet cost information
     */
    public String toString() {
        return size.toString() +
               "\nThe cost per sq ft is: $" + String.format("%.2f", costPerSqFt) +
               "\nThe total cost is: $" + String.format("%,.2f", getCost());
    }
}
