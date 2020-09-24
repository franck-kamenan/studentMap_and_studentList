package be.intecbrussel.opdrachten.opdracht3;

import java.util.*;

public class Person {

    private String name;
    private String gender;
    private List<Integer> gradeList;

    public Person(String name, String gender, List<Integer> gradeList) {
        this.name = name;
        this.gender = gender;
        this.gradeList = gradeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Integer> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Integer> gradeList) {
        this.gradeList = gradeList;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", gradeList=" + gradeList;
    }
}
