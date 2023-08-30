package entity_relationship;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Column(name = "Student_Name", nullable = false)
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roll;

//    * In OneToOne Mapping default is Eager Fetching
    @OneToOne(fetch = FetchType.LAZY)
    private StudentIdCard card;

//    * In OneToMany Mapping default is Lazy Fetching
    @OneToMany(mappedBy = "student")
    private List<Course> coursesList;

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }


    public StudentIdCard getCard() {
        return card;
    }

    public void setCard(StudentIdCard card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
