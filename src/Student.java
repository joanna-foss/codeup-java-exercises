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

        //Second constructor experiement:
        Student mcKenneth = new Student("mcKen mcKow", "mcDeimos", 88.8);
        System.out.println(mcKenneth.grade);
    }

    public String name;
    public String cohort;
    private double grade;

    //Now, let's add a constructor - what is it? A METHOD OF OBJECT CREATION
    public Student(String studentName){
//        name = studentName;
//        cohort = "unassigned";
        this(studentName, "unassigned"); //constructor inside another constructor
    }
    public Student(String studentName, String cohortName){
        this.name = studentName;
        this.cohort = cohortName;
    }
    public Student(String studentName, String cohortName, double grade) {
        this.name = studentName;
        this.cohort = cohortName;
        this.grade = grade;
    }

    private double shareGrade() {
        return grade;
    }
}
