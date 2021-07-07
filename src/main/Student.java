package main;

public class Student {
    private String name;
    private int studentNr;
    private int age;
    private String major;
    private double averageGrade;

    public Student(String name, int studentNr, int age, String major, double averageGrade){
        this.name = name;
        this.studentNr = studentNr;
        this.age = age;
        this.major = major;
        this.averageGrade = averageGrade;
    }

    public String getName(){
        return name;
    }
    public int getStudentNr(){
        return studentNr;
    }
    public int getAge(){
        return age;
    }
    public String getMajor(){
        return major;
    }
    public double getAverageGrade(){
        return averageGrade;
    }
}
