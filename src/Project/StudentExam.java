package Project;

import static Project.Student.Students;
import java.io.Serializable;
import java.util.ArrayList;




public class StudentExam extends Person implements Serializable{
    
    private String name;
    private int degree;
    
    private final String studentexamFileName = "StudentExm.bin";
    
    public static ArrayList<StudentExam> StudentExams = new ArrayList<StudentExam>();
    
    
    public StudentExam(){
        
    }
    
    
    public void setName(String name){
        this.name=name;
    }    
    
    public void setDegree(int degree){
        this.degree=degree;
    }    
    
    
   
    public String getName(){
        return name;
    }    
    
    public int getDegree(){
        return degree;
    }    
    
    
    
    
    
    
    
    
    
    
    
    public boolean addStudentExam() {
        loadFromFile();
        StudentExams.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(studentexamFileName, StudentExams);
    }

    public void loadFromFile() {
        StudentExams = (ArrayList<StudentExam>) FManger.read(studentexamFileName);
    }

    private int getStudentExamIndex(int id) {
        for (int i = 0; i < StudentExams.size(); i++) {
            if (StudentExams.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public StudentExam searchStudentExamById(int id) {
        StudentExam temp = new StudentExam();
        loadFromFile();
        int index = getStudentExamIndex(id);
        if (index != -1) {
            return StudentExams.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<StudentExam> listStudentExams() {
        loadFromFile();
        return StudentExams;
    }

    public boolean updateStudentExam() {
        loadFromFile();
        int index = getStudentExamIndex(this.getId());

        if (index != -1) {
            StudentExams.set(index, this);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteStudentExam(int id) {
        loadFromFile();
        int index = getStudentExamIndex(id);

        if (index != -1) {
            StudentExams.remove(index);

            return commitToFile();
        }

        return false;
    }    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
}
