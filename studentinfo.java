class student {
    private String name;
    private int age;
    private String course;

    public student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nCourse: " + course);
    }
}

public class studentinfo {
    public static void main(String[] args) {
        student student1 = new student("pradeep", 19, "web develpment");
        student student2 = new student("alex", 20, "full stack develpment");

        System.out.println("1st student Information:");
        student1.displayInfo();

        System.out.println("2nd student Information:");
        student2.displayInfo();
    }
}
