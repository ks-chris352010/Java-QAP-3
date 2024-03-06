class CollegeStudent extends Student {
    private int myYear; // Student year
    private String myMajor; // Student major

    // Constructor:
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    // toString method:
    public String toString() {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }

    // Getters:
    public int getMyYear() {
        return myYear;
    }
    
    public String getMyMajor() {
        return myMajor;
    }

    // Settters:
    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }

    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }
}
