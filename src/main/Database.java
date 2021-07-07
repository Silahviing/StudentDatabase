package main;

import java.util.*;

public class Database {
    private ArrayList<Student> students;

    public Database(){
        students = new ArrayList<>();
    }

    public void stringBuilder(){

        String format = "%-30s %-20s %-10s %-20s %-10s";

        System.out.println("Students:\n");
        String str = String.format(format, "Name:", "Student number:", "Age:", "Major:", "Average grade:");
        System.out.println(str);
        System.out.println();

        for (Student s : students){
            System.out.println(String.format(format,s.getName(),s.getStudentNr(),s.getAge(),s.getMajor(),s.getAverageGrade()));
        }
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(int sdtnr){
        for (int i = 0; i<students.size(); i++){
            if (students.get(i).getStudentNr() == sdtnr){
                students.remove(i);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public int getNumberOfStudents(){
        return students.size();
    }

    public double averageAge(){
        int averageAge = 0;
        for (Student s : students) {
            averageAge += s.getAge();
        }
        return (double) averageAge / (double) getNumberOfStudents();
    }

    public double averageGrade(){
        int averageGrade = 0;
        for (Student s : students){
            averageGrade += s.getAverageGrade();
        }
        return (double) averageGrade / (double) getNumberOfStudents();
    }

    public void popularMajor(){
        Map<String, Integer> count = new HashMap<>();
        for (Student s : students){
            String major = s.getMajor();
            if (! count.containsKey(major)){
                count.put(major,1);
            } else {
                int value = count.get(major);
                value++;
                count.put(major, value);
            }
        }
        List <String> mostCommons = new ArrayList<>();
        int maxMajor = Collections.max(count.values());

        for (Map.Entry<String,Integer> e : count.entrySet()){
            if (e.getValue() == maxMajor){
                mostCommons.add(e.getKey());

            }
        }
        System.out.println("Most popular majors: "+mostCommons);
    }
}
