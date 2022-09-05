/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *The Course Class
 * @author Kosta Nikopoulos
 */
public class Course {
    //Data Members of the class
    private String courseName;
    private double credit;
    private double examScore;
    private double assignmentScore;
    
    //the default constructor
    public Course() {
        this.courseName = null;
        this.credit = 0;
        this.examScore = 0;
        this.assignmentScore = 0;
    }
    //Constructor with Courae and Credit
    public Course(String courseName, double credit){
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = 0;
        this.assignmentScore = 0;
    }
    //constructor with all data members
    public Course(String courseName,double credit,double examScore,double assignmentScore){
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = examScore;
        this.assignmentScore = assignmentScore;
    }
    //The copy constructor
    public Course(Course copy){
        this.courseName = copy.courseName;
        this.credit = copy.credit;
        this.examScore = copy.examScore;
        this.assignmentScore = copy.assignmentScore;
    }
    //Equals the course values with the course values
    public boolean equals(Course course){
        return this.courseName.equals(course.courseName) &&
                this.credit == (course.credit) &&
                this.examScore == (course.examScore) &&
                this.assignmentScore == (course.assignmentScore);
    }
    //Calculates the final score of the course
    public double calcFinalScore(){
        double finalScore = this.examScore*0.6+this.assignmentScore*0.4;
        return finalScore;
    }
    //Checks if the course was passed
    public boolean isPassed(){
        return this.calcFinalScore() >= 60;
    }
    @Override
    public String toString(){
        String str = "";
        str += String.format("%-15s: $s\n", "Course Name", courseName);
        str += String.format("%-15s: $s\n", "Credit", credit);
        str += String.format("%-15s: $s\n", "Exam Score", examScore);
        str += String.format("%-15s: $s\n", "Assignment Score", assignmentScore);
        str += String.format("%-15s: $s\n", "Final Score", calcFinalScore());
        return str;
    }
    //The getters and setters
     public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public double getCredit(){
        return credit;
    }
    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getExamScore(){
        return examScore;
    }
    public void setExamScore(double examScore){
        this.examScore = examScore;
    }
    public double getAssignmentScore(){
        return assignmentScore;
    }
    public void setAssignmentScore(double assignmentScore){
        this.assignmentScore = assignmentScore;
    }
}
