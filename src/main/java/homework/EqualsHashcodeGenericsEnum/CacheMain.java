package homework.EqualsHashcodeGenericsEnum;
//8.
public class CacheMain {
    public static void main(String[] args) {

        SimulateCache cache = new SimulateCache();

        CacheableObject obj1 = new CacheableObject("key1", "data1");
        CacheableObject obj2 = new CacheableObject("key2", "data2");
        CacheableObject obj3 = new CacheableObject("key1", "data3"); //

        cache.addObject(obj1);
        cache.addObject(obj2);
        cache.addObject(obj3); // will overwrite obj1

        System.out.println("Retrieved: " + cache.getObject("key1").getData());
        System.out.println("Retrieved: " + cache.getObject("key2").getData());


    }
}
