import java.util.ArrayList;

public class Student {
    private String name;
    private String studentID;
    private int semester;
    private ArrayList<String> courses;

    // menambahkan course
    public void addCourse(String courseName) {
        if (courses == null) {
            courses = new ArrayList<>();
          }
        courses.add(courseName);
    }

    // print info
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentID);
        System.out.println("Semester: " + semester);
        System.out.println("Courses:");
        for (String course : courses) {
            System.out.println("  - " + course);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public static void main(String[] args) {
        Student unhaStudent = new Student();

        unhaStudent.setName("Jing Yuan");
        unhaStudent.setStudentID("H0111111");
        unhaStudent.setSemester(2);
        unhaStudent.addCourse("Introduction to Erudition");
        unhaStudent.addCourse("Bahasa Mandarin");

        unhaStudent.printInfo();
    }

}
