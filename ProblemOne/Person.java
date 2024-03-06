class Person {
    protected String myName ;   // name of the person
    protected int myAge;        // person’s age
    protected String myGender;  // “M” for male, “F” for female
    
    // Constructor
    public Person(String name, int age, String gender)  {
        myName = name; myAge = age ; myGender = gender;   
    }

    // toString method.
    public String toString()  {
        return myName + ", age: " + myAge +  ", gender: " +myGender;
    }

    // Getters:
    public String getMyName() {
        return myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    // Setters:
    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }
}
    