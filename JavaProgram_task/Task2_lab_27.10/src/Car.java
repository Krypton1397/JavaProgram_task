import java.util.Objects;
public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Ссылка на один и тот же объект в памяти
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(model, car.model) &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, year);
    }
    public int comparePrice(Car otherCar) {
        if (this.price > otherCar.getPrice()) {
            return 1;
        } else if (this.price < otherCar.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void delivery(int amount) {
        if (amount > 0) {
            this.quantity += amount;
            System.out.println("Delivery received: +" + amount + " units.");
        } else {
            System.out.println("Invalid delivery amount.");
        }
    }
    public void sell(int amount) {
        if (amount > 0 && this.quantity >= amount) {
            this.quantity -= amount;
            System.out.println("Sale completed: -" + amount + " units.");
        } else {
            System.out.println("Insufficient quantity or invalid sale amount.");
        }
    }
    public void sell() {
        sell(1);
    }
    @Override
    public String toString() {
        return "Car details:\n" +
                "  Brand:    " + brand + "\n" +
                "  Model:    " + model + "\n" +
                "  Year:     " + year + "\n" +
                "  Price:    $" + String.format("%.2f", price) + "\n" +
                "  Color:    " + color + "\n" +
                "  Quantity: " + quantity;
    }
}