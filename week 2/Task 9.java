import java.util.*;
import java.time.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
}

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String dateStr = sc.next();
            LocalDate date = LocalDate.parse(dateStr);
            events.add(new Event(name, date));
        }

        int month = sc.nextInt();

        // 1️⃣ Sort events chronologically by date
        events.sort(Comparator.comparing(e -> e.date));
        for (Event e : events) {
            System.out.print(e.name + " ");
        }
        System.out.println();

        // 2️⃣ Earliest event
        Event earliest = Collections.min(events, Comparator.comparing(e -> e.date));
        System.out.println(earliest.name);

        // 3️⃣ Latest event
        Event latest = Collections.max(events, Comparator.comparing(e -> e.date));
        System.out.println(latest.name);

        // 4️⃣ Events in given month
        for (Event e : events) {
            if (e.date.getMonthValue() == month) {
                System.out.print(e.name + " ");
            }
        }
    }
}
