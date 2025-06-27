import java.util.ArrayList;

// Faculty Class (Independent)
class Faculty {
    private String facultyName;
    private String specialization;

    // Parameterized Constructor
    public Faculty(String facultyName, String specialization) {
        this.facultyName = facultyName;
        this.specialization = specialization;
    }

    // Method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + facultyName + ", Specialization: " + specialization);
    }

    // Getter
    public String getFacultyName() {
        return facultyName;
    }
}

// University Class (Composition with Department, Aggregation with Faculty)
class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    // Parameterized Constructor
    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Method to add a department (Composition)
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
        System.out.println("Department " + departmentName + " added to " + universityName);
    }

    // Method to add a faculty (Aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        System.out.println("Faculty " + faculty.getFacultyName() + " added to " + universityName);
    }

    // Method to display university structure
    public void displayUniversityStructure() {
        System.out.println("\nUniversity: " + universityName);
        
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }

        System.out.println("\nFaculties:");
        for (Faculty faculty : faculties) {
            faculty.displayFacultyDetails();
        }
    }

    // Method to delete the university
    public void deleteUniversity() {
        departments.clear(); // Deletes all departments (Composition)
        faculties.clear();   // Just removes faculty references
        System.out.println("\nUniversity " + universityName + " and all its departments and faculties have been deleted.");
    }

    // Inner Department Class (Composition)
    private class Department {
        private String departmentName;

        // Constructor
        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        // Method to display department details
        public void displayDepartmentDetails() {
            System.out.println("- " + departmentName);
        }
    }
}

public class UniversityDepartmentFaculty {
    public static void main(String[] args) {
        // Create a university
        University university = new University("GLA University");

        // Add departments (Composition)
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");
        university.addDepartment("Business Administration");

        // Create faculty members (Independent)
        Faculty faculty1 = new Faculty("Dr. Ram Manohar", "Artificial Intelligence");
        Faculty faculty2 = new Faculty("Mr. Deepak Sharma", "Thermodynamics");
        Faculty faculty3 = new Faculty("Dr. Anjali Sharma", "Marketing Strategies");

        // Add faculties to university (Aggregation)
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addFaculty(faculty3);

        // Display university structure
        university.displayUniversityStructure();

        // Simulate deletion
        university.deleteUniversity();

        // Faculties can still exist independently
        System.out.println("\nFaculty members still exist independently:");
        faculty1.displayFacultyDetails();
        faculty2.displayFacultyDetails();
        faculty3.displayFacultyDetails();
    }
}
