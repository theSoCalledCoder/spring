package org.demo.spring;

import java.util.*;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private List<Integer> ls=new ArrayList<>();
    private Set<Integer> st=new HashSet<>();

    public List<Integer> getLs() {
        return ls;
    }

    public void setLs(List<Integer> ls) {
        this.ls = ls;
    }

    public Map<String, Integer> getMp() {
        return mp;
    }

    public void setMp(Map<String, Integer> mp) {
        this.mp = mp;
    }

    public Set<Integer> getSt() {
        return st;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", ls=" + ls +
                ", st=" + st +
                ", mp=" + mp +
                '}';
    }

    public Student(int studentId, List<Integer> ls, Set<Integer> st, Map<String, Integer> mp, String studentAddress, String studentName) {
        this.studentId = studentId;
        this.ls = ls;
        this.st = st;
        this.mp = mp;
        this.studentAddress = studentAddress;
        this.studentName = studentName;
    }

    public void setSt(Set<Integer> st) {
        this.st = st;
    }

    private Map<String,Integer>mp=new HashMap<>();

    public Student(String studentAddress, String studentName, int studentId) {
        this.studentAddress = studentAddress;
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public Student() {
        super();
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
