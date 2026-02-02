import java.util.*;


public class SecondHighestStream {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Using Stream API to find second highest
        Optional<Integer> secondHighest =
                list.stream()
                    .distinct()                    // remove duplicates
                    .sorted(Comparator.reverseOrder()) // descending order
                    .skip(1)                        // skip highest
                    .findFirst();                   // get second highest

        if (secondHighest.isPresent()) {
            System.out.println(secondHighest.get());
        } else {
            System.out.println(-1);
        }
         sc.close();

    }
}
