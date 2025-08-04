package homework.EqualsHashcodeGenericsEnum;
//16. Extend an enum representing car types to include properties such as average price and manufacturer. Override the toString method to provide a descriptive string representing each enum constant.
public enum CarType {
    SEDAN("Toyota", 25000),
    SUV("Honda", 30000),
    TRUCK("Ford", 35000),
    COUPE("Chevrolet", 28000);

    private final String manufacturer;
    private final int averagePrice;

    CarType(String manufacturer, int averagePrice) {
        this.averagePrice = averagePrice;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAveragePrice() {
        return averagePrice;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "name=" + name() +
                ", manufacturer='" + manufacturer + '\'' +
                ", averagePrice=" + averagePrice +
                '}';
    }

    public static void main(String[] args) {
        for (CarType type : CarType.values()) {
            System.out.println(type);
        }
    }
}
