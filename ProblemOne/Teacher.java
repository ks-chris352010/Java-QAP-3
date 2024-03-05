class Teacher extends Person {
    private double mySalary;
    private String mySubject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        mySalary = salary;
        mySubject = subject;
    }

    public String toString() {
        return super.toString() + ", salary: $" + mySalary + ", subject: " + mySubject;
    }

    public double getMySalary() {
        return mySalary;
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }
}
