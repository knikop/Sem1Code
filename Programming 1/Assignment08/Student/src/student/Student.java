
package student;


/**
 * Class of Student, basic OOP exercise
 * @author Kosta NIkopoulos
 */
public class Student {              
    private String name;
    private int age;                
    private String gender;
    private String id;
    private String email;               
    private Address address;
    private static int nextId = 1;          
    private final static String SCHOOL_NAME = "Vanier College";

    public Student() {
        this.name = null;
        this.age = 0;
        this.gender = null;
        this.id = null;
        this.email = null;
        this.address = null;
    }
    
    public Student(String name, String gender) {            
        this.name = name;
        this.age = 0;
        this.gender = gender;
        this.id = String.format("%06d", nextId++);          
        generateEmail();
        this.address = null;
    }
    
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = String.format("%06d", nextId++);  
        generateEmail();
        this.address = null;
    }
    
    public Student(String name, int age, String gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = String.format("%06d", nextId++);  
        generateEmail();
        this.address = address;
    }
    
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.gender = student.gender;
        this.id = student.id;
        this.email = student.email;
        this.address = student.address;                   
        this.address = new Address(student.address);    
    }
    
    /**
     * To generate an email for a student
     */
    public void generateEmail() {
        email = String.format("%s@vaniercollege.qc.ca", name.toLowerCase());
    }
    
    public static boolean isNameValid(String name) {          
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isLetter(c) && c != ' ' && c != '-' && c != '\'')
                return false;
        }
        return true;
    }
    
    /**
     * To check if the student live far away from the school or not, the rule is:
     * 1. if the student live in Montreal, then print "not far"
     * 2. if the student live outside of Montreal, but inside QC, then print "not far, not close"
     * 3. if the student live outside of QC, then print "very far"
     */
    public void checkDistance() {
        if (address.getCity().equalsIgnoreCase("montreal"))
            System.out.println("not far");
        else if (address.getProvince().equalsIgnoreCase("qc"))
            System.out.println("not far, not close");
        else
            System.out.println("very far");
    }

    public boolean equals(Student student) {
        return this.name.equals(student.name) && 
                this.age == student.age &&
                this.gender.equals(student.gender) &&
                this.id.equals(student.id) &&
                this.email.equals(student.email) &&
                this.address.equals(student.address);
    }

    @Override
    public String toString() { 
        String str = "";
        
        str += String.format("Student from %s\n", SCHOOL_NAME);
        str += String.format("%-10s: %s\n", "ID", id);
        str += String.format("%-10s: %s\n", "Name", name);
        str += String.format("%-10s: %d\n", "Age", age);
        str += String.format("%-10s: %s\n", "Gender", gender);
        str += String.format("%-10s: %s\n", "Email", email);
        str += String.format("%-10s: %s\n", "Address", address);
        
        return str;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        if (isNameValid(name)) {
            this.name = name;
            email = String.format("%s@vaniercollege.qc.ca", name);
        }
        else
            System.out.println("Sorry, the new name is invalid....Request denyed");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        int atIdx = email.indexOf('@');
        name = email.substring(0, atIdx);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
