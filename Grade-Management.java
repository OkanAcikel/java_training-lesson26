/*
╔══════════════════════════════════════════════════════╗
║                 JAVA ASSIGNMENT                      ║
╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Course:
Java Software Development

Topic:
Student Grade Management

Difficulty:
Intermediate

Year:
2026

╠══════════════════════════════════════════════════════╣

OBJECTIVE:

Implement a grade management system for students using
collections and object-oriented design.

╠══════════════════════════════════════════════════════╣

INSTRUCTIONS:

• Implement all TODO sections
• Do not modify method signatures
• Write clean and readable code
• Validate input data

╠══════════════════════════════════════════════════════╣

REQUIREMENTS:

Create the following components:

1. class Student
   Attributes:
   - name
   - id
   - Map<String, List<Double>> grades

   Methods:
   - constructor
   - addGrade(String subject, double grade)
   - calculateAverage()
   - bestGrade()
   - worstGrade()

2. class School
   Attributes:
   - List<Student> students

   Methods:
   - addStudent(Student s)
   - findStudent(String id)
   - printAllStudents()
   - printBestStudent()

╠══════════════════════════════════════════════════════╣

RULES:

• Student name and id must not be empty
• Grade must be between 1.0 and 6.0
• Subject names must not be null or empty
• Store all grades grouped by subject

╠══════════════════════════════════════════════════════╣

BONUS:

• calculateSubjectAverage(String subject)
• removeGrade(String subject, double grade)
• printStudentReport()
• printStudentsSortedByAverage()

╠══════════════════════════════════════════════════════╣

TEST IDEA:

Create at least 3 students.
Add grades in multiple subjects.
Print averages.
Identify the student with the best average.

╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Java Programming Course

╚══════════════════════════════════════════════════════╝
*/

import java.util.List;
import java.util.Map;

class Student {

    // TODO:
    // Define all required attributes

    public Student(String name, String id) {
        // TODO:
        // Validate input
        // Initialize attributes
    }

    public String getName() {
        // TODO:
        return null;
    }

    public String getId() {
        // TODO:
        return null;
    }

    public Map<String, List<Double>> getGrades() {
        // TODO:
        return null;
    }

    public void addGrade(String subject, double grade) {
        // TODO:
        // Validate subject and grade
        // Add the grade to the correct subject list
    }

    public double calculateAverage() {
        // TODO:
        // Calculate the average across all grades
        return 0;
    }

    public double bestGrade() {
        // TODO:
        // Return the best grade
        return 0;
    }

    public double worstGrade() {
        // TODO:
        // Return the worst grade
        return 0;
    }
}

class School {

    // TODO:
    // Define the student list

    public void addStudent(Student s) {
        // TODO:
        // Add a student to the school
    }

    public Student findStudent(String id) {
        // TODO:
        // Find and return a student by id
        return null;
    }

    public void printAllStudents() {
        // TODO:
        // Print all students
    }

    public void printBestStudent() {
        // TODO:
        // Print the student with the best average
    }
}

public class Main {
    public static void main(String[] args) {

        /*
        TODO:
        1. Create a School object
        2. Create at least 3 students
        3. Add several grades in different subjects
        4. Print all students
        5. Print each student's average
        6. Print the best student
        */
    }
}
