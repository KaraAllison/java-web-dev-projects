import java.util.ArrayList;

public class Course {
    private String name;
    private int courseCode;
    private ArrayList<Student> roster;

    public Course(String name, int courseCode, ArrayList<Student> roster) {
        this.name = name;
        this.courseCode = courseCode;
        this.roster = roster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }
}
