package homework.EqualsHashcodeGenericsEnum;

import java.util.HashMap;
import java.util.Map;

//8. Simulate a cache where objects are stored. Objects with the same hashcode should overwrite existing objects in the cache. Consider how would you design the hashcode method to facilitate this.
public class Cache {
    private String key;
    private String data;

    public Cache(String key, String data) {
        this.key = key;
        this.data = data;
    }
    public String getKey() {
        return key;
    }
    public String getData() {
        return data;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cache)) return false;
        Cache cache = (Cache) obj;
        return key.equals(cache.key);
    }
    @Override
    public int hashCode() {
        return key.hashCode();
    }

}
class Car{
    public static void main(String[] args) {
        Map<String,Cache>map= new HashMap<>();
        Cache car1 = new Cache("Toyota", "Camry");
        Cache car2 = new Cache("Honda", "Civic");
        Cache car3 = new Cache("Toyota", "Corolla");

        for (Cache car : map.values()){
            System.out.println("Car: " + car.getData());
        }

        map.put(car1.getKey(), car1);
        map.put(car2.getKey(), car2);
        map.put(car3.getKey(), car3);

        System.out.println("Toyota: " + map.get("Toyota").getData());
        System.out.println("Honda: " + map.get("Honda").getData());


        System.out.println("Car 1 equals Car 2: " + car1.equals(car2));
        System.out.println("Car 1 equals Car 3: " + car1.equals(car3));
        System.out.println("Car 1 hashCode: " + car1.hashCode());
        System.out.println("Car 2 hashCode: " + car2.hashCode());
        System.out.println("Car 3 hashCode: " + car3.hashCode());

    }
}