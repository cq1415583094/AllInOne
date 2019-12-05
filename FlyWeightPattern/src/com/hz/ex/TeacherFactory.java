package com.hz.ex;

import java.util.HashMap;
import java.util.Map;

public class TeacherFactory {
    private Map<String, Teacher> pool;

    public TeacherFactory(){
        pool = new HashMap<>();
    }

    public Teacher createTeacher(String number) {
        return new Teacher(number);
    }

    public Teacher getTeacher(String number) {
        Teacher teacher = pool.get(number);
        if (teacher == null) {
            teacher = this.createTeacher(number);
            pool.put(number, teacher);
        }
        return teacher;
    }
}