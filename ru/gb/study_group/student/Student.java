package ru.gb.study_group.student;

import ru.gb.study_group.group.GroupItem;
import ru.gb.study_group.group.StudyGroup;
import java.util.ArrayList;
import java.util.List;
public class Student implements Comparable<Student>, GroupItem {
    private long id;
    private String name;
    private int age;

    public Student(long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{"+
                "id=" + id +
                ",name ='"+ name + '\'' +
                ". age ="+ age +
                '}';

    }
    @Override
    public int getAge(){
        return age;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public int compareTo(Student o){
        return name.compareTo(o.name);
    }
}
