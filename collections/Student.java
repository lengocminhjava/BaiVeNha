package baitapvenha10.collections;

import java.util.HashSet;
import java.util.Set;

public class Student {
        private int id;
        private String name;
        private String clazz;

    public Student() {
    }

    public Student(int id, String name, String clazz) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Student> st = new HashSet<Student>();
        st.add(new Student(1,"Nam","10A"));
        st.add(new Student(2,"Bình","11A"));
        st.add(new Student(3,"Dũng","12A"));
        st.add(new Student(1,"Nam","10A"));
        System.out.println(st.size());
        for(Student hs:st){
            System.out.println(hs);
        }
        // Khi tạo với set đối tượng khác với tạo với set mảng
    }
}
