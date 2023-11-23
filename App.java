package package1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person("Julia", "Siger",
                new Address("Poland", "Łódzkie", "Łódź",
                        "77-777", "Kolorowa", "8", "48", "77777"));

        Person person2 = new Person("Jakub", "Kozłowski",
                new Address("Austria", "xxx", "Wiedeń",
                        "67-777", "yyyyy", "9", "55", "88888"));

        Company company1 = new Company("ABB",
                new Address("Polska", "łódzkie", "Łódź",
                        "66-777", "Ametystowa", "8", "48", "22222"));

        Company company2 = new Company("III",
                new Address("Niemcy", "zzzz", "Berlin",
                        "77-222", "eeeee", "33", "77", "453556"));



        TreeMap<TelephoneNumber, Object> treeMap = new TreeMap<>();

        treeMap.put(person1.getAddress().getTelephoneNumber(), person1);
        treeMap.put(company2.getAddress().getTelephoneNumber(), company2);
        treeMap.put(person2.getAddress().getTelephoneNumber(), person2);
        treeMap.put(company1.getAddress().getTelephoneNumber(), company1);
                
        Iterator<Map.Entry<TelephoneNumber, Object>> iterator = treeMap.entrySet().iterator();
        
        while (iterator.hasNext()) {
                Map.Entry<TelephoneNumber, Object> entry = iterator.next();
                System.out.println("Key: " + entry.getKey().telephoneNumberDescription() +
                                "\n\nValue:\n\n" + ((TelephoneEntry) entry.getValue()).description() + "\n\n\n");
        }

    }
}

