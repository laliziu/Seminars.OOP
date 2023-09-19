package ru.gb.study_group;

import ru.gb.study_group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Pasha", 18);
        service.addStudent("Masha", 20);
        service.addStudent("Sasha", 17);
        service.addStudent("Dasha", 19);

        System.out.println(service.getStudentsInfo());
        service.sortByName();
        System.out.println(service.getStudentsInfo());
        service.sortByAge();
        System.out.println(service.getStudentsInfo());
    }
}
