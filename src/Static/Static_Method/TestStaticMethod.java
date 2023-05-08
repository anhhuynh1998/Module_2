package Static.Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Huỳnh");
        Student s2 = new Student(222,"Nhật");
        Student s3 = new Student(333,"Anh");
        s1.display();
        s2.display();
        s3.display();
    }
}
