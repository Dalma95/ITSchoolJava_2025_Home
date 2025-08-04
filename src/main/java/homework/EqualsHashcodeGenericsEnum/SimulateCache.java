package homework.EqualsHashcodeGenericsEnum;
//8. Simulate a cache where objects are stored. Objects with the same hashcode should overwrite existing objects in the cache. Consider how would you design the hashcode method to facilitate this.
public class SimulateCache {
    private CacheableObject[] cache;
    private int size;

    public SimulateCache() {
        this.cache = new CacheableObject[10]; // Initial capacity
        this.size = 0;
    }

    public void addObject(CacheableObject obj) {
        for (int i = 0; i < size; i++) {
            if (cache[i].equals(obj)) {
                cache[i] = obj; // Overwrite existing object
                return;
            }
        }
        if (size < cache.length) {
            cache[size++] = obj; // Add new object
        } else {
            System.out.println("Cache is full, cannot add new object.");
        }
    }

    public CacheableObject getObject(String key) {
        for (int i = 0; i < size; i++) {
            if (cache[i].getKey().equals(key)) {
                return cache[i];
            }
        }
        return null; // Not found
    }
}
