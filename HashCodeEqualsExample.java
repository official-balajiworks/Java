import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return id == s.id && name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return id * 31 + name.hashCode();
    }
}

public class HashCodeEqualsExample {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(101, "Alice");

        set.add(s1);
        set.add(s2);

        System.out.println("Set size: " + set.size()); // Will print 1 because s1 and s2 are equal
    }
}
