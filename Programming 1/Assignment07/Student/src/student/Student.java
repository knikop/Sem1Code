/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *The Student Class
 * @author Kosta Nikopoulos
 */
public class Student {
    //Data members of the class
    private String name;
    private String gender;
    private String email;
    private Course course1;
    private Course course2;
    private Course course3;
    //The Default Constructor
    public Student(){
        this.name = null;
        this.gender = null;
        this.email = null;
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();        
    }
    public Student(String name, String gender, String email){
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();
    }
    //Constructor with all the data members
    public Student(String name, String gender, String email, Course course1, Course course2, Course course3){
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
    //Copy Constructor
    public Student(Student copy){
        this.name = copy.name;
        this.gender = copy.gender;
        this.email = copy.email;
        this.course1 = copy.course1;
        this.course2 = copy.course2;
        this.course3 = copy.course3;
    }
    //Checks if the course was passed
    public double calcPassedCourseNum(){
        int passedCourseNum = 0;
        if(course1.isPassed())
            passedCourseNum++;
        if(course2.isPassed())
            passedCourseNum++;
        if(course3.isPassed())
            passedCourseNum++;
        return passedCourseNum;
    }
    //Calculates the total credits of the courses
    public double calcTotalCredit(){
        double totalCredit = 0;
        if(course1.isPassed())
            totalCredit += course1.getCredit();
        if(course2.isPassed())
            totalCredit += course2.getCredit();
        if(course3.isPassed())
            totalCredit += course3.getCredit();
        return totalCredit;
    }
    //Checks to see if the email is valid/real
    public boolean isEmailValid(String email){
        boolean result = false;
        if(email.charAt(0) == 'g' || email.charAt(0) == '.')
            System.out.println("Please enter a valid email address");
        else if(email.contains("@.")|| email.contains(".@"))
            System.out.println("Please enter a valid email address");
        else if(email.length() < 320)
            return true;
        return result;
    }
    //equals the student values with the student values
    public boolean equals(Student student){
        return this.name.equals(student.name) &&
                this.gender.equals(student.gender) &&
                this.email.equals(student.email) && 
                this.course1.equals(student.course1) &&
                this.course2.equals(student.course2) && 
                this.course3.equals(student.course3);
    }
    @Override
    public String toString(){
        String str = "";
        str += String.format("%-15s: s\n", "Name", name);
        str += String.format("%-15s: s\n", "Gender", gender);
        str += String.format("%-15s: s\n", "Email", email);
        str += String.format("\n");
        str += String.format("%-17s%-20s%-10s: s\n", "Course", "Name", "Credit",
                "Score");
        str += String.format("------------------------------------------------"
                       + "----------\n");
        str += String.format("%-15s: %-20s%-10.1f%.1f\n", "Course 1", 
                course1.getCourseName(), course1.getCredit(), course1.calcFinalScore());
        str += String.format("%-15s: %-20s%-10.1f%.1f\n", "Course 2", 
                course2.getCourseName(), course2.getCredit(), course2.calcFinalScore());
        str += String.format("%-15s: %-20s%-10.1f%.1f\n", "Course 3", 
                course3.getCourseName(), course3.getCredit(), course3.calcFinalScore());
        str += String.format("%-15s: %f\n", "Passed Course", calcPassedCourseNum());
        str += String.format("%-15s: %.1f\n", "Passed Course", calcTotalCredit());
        return str;
    }  
    //The getters and setters for the data members
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Course getCourse1(){
        return course1;
    }
    public void setCourse1(Course course1){
        this.course1 = course1;
    }
    public Course getCourse2(){
        return course2;
    }
    public void setCourse2(Course course2){
        this.course2 = course2;
    }
    public Course getCourse3(){
        return course3;
    }
    public void setCourse3(Course course3){
        this.course3 = course3;
    }
}