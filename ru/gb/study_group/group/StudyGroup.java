package ru.gb.study_group.group;

import ru.gb.study_group.student.Student;
import ru.gb.study_group.student.comparators.StudentComparatorByAge;
import ru.gb.study_group.student.comparators.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E extends GroupItem> implements Iterable<E>{
    private List<E> studentList;

    public StudyGroup(){
        studentList = new ArrayList<>();
    }
    public void addStudent(E student){
        studentList.add(student);
    }
    @Override
    public Iterator<E> iterator(){

        return new StudentIterator<>(studentList);
    }
    public void sortByName()
    {
        studentList.sort(new StudentComparatorByName<>());
    }
    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge<>());
    }
}
