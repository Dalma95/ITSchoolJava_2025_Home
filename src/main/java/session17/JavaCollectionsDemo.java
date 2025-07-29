package session17;

import java.util.*;

public class JavaCollectionsDemo {
    public static void main(String[] args) {
//        listDemo();
//        setDemo();
        mapDemo();
    }


        public static void listDemo(){
            List<Integer> numbers =new ArrayList<>();
            for ( int i=0; i<=5;i++){
                numbers.add(i*10);
            }
            System.out.println(numbers);

            numbers.add(3,25);
            System.out.println(numbers);

            numbers.set(3,26);
            System.out.println(numbers);

            System.out.println(numbers.contains(26));
            System.out.println(numbers.contains(25));

            for(int number : numbers){
                System.out.println(number);
            }
        }

        enum Day{LUNI, MARTI, MIERCURI, JOI, VINERI, SAMBATA, DUMINICA }

        public static void setDemo(){

            Set<String> students = new HashSet<>();

            students.add("Mihai");
            students.add("Corina");
            students.add("Bogdan");
            students.add("Mihai");

            System.out.println(students);

            System.out.println(students.contains("Mihai"));

            students.remove("Mihai");
            System.out.println(students);

            System.out.println(students.contains("Mihai"));

            EnumSet<Day> days = EnumSet.range(Day.LUNI, Day.VINERI);
            System.out.println(days);
            days.add(Day.VINERI);
            System.out.println(days);
            days.add(Day.DUMINICA);
            System.out.println(days);
        }

        public static void mapDemo(){

            Map<String,Integer> students = new HashMap<>();

            students.put("Mihai",25);
            students.put("Bogdan",29);
            students.put("Sergiu",42);

            System.out.println(students);
            System.out.println(students.get("Mihai"));

            for (String name : students.keySet()){
                System.out.println(name + " are varsta "+ students.get(name));
            }
            for (Map.Entry<String,Integer> entry:students.entrySet()){
                System.out.println(entry.getKey()+ " are varsta "+ entry.getValue());
            }
            students.remove("Mihai");
            System.out.println(students);
        }

}
