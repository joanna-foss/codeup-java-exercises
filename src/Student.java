public class Student {
    public static void main(String[] args) {
        //before constructors: similar to JS perhaps
//        Student mcStudent = new Student();
//        mcStudent.name = "Ron";
//        mcStudent.cohort = "Achilles";
//
//        System.out.println(mcStudent.name + " is in the " + mcStudent.cohort + " cohort.");
        Student shanshan = new Student("Shanshan S.");
        System.out.println("shanshan.name = " + shanshan.name + "\nshanshan.cohort = " + shanshan.cohort);

        //First constructor experiment:
        Student kenneth = new Student("Kenneth H.", "Deimos");
        System.out.printf("%s is the student and %s is their cohort.", kenneth.name, kenneth.cohort);
    }

    public String name;
    public String cohort;

    //Now, let's add a constructor - what is it? A METHOD OF OBJECT CREATION
    public Student(String studentName){
        name = studentName;
        cohort = "unassigned";
    }
    public Student(String studentName, String cohortName){
        name = studentName;
        cohort = cohortName;
    }
}
