package ru.gb.study_group.service;

import ru.gb.study_group.group.StudyGroup;
import ru.gb.study_group.student.Student;

public class Service {
    private long id;
    private StudyGroup<Student> studyGroup;

    public Service(){
        studyGroup = new StudyGroup<>();
    }
    public void addStudent(String name, int age){
        Student student = new Student(id++,name,age);
        studyGroup.addStudent(student);
    }
    public String getStudentsInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Students:\n");
        for (Student student: studyGroup){
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void sortByName(){
        studyGroup.sortByName();
    }
    public void sortByAge(){
        studyGroup.sortByAge();;
    }
}
