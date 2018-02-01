package DataStructures;

/**
 *
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student1 {
    private String fname;
    private double cgpa;
    private int token;
    public Student1(String fname, double cgpa, int token) {
        this.fname = fname;
        this.cgpa  = cgpa;
        this.token = token;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        PriorityQueue<Student1> pq = new PriorityQueue<>(n, new Student1Comparator());
        while (n-- > 0) {
            String event = scan.next();
            switch (event) {
                case "ENTER":
                    String fname = scan.next();
                    double cgpa  = scan.nextDouble();
                    int    token = scan.nextInt();
                    pq.add(new Student1(fname, cgpa, token));
                    break;
                case "SERVED":
                    pq.poll();
                    break;
                default:
                    break;
            }
        }
        scan.close();

        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                Student1 s = pq.remove();
                System.out.println(s.getFname());
            }
        }
    }
}

class Student1Comparator implements Comparator<Student1> {
    double epsilon = 0.001;
    @Override
    public int compare(Student1 s1, Student1 s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
        } else if ( ! s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        } else {
            return s1.getToken() - s2.getToken();
        }
    }
}
