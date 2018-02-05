package DataStructures;

import java.util.*;

class StudentSort {
    private int    id;
    private String fname;
    private double cgpa;
    public StudentSort(int id, String fname, double cgpa) {
        super();
        this.id    = id;
        this.fname = fname;
        this.cgpa  = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        List<StudentSort> studentSortList = new ArrayList<>();
        while (testCases-- > 0) {
            int id       = scan.nextInt();
            String fname = scan.next();
            double cgpa  = scan.nextDouble();
            StudentSort st   = new StudentSort(id, fname, cgpa);
            studentSortList.add(st);
        }
        scan.close();

        Collections.sort(studentSortList, new StudentSortComparator());
        for (StudentSort st: studentSortList) {
            System.out.println(st.getFname());
        }
    }
}

class StudentSortComparator implements Comparator<StudentSort> {
    double epsilon = 0.001;
    @Override
    public int compare(StudentSort s1, StudentSort s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
        } else if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        } else {
            return s1.getId() - s2.getId();
        }
    }
}
