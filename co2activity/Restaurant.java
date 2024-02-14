package co2activity;

public class Restaurant {
    // Instance variables for Restaurant class
    private final String restaurantName;
    private final String restaurantContact;
    private final String restaurantAddress;
    private final float rating;

    // Constructor for Restaurant class
    public Restaurant(String name, String contact, String address, float rating) {
        this.restaurantName = name;
        this.restaurantContact = contact;
        this.restaurantAddress = address;
        this.rating = rating;
    }

    // Method to display restaurant information for Restaurant class
    public void displayRestaurant() {
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Contact Number: " + restaurantContact);
        System.out.println("Address: " + restaurantAddress);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        // Creating a new restaurant object
        Restaurant myRestaurant = new Restaurant("SwiftFood Restaurant", "123-456-7890", "123 Main St, City", 4.5f);

        // Displaying restaurant information
        myRestaurant.displayRestaurant();
    }
}
