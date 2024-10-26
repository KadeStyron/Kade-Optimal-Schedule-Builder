package edu.uga.devdogs.course_information.CourseSection;

import java.io.Serializable;
import java.util.List;

import edu.uga.devdogs.course_information.Course.Course;
import edu.uga.devdogs.course_information.Class.Class;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


// Java JPA entity represention for CourseSection
@Entity
public class CourseSection implements Serializable {
    // Variables
    @Id
    @GeneratedValue
    private long courseSectionId;

    private int crn;

    private int sec;

    private char stat;

    private double creditHoursLow;

    private double creditHoursHigh;

    private String instructor;

    private int term;

    private int classSize;

    private int seatsAvailable;

    private int year;

<<<<<<<< HEAD:services/course-information/src/main/java/edu/uga/devdogs/course_information/CourseSection/CourseSection.java
    // Relationships
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @OneToMany(mappedBy = "courseSection")
    private List<Class> classes;

    // Constructors, getters, setters, and toString 
    public CourseSection() {}
========
    /*
     * Relationships (not yet created)
     * To-Do: add relationships (one-to-one, one-to-many, many-to-one, many-to-many) here
     */

    /*
     * Constructors
     */

    public CourseSectionEntity() {}
>>>>>>>> 0a56d5a (Verified good DB design):services/course-information/src/main/java/edu/uga/devdogs/course_information/CourseSection/CourseSectionEntity.java

    public CourseSection(long courseSectionId, int crn, int sec, char stat, double creditHoursLow,
            double creditHoursHigh, String instructor, int term, int classSize, int seatsAvailable, int year, Course course, List<Class> classes) {
        this.courseSectionId = courseSectionId;
        this.crn = crn;
        this.sec = sec;
        this.stat = stat;
        this.creditHoursLow = creditHoursLow;
        this.creditHoursHigh = creditHoursHigh;
        this.instructor = instructor;
        this.term = term;
        this.classSize = classSize;
        this.seatsAvailable = seatsAvailable;
        this.year = year;
        this.course = course;
        this.classes = classes;
    }

    public CourseSection(int crn, int sec, char stat, double creditHoursLow, double creditHoursHigh, String instructor,
            int term, int classSize, int seatsAvailable, int year, Course course, List<Class> classes) {
        this.crn = crn;
        this.sec = sec;
        this.stat = stat;
        this.creditHoursLow = creditHoursLow;
        this.creditHoursHigh = creditHoursHigh;
        this.instructor = instructor;
        this.term = term;
        this.classSize = classSize;
        this.seatsAvailable = seatsAvailable;
        this.year = year;
        this.course = course;
        this.classes = classes;
    }

    /*
    * Getters and Setters
    */

    public long getId() {
        return courseSectionId;
    }

    public void setId(long id) {
        this.courseSectionId = id;
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public char getStat() {
        return stat;
    }

    public void setStat(char stat) {
        this.stat = stat;
    }

    public double getCreditHoursLow() {
        return creditHoursLow;
    }

    public void setCreditHoursLow(double creditHoursLow) {
        this.creditHoursLow = creditHoursLow;
    }

    public double getCreditHoursHigh() {
        return creditHoursHigh;
    }

    public void setCreditHoursHigh(double creditHoursHigh) {
        this.creditHoursHigh = creditHoursHigh;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

<<<<<<<< HEAD:services/course-information/src/main/java/edu/uga/devdogs/course_information/CourseSection/CourseSection.java
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
========
    /*
     * toString
     */
>>>>>>>> 0a56d5a (Verified good DB design):services/course-information/src/main/java/edu/uga/devdogs/course_information/CourseSection/CourseSectionEntity.java

    @Override
    public String toString() {
        return "CourseSection [courseSectionId=" + courseSectionId + ", crn=" + crn + ", sec=" + sec + ", stat="
                + stat + ", creditHoursLow=" + creditHoursLow + ", creditHoursHigh=" + creditHoursHigh + ", instructor="
                + instructor + ", term=" + term + ", classSize=" + classSize + ", seatsAvailable=" + seatsAvailable
                + ", year=" + year + "]";
    }


}

