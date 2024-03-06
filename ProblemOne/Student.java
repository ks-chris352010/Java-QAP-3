class Student extends Person {
    protected String myIdNum;    // Student Id Number
    protected double myGPA;      // Grade point average
    
    // Student constructor:
    public Student(String name, int age, String gender, String idNum, double gpa)  {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }  
    
    // toString method:
    public String toString() {
        return "Student: " + myName + " Age: " + myAge + ", ID: " + myIdNum + ", GPA:" + myGPA;
    }

    // Getters:
    public String getMyIdNum() {
        return myIdNum;
    }
    
    public double getMyGPA() {
        return myGPA;
    }

    // Setters
    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }
}
    