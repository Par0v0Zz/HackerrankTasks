package DataStructures;

/**
 *
 */

import java.util.*;

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa  = cgpa;

    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    ArrayList<Student> students = new ArrayList<>();

    List<Student> getStudents(List<String> events) {
        PriorityQueue pq = new PriorityQueue<>(
                Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getID)
        );
        for (String event : events) {
            if (event.startsWith("ENTER")) {
                String[] tokens = event.split(" ");
                String name = tokens[1];
                double cgpa = Double.parseDouble(tokens[2]);
                int id = Integer.parseInt(tokens[3]);
                pq.add(new Student(id, name, cgpa));
            } else {
                pq.poll();
            }
        }
        Student first = (Student) pq.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = (Student) pq.poll();

            }
        }
        return students;
    }
}

class StudentComparator implements Comparator<Student> {
    double epsilon = 0.0001;
    @Override
    public int compare(Student s1, Student s2) {
        if (Math.abs(s1.getCGPA() - s2.getCGPA()) > epsilon) {
            return s1.getCGPA() < s2.getCGPA() ? 1 : -1;
        } else if ( ! s1.getName().equals(s2.getName())) {
            return s1.getName().compareTo(s2.getName());
        } else {
            return s1.getID() - s2.getID();
        }
    }
}

