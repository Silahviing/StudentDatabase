package main;

public class Main {
    public static void main(String[] args) {
        Database dtb = new Database();

        dtb.addStudent(new Student("Gisela Heilmund",190045677,24,"Psychology",3.4));
        dtb.addStudent(new Student("Jürgen Beilschmidt",190044566,21,"Architecture",2.4));
        dtb.addStudent(new Student("Finndus Taylor",190047843,26,"Biology",1.0));
        dtb.addStudent(new Student("Mary Hyland",190041111,20,"Math",3.0));
        dtb.addStudent(new Student("Roy Palmer",190049066,22,"Nutrition",3.2));
        dtb.addStudent(new Student("Luca Barth",190044777,21,"Anatomy",3.1));
        dtb.addStudent(new Student("Florian Ritter",190043557,24,"Ecology",2.1));
        dtb.addStudent(new Student("Maik Probst",190049000,28,"Genetics",2.0));
        dtb.addStudent(new Student("Christin Furst",190043466,29,"Toxicology",3.9));
        dtb.addStudent(new Student("Cai Lo",190042345,22,"Accounting",1.4));
        dtb.addStudent(new Student("Oliver Beaulieu",190041234,30,"Finance",1.6));
        dtb.addStudent(new Student("Elide Onio",190043412,26,"Computer Science",2.6));
        dtb.addStudent(new Student("Johanna Fleischer",190042314,22,"Art",2.3));
        dtb.addStudent(new Student("Qian Chiu",190043422,23,"Engineering",3.3));
        dtb.addStudent(new Student("Eikou Tsuji",190044533,27,"Language",3.2));
        dtb.addStudent(new Student("Jonas Pabst",190043456,21,"Literature",2.4));
        dtb.addStudent(new Student("Veronica Nucci",190042346,20,"Anatomy",1.8));
        dtb.addStudent(new Student("Manville Robert",190045563,25,"Nutrition",1.3));
        dtb.addStudent(new Student("Raneem Hasibah Essa",190044536,27,"Architecture",2.2));
        dtb.addStudent(new Student("Katrin Lind",190046743,26,"Psychology",3.4));
        dtb.addStudent(new Student("Peter Nacht",190035532,23,"Engineering",1.3));
        dtb.addStudent(new Student("Zygmunt Grabowski",190037888,28,"Biology",2.0));
        dtb.addStudent(new Student("Niklas Schulze",190039876,23,"Nutrition",3.0));
        dtb.addStudent(new Student("Hulyah Ruwaidah Tahan",190032454,32,"Accounting",2.5));
        dtb.addStudent(new Student("Erik Mayre",190046666,24,"Art",1.2));
        dtb.addStudent(new Student("Christina Schröder",190046785,24,"Anatomy",1.0));
        dtb.addStudent(new Student("Kishin Matsubara",190043466,26,"Ecology",3.0));
        dtb.addStudent(new Student("Heironim Sobczak",190043235,29,"Biology",3.2));
        dtb.addStudent(new Student("Eric Dresdner",190036655,22,"Astronomy",2.5));
        dtb.addStudent(new Student("Markus Hoover",190038899,24,"Architecture",2.8));
        dtb.addStudent(new Student("Tanja Egerton",190047765,20,"Language",3.0));
        dtb.addStudent(new Student("Simone Scherer",190040998,26,"Anatomy",3.6));
        dtb.addStudent(new Student("Laura Bach",190043000,23,"Astronomy",2.0));
        dtb.addStudent(new Student("Dominik Fuchs",190030000,28,"Finance",2.3));
        dtb.addStudent(new Student("Ulrike Ehrlichmann",190031000,22,"Genetics",2.1));
        dtb.addStudent(new Student("Ursula Eisenberg",190041000,33,"Genetics",2.6));
        dtb.addStudent(new Student("Stephanie Dresdner",190042000,31,"Anatomy",2.6));
        dtb.addStudent(new Student("Franziska Kuester",190043009,24,"Ecology",2.3));
        dtb.addStudent(new Student("Torsten Braun",190044000,22,"Architecture",1.0));
        dtb.addStudent(new Student("Tobias Biermann",190045000,23,"Biology",1.5));
        dtb.addStudent(new Student("Christian Lehmann",190046000,22,"Toxicology",1.6));
        dtb.addStudent(new Student("Uwe Grunwald",190047000,26,"Biology",1.6));
        dtb.addStudent(new Student("Jana Müller",190048000,24,"Ecology",2.6));
        dtb.addStudent(new Student("Monika Busch",190049000,29,"Astronomy",3.3));
        dtb.addStudent(new Student("Marina König",190041100,25,"Toxicology",3.2));
        dtb.addStudent(new Student("Thomas Koertig",190041200,20,"Astronomy",3.5));
        dtb.addStudent(new Student("Sarah Schmidt",190041300,24,"Computer Science",3.1));
        dtb.addStudent(new Student("Jens Himmel",190041400,22,"Math",3.0));

        dtb.stringBuilder();

        System.out.println();

        System.out.println("Number of students: "+dtb.getNumberOfStudents());
        System.out.println("Average age: "+dtb.averageAge());
        System.out.println("Average grades: "+dtb.averageGrade());
        dtb.popularMajor();

    }
}
