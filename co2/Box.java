package co2;

public class Box {
    private double l;
    private double w;
    private double b;

    // Default constructor
    public Box() {
        this.l = 0.0;
        this.w = 0.0;
        this.b = 0.0;
    }

    // Argument constructor
    public Box(double l, double w, double b) {
        this.l = l;
        this.w = w;
        this.b = b;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return this.l * this.w * this.b;
    }

    public static void main(String[] args) {
        // Creating an object with default constructor
        Box defaultBox = new Box();

        // Creating an object with argument constructor
        Box customBox = new Box(5.0, 3.0, 2.0);

        // Calculating volume using default constructor
        double defaultVolume = defaultBox.calculateVolume();
        System.out.println("Volume using Default Constructor: " + defaultVolume);

        // Calculating volume using argument constructor
        double customVolume = customBox.calculateVolume();
        System.out.println("Volume using Argument Constructor: " + customVolume);
    }
}
