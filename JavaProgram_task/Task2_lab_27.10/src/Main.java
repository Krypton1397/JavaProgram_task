public class Main {
    public static void main(String[] args) {
        // 1. Create an object of the Car class using the constructor
        Car myCar = new Car("Corolla", "Toyota", 2022, 23500.0, "White", 5);
        System.out.println("--- Initial State (toString) ---");
        System.out.println(myCar.toString());
        System.out.println();
        System.out.println("--- Simulating Sale ---");
        myCar.sell(2);
        System.out.println();
        System.out.println("--- Reading Fields via Getters ---");
        System.out.println("Brand:    " + myCar.getBrand());
        System.out.println("Model:    " + myCar.getModel());
        System.out.println("Year:     " + myCar.getYear());
        System.out.println("Price:    $" + myCar.getPrice());
        System.out.println("Color:    " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());
        System.out.println();
        System.out.println("--- Updating Fields via Setters ---");
        myCar.setColor("Metallic Gray");
        myCar.setPrice(22000.0);
        System.out.println("Updated color and adjusted price.\n");
        System.out.println("--- Updated State (toString) ---");
        System.out.println(myCar.toString());
        Car car1 = new Car("Corolla", "Toyota", 2022, 23500.0, "White", 5);
        Car car2 = new Car("Civic", "Honda", 2023, 26000.0, "Black", 3);
        Car car3 = new Car("RAV4", "Toyota", 2020, 40000.0, "Red", 2);
        System.out.println("--- Cars list and cost ---");
        System.out.println(car1.getBrand() + " " + car1.getModel() + ": $" + car1.getPrice());
        System.out.println(car2.getBrand() + " " + car2.getModel() + ": $" + car2.getPrice());
        System.out.println(car3.getBrand() + " " + car3.getModel() + ": $" + car3.getPrice());
        System.out.println("--- Comparison for equality ---");
        if (car1.equals(car3)) {
            System.out.println("car1 and car3 — same model and year.");
        } else {
            System.out.println("car1 and car3 — different cars.");
        }
        if (car1.equals(car2)) {
            System.out.println("car1 and car2 equal.");
        } else {
            System.out.println("car1 and car2 — different cars.");
        }
        System.out.println("\n--- Cost comparison ---");
        int cmp1_2 = car1.comparePrice(car2);
        if (cmp1_2 > 0) {
            System.out.println(car1.getBrand() + " is more expensive than " + car2.getBrand());
        } else if (cmp1_2 < 0) {
            System.out.println(car1.getBrand() + " is cheaper than " + car2.getBrand());
        } else {
            System.out.println(car1.getBrand() + " and " + car2.getBrand() + " have the same price.");
        }
        int cmp1_3 = car1.comparePrice(car3);
        if (cmp1_3 > 0) {
            System.out.println(car1.getBrand() + " is more expensive than " + car3.getBrand());
        } else if (cmp1_3 < 0) {
            System.out.println(car1.getBrand() + " is cheaper than " + car3.getBrand());
        } else {
            System.out.println(car1.getBrand() + " and " + car3.getBrand() + " have the same price.");
        }
        int cmp2_3 = car2.comparePrice(car3);
        if (cmp2_3 > 0) {
            System.out.println(car2.getBrand() + " is more expensive than " + car3.getBrand());
        } else if (cmp2_3 < 0) {
            System.out.println(car2.getBrand() + " is cheaper than " + car3.getBrand());
        } else {
            System.out.println(car2.getBrand() + " and " + car3.getBrand() + " have the same price.");
        }
        System.out.println("\n--- Most expensive car ---");
        Car mostExpensive = car1;

        if (car2.comparePrice(mostExpensive) > 0) {
            mostExpensive = car2;
        }
        if (car3.comparePrice(mostExpensive) > 0) {
            mostExpensive = car3;
        }

        System.out.println("Most expensive car is: " + mostExpensive.getBrand() + " " + mostExpensive.getModel() + " ($" + mostExpensive.getPrice() + ")");
    }
}