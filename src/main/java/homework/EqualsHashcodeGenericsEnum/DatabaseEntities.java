package homework.EqualsHashcodeGenericsEnum;

import java.time.LocalDate;
import java.util.Objects;

//7. Given a list of objects representing database entities with fields such as id, name, and timestamp, ensure that no two entities are considered equal if their id fields are different.
public class DatabaseEntities {
    private final int id;
    private String name;
    private LocalDate timestamp;

    public DatabaseEntities(int id, String name, LocalDate timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DatabaseEntities entities = (DatabaseEntities) obj;
        return id == entities.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        DatabaseEntities ent1 = new DatabaseEntities(12345, "First Entity",LocalDate.now());
        DatabaseEntities ent2 = new DatabaseEntities(67891, "Second Entity", LocalDate.now());

        System.out.println("ent1 equals ent2: " + ent1.equals(ent2));
        System.out.println("ent1 hashCode: " + ent1.hashCode());
        System.out.println("ent2 hashCode: " + ent2.hashCode());
    }

}
