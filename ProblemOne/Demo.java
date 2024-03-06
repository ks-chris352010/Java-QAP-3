public class Demo {
    public static void main(String[] args) {
        // Create a Person
        Person person = new Person("Ryan Gunichard", 27, "M");
        System.out.println("Person: " + person.toString());

        // Create a Student
        Student student = new Student("Chris 'Mad Dog' Cormier", 20, "F", "123456", 3.5);
        System.out.println("Student: " + student.toString());

        // Create a Teacher
        Teacher teacher = new Teacher("Dr. Malik", 22, "F", 5000000.0, "Java");
        System.out.println("Teacher: " + teacher.toString());

        // Create a CollegeStudent
        CollegeStudent collegeStudent = new CollegeStudent("Bob Brown", 22, "M", "789012", 3.8, 2, "Computer Science");
        System.out.println("College Student: " + collegeStudent.toString());

        // Test getters and setters
        System.out.println("\nTesting getters and setters:");

        // Person 
        person.setMyName("Jane Doe");
        person.setMyAge(25);
        person.setMyGender("F");
        System.out.println("Updated Person: " + person.toString());

        // Student
        student.setMyIdNum("654321");
        student.setMyGPA(3.9);
        System.out.println("Updated Student: " + student.toString());

        // Teacher
        teacher.setMySalary(60000.0);
        teacher.setMySubject("Physics");
        System.out.println("Updated Teacher: " + teacher.toString());

        // CollegeStudent
        collegeStudent.setMyYear(3);
        collegeStudent.setMyMajor("Electrical Engineering");
        System.out.println("Updated College Student: " + collegeStudent.toString());
    }
}
