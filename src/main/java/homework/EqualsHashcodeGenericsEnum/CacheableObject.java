package homework.EqualsHashcodeGenericsEnum;
//8.
class CacheableObject {
    private String key;
    private String data;

    public CacheableObject(String key, String data) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CacheableObject)) return false;
        CacheableObject that = (CacheableObject) o;
        return key.equals(that.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
