package Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import project1_GUI.*;



public class Main {
        public static void main(String[] args){
            
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); // current directory				
	checkDirectoryContents(currentDir);
        
    
        new Login_form().setVisible(true);
     
    }
        
        
        
        
        
        
public static void checkDirectoryContents(File dir){
    File[] files = dir.listFiles();
    boolean StudentFile = true;
    boolean DoctorFile = true;
    boolean ExamFile = true;
    boolean StudentExmFile = true;
    boolean AdminFile = true;


        for (File file : files) {

            if (file.getName().contains("Student.bin")) {
               StudentFile = false;
            } else if (file.getName().contains("Doctor.bin")) {
                DoctorFile = false;
            } else if (file.getName().contains("Exam.bin")) {
                ExamFile = false;
            } else if (file.getName().contains("StudentExm.bin")) {
                StudentExmFile = false;
            } else if (file.getName().contains("Admin.bin")) {
                AdminFile = false;
            }      
        }
        
        
        
        
        if (StudentFile) {
            Student x = new Student();
            x.commitToFile();
        } 
        
        if (DoctorFile) {
            Doctor x = new Doctor();
            x.commitToFile();
        } 
        
        if (ExamFile) {
            Exam x = new Exam();
            x.commitToFile();
        } 
        
        if (StudentExmFile) {
            StudentExam x = new StudentExam();
            x.commitToFile();
        } 

        if (AdminFile) {
            Admin x = new Admin();
            x.commitToFile();
        }         

    }
    
}
