package ru.vsu.sc.tretyakov_d_s;

public class Simulation {
    public static void main(String[] args) {
        Student student = new Student("ФКН", 3, 6, "Данила", "Третьяков");
        Dean dean = new Dean("Александр", "Крыловецкий", "aakryl@cs.vsu.ru", "+7 952-958-6639", "Декан");
        Professor professor = new Professor("Андрей", "Малыхин", "", "", "Старший преподаватель");

        dean.appointEmployee();
        dean.approveCurriculum();
        professor.postHomework();
        student.doHomework("task");
        student.sendHomework("task");
        professor.checkHomework();
    }
}

