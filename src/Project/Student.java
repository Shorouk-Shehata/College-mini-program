package Project;

import java.io.Serializable;
import java.util.ArrayList;




public class Student extends Person  implements Serializable {
    
    private int level;
    private double gpa;
    private String group;
    private String course1;
    private String course2;
    private String course3;

    private final String studentFileName = "Student.bin";
    
    public static ArrayList<Student> Students = new ArrayList<Student>();
    


    public Student(){
        
    }
    
    public Student(int id , String firstName , String lastName , String phone , String email , String gender , int level , double gpa , String group , String course1 , String course2 , String course3){
        super(id , firstName , lastName , phone , email , gender);
        this.level=level;
        this.gpa=gpa;
        this.group=group;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
    }

    public void setLevel(int level){
        this.level=level;
    }

    public void setGpa(double gpa){
        this.gpa=gpa;
    }

    public void setGroup(String group){
        this.group=group;
    }

    public void setCourse1(String course1){
        this.course1=course1;
    }

    public void setCourse2(String course2){
        this.course2=course2;
    }

    public void setCourse3(String course3){
        this.course3=course3;
    }



    public int getLevel(){
        return level;
    }

    public double getGpa(){
        return gpa;
    }

    public String getGroup(){
        return group;
    }

     public String getCourse1(){
        return course1;
    }

    public String getCourse2(){
        return course2;
    }

    public String getCourse3(){
        return course3;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean addStudent() {
        loadFromFile();
        Students.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(studentFileName, Students);
    }

    public void loadFromFile() {
        Students = (ArrayList<Student>) FManger.read(studentFileName);
    }

    private int getStudentIndex(int id) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public Student searchStudentById(int id) {
        Student temp = new Student();
        loadFromFile();
        int index = getStudentIndex(id);
        if (index != -1) {
            return Students.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<Student> listStudents() {
        loadFromFile();
        return Students;
    }

    public boolean updateStudent() {
        loadFromFile();
        int index = getStudentIndex(this.getId());

        if (index != -1) {
            Students.set(index, this);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteStudent(int id) {
        loadFromFile();
        int index = getStudentIndex(id);

        if (index != -1) {
            Students.remove(index);

            return commitToFile();
        }

        return false;
    }
    
  
    
}
