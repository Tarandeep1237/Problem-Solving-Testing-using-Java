import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        int k = sc.nextInt();

        students.stream()
                // Sort by marks DESC, then name ASC
                .sorted(Comparator.comparing(Student::getMarks).reversed()
                        .thenComparing(Student::getName))
                .limit(k) // top K
                .map(Student::getName)
                .forEach(name -> System.out.print(name + " "));
    }
}
