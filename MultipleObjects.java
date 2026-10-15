
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class MultipleObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Rahul", 101);
        Student student2 = new Student("Amit", 102);

        student1.display();
        student2.display();
    }
}
