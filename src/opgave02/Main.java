package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        addPeople(peopleArray);
        System.out.println();

        //Den første person der hedder Klaus
        System.out.println("Den første person der hedder Klaus: " + peopleArray.findFirst(p -> p.getName().equals("Klaus")));
        //Den første person der har et navn med længden 4
        System.out.println("Den første person der har et navn med længden 4: " + peopleArray.findFirst(p -> p.getName().length() == 4));
        //Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1
        //findFirst
        System.out.println("Den første person i listen med alderen 44: " + peopleArray.findFirst(p -> p.getAge() == 44));
        System.out.println("Den første person i listen, hvis navn starter med S: " + peopleArray.findFirst(p -> p.getName().startsWith("S")));
        System.out.println("Den første person i listen, hvis navn indeholder mere end et 'i': " + peopleArray.findFirst(p -> {
            int antalI = 0;
            for (Character c : p.getName().toCharArray()) {
                if (c.equals('i')) {
                    antalI++;
                    if (antalI > 1) {
                        return true;
                    }
                }
            }
            return false;
        }));
        System.out.println("Den første person i listen af personer, hvis alder er lig længden af navnet: " + peopleArray.findFirst(p -> p.getName().length() == p.getAge()));

        System.out.println();

        //findAll
        System.out.println("Personer hvis navn indeholder 'i': " + peopleArray.findAll(p -> p.getName().contains("i")));
        System.out.println("Personer som starter med S: " + peopleArray.findAll(p -> p.getName().startsWith("S")));
        System.out.println("Personer hvis navn har længde 5: " + peopleArray.findAll(p -> p.getName().length() == 5));
        System.out.println("Personer hvis alder er mindst 6 og mindre end 40: " + peopleArray.findAll(p -> p.getAge() >= 6 && p.getAge() < 40));
    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addPerson(new Person("Bent", 25));
        peopleArray.addPerson(new Person("Susan", 34));
        peopleArray.addPerson(new Person("Mikael", 60));
        peopleArray.addPerson(new Person("Klaus", 44));
        peopleArray.addPerson(new Person("Birgitte", 17));
        peopleArray.addPerson(new Person("Liselotte", 9));
    }
}
