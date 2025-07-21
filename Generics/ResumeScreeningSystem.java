package Generics;

import java.util.ArrayList;
import java.util.List;

// Abstract base class for job roles
abstract class JobRole {
    protected String candidateName;
    protected int yearsOfExperience;

    public JobRole(String candidateName, int yearsOfExperience) {
        this.candidateName = candidateName;
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract void evaluate();
}

// Software Engineer role
class SoftwareEngineer extends JobRole {
    private String programmingLanguage;

    public SoftwareEngineer(String candidateName, int yearsOfExperience, String programmingLanguage) {
        super(candidateName, yearsOfExperience);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void evaluate() {
        System.out.println("Software Engineer Resume - Name: " + candidateName +
                ", Experience: " + yearsOfExperience + " years, Language: " + programmingLanguage);
    }
}

// Data Scientist role
class DataScientist extends JobRole {
    private String toolExpertise;

    public DataScientist(String candidateName, int yearsOfExperience, String toolExpertise) {
        super(candidateName, yearsOfExperience);
        this.toolExpertise = toolExpertise;
    }

    @Override
    public void evaluate() {
        System.out.println("Data Scientist Resume - Name: " + candidateName +
                ", Experience: " + yearsOfExperience + " years, Tools: " + toolExpertise);
    }
}

// Product Manager role
class ProductManager extends JobRole {
    private String domainKnowledge;

    public ProductManager(String candidateName, int yearsOfExperience, String domainKnowledge) {
        super(candidateName, yearsOfExperience);
        this.domainKnowledge = domainKnowledge;
    }

    @Override
    public void evaluate() {
        System.out.println("Product Manager Resume - Name: " + candidateName +
                ", Experience: " + yearsOfExperience + " years, Domain: " + domainKnowledge);
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    private List<T> resumeList;

    public Resume() {
        resumeList = new ArrayList<>();
    }

    public void addResume(T resume) {
        resumeList.add(resume);
        System.out.println("Resume added for: " + resume.candidateName);
    }

    public List<T> getAllResumes() {
        return resumeList;
    }
}

// Screening utility with wildcard method
class ResumeScreeningPipeline {
    public static void screenResumes(List<? extends JobRole> resumes) {
        System.out.println("Screening Resumes:");
        for (JobRole role : resumes) {
            role.evaluate();
        }
    }
}

// Main class
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create resume containers for each role
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        Resume<DataScientist> dsResumes = new Resume<>();
        Resume<ProductManager> pmResumes = new Resume<>();

        // Add Software Engineer resumes
        seResumes.addResume(new SoftwareEngineer("Ayush Raj", 3, "Java"));
        seResumes.addResume(new SoftwareEngineer("Ankit Singh", 5, "Python"));

        // Add Data Scientist resumes
        dsResumes.addResume(new DataScientist("Divya Sharma", 4, "TensorFlow"));
        dsResumes.addResume(new DataScientist("Ravi Mehta", 2, "Scikit-learn"));

        // Add Product Manager resumes
        pmResumes.addResume(new ProductManager("Pooja Verma", 6, "E-commerce"));
        pmResumes.addResume(new ProductManager("Karan Kapoor", 7, "Fintech"));

        // Screen all resumes using wildcard method
        System.out.println();
        ResumeScreeningPipeline.screenResumes(seResumes.getAllResumes());

        System.out.println();
        ResumeScreeningPipeline.screenResumes(dsResumes.getAllResumes());

        System.out.println();
        ResumeScreeningPipeline.screenResumes(pmResumes.getAllResumes());
    }
}
