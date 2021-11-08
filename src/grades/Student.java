package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    };

    public void addGrade(double grade){
        grades.add(grade);
    };

    public double getGradeAverage(){
        double average;
        double total = 0;
        for(int i = 0; i < this.grades.size(); i++){
            total += this.grades.get(i);
        }
        average = total/this.grades.size();
        return average;
    };
}
