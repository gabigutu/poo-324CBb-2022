public class Student implements Comparable<Student> {
    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    @Override
    public int compareTo(Student o) {
        return this.nume.compareTo(o.nume);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
