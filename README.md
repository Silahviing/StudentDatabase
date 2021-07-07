# StudentDatabase
### A practice assingment. Learning how to use classes properly

## Description
> This small project has three classes: Student, Database and Main. 
This was the first time I used classes properly and learned that you usually have a Main class that has the main function and gets all the other functions from the other classes.
I manually added the 100 different students and wrote a few functions using the student objects to display diferent stuff.


## Code Samples
> This is the located in the main function:

        System.out.println();

        System.out.println("Number of students: "+dtb.getNumberOfStudents());
        System.out.println("Average age: "+dtb.averageAge());
        System.out.println("Average grades: "+dtb.averageGrade());
        dtb.popularMajor();
        
> and this is one of the function used above:

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
    
> That was the first time I used a HashMap so please be kind.
