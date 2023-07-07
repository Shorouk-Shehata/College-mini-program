package Project;


import static Project.Student.Students;
import java.io.Serializable;
import java.util.ArrayList;




public class Exam implements Serializable {
    
    
    private int qNumber;
    private String question;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String correct;
    
    
    
    
    FileManger FManger = new FileManger();
    
    
    
    private final String examFileName ="Exam.bin";   
    
    public static ArrayList<Exam> Exams =new ArrayList<Exam>();
    
    
    
    
    
    
    
    public Exam(){
   
    }
    
    public Exam(int qNumber , String question , String a1 , String a2 , String a3 , String a4 , String correct){
        this.qNumber=qNumber;
        this.question=question;
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
        this.a4=a4;
        this.correct=correct;
        
    }
    
    public void setQNumber(int qNumber){
        this.qNumber=qNumber;
    }    
    
    public void setQuestion(String question){
        this.question=question;
    }
    
    public void setA1(String a1){
        this.a1=a1;
    }    
    
     public void setA2(String a2){
        this.a2=a2;
    }   
    
     public void setA3(String a3){
        this.a3=a3;
    }   
    
     public void setA4(String a4){
        this.a4=a4;
    }  
    
    public void setCorrect(String correct){
        this.correct=correct;
    }   
     
     
     public int getQNumber(){
         return qNumber;
     }     
     
     public String getQuestion(){
         return question;
     }
     
     public String getA1(){
         return a1;
     }
     
     public String getA2(){
         return a2;
     }     
     
      public String getA3(){
         return a3;
     }    
     
      public String getA4(){
         return a4;
     }
      
     public String getCorrect(){
        return correct;
     }          
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

      
      
      
      
      
    public boolean addExam() {
        loadFromFile();
        Exams.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(examFileName, Exams);
    }

    public void loadFromFile() {
        Exams = (ArrayList<Exam>) FManger.read(examFileName);
    }

    private int getExamIndex(int id) {
        for (int i = 0; i < Exams.size(); i++) {
            if (Exams.get(i).getQNumber() == id) {
                return i;
            }
        }

        return -1;
    }

    public Exam searchExamById(int id) {
        Exam temp = new Exam();
        loadFromFile();
        int index = getExamIndex(id);
        if (index != -1) {
            return Exams.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<Exam> listExams() {
        loadFromFile();
        return Exams;
    }

    public boolean updateExam() {
        loadFromFile();
        int index = getExamIndex(this.getQNumber());

        if (index != -1) {
            Exams.set(index, this);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteExam(int id) {
        loadFromFile();
        int index = getExamIndex(id);

        if (index != -1) {
            Exams.remove(index);

            return commitToFile();
        }

        return false;
    }
      
      
      
    public boolean searchExamById2(int id) {
        Exam temp = new Exam();
        loadFromFile();
        int index = getExamIndex(id);
        if (index != -1) {
            return true;
        } else {
            return false;
        }
    }
      
      
      
      
    
}
