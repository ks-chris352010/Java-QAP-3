class Teacher extends Person {
    private double mySalary; // Teacher salary
    private String mySubject; // Teacher subject

    // Constructor:
    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        mySalary = salary;
        mySubject = subject;
    }

    // toString method:
    public String toString() {
        return super.toString() + ", salary: $" + mySalary + ", subject: " + mySubject;
    }

    // Getters:
    public double getMySalary() {
        return mySalary;
    }

    public String getMySubject() {
        return mySubject;
    }

    // Setters:
    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }
}
