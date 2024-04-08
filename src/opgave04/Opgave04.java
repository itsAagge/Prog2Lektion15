package opgave04;

import opgave03.Runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Opgave04 {
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

        // OBS: Throws exception.
        /*
        for (Runner runner : runners) {
            if (runner.getLapTime() >= 40)
                runners.remove(runner);
        }
        */

        //Med Collections.removeIf
        //runners.removeIf(p -> p.getLapTime() >= 40);

        //Med egen removeIf
        removeIf(runners, p -> p.getLapTime() >= 40);

        System.out.println(runners);
        System.out.println();

    }

    /**
    * Removes runners that satisfies the given filter.
    * Returns true, if any runner is removed.
    */
    public static boolean removeIf(List runners, Predicate<Runner> filter) {
        boolean removed = false;
        Iterator<Runner> itor = runners.iterator();
        while (itor.hasNext()) {
            if (filter.test(itor.next())) {
                itor.remove();
                removed = true;
            }
        }
        return removed;
    }
}
