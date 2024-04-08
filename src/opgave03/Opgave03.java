package opgave03;

import java.util.ArrayList;
import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();
        runners.forEach(t -> System.out.println(t.getName() + " " + t.getLapTime()));
        System.out.println();
        runners.forEach(t -> {
            if (t.getLapTime() < 30) {
                System.out.println(t.getName() + " " + t.getLapTime());
            }
        });
        System.out.println();
        runners.sort((t, d) -> t.getLapTime() - d.getLapTime());
        System.out.println(runners);
    }
}
