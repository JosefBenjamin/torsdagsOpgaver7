import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> passedCourses = new ArrayList<String>();
    private ArrayList<String> currentCourses = new ArrayList<String>();

    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (!(passedCourses.contains(course))) {
            currentCourses.add(course);
            return true;
        } else {
            return false;
        }
    }
}