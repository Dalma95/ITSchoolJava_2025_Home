package homework.EqualsHashcodeGenericsEnum;

import java.util.HashMap;
import java.util.Objects;

//15. Create a generic repository class for storing objects. The repository should use a HashMap internally. Override equals and hashcode methods to ensure the correct behavior of the repository.
public class StoreObj {
    private HashMap<String, Object> repository;

    public StoreObj() {
        this.repository = new HashMap<>();
    }

    public void add(String key, Object value) {
        repository.put(key, value);
    }

    public Object get(String key) {
        return repository.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StoreObj)) return false;
        StoreObj storeObj = (StoreObj) o;
        return Objects.equals(repository, storeObj.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }

    public static void main(String[] args) {
        StoreObj store = new StoreObj();
        store.add("item1", "value1");
        store.add("item2", 42);

        System.out.println("Item1: " + store.get("item1"));
        System.out.println("Item2: " + store.get("item2"));

        StoreObj anotherStore = new StoreObj();
        anotherStore.add("item1", "value1");
        anotherStore.add("item2", 42);

        System.out.println("Stores are equal: " + store.equals(anotherStore));
        System.out.println("Store hash code: " + store.hashCode());
        System.out.println("Another store hash code: " + anotherStore.hashCode());
    }
}
