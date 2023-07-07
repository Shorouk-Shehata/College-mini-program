package Project;

import static Project.Student.Students;
import java.io.Serializable;
import java.util.ArrayList;


public class Doctor extends Person implements Serializable {
    
    private String course;
    
  
    private final String doctorFileName ="Doctor.bin";   
    
    public static ArrayList<Doctor> Doctors =new ArrayList<Doctor>();
    
    
    
    public Doctor(){
        super();
      
    }
    
    public Doctor(int id , String firstName , String lastName , String phone , String email , String gender , String course){
        super(id , firstName , lastName , phone , email  , gender);
        this.course=course;
    }
    
    public void setCourse(String course){
        this.course=course;
    }
    
    public String getCourse(){
        return course;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    public boolean addDoctor() {
        loadFromFile();
        Doctors.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(doctorFileName, Doctors);
    }

    public void loadFromFile() {
        Doctors = (ArrayList<Doctor>) FManger.read(doctorFileName);
    }

    private int getDoctorIndex(int id) {
        for (int i = 0; i < Doctors.size(); i++) {
            if (Doctors.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public Doctor searchDoctorById(int id) {
        Doctor temp = new Doctor();
        loadFromFile();
        int index = getDoctorIndex(id);
        if (index != -1) {
            return Doctors.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<Doctor> listDoctors() {
        loadFromFile();
        return Doctors;
    }

    public boolean updateDoctor() {
        loadFromFile();
        int index = getDoctorIndex(this.getId());

        if (index != -1) {
            Doctors.set(index, this);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteDoctor(int id) {
        loadFromFile();
        int index = getDoctorIndex(id);

        if (index != -1) {
            Doctors.remove(index);

            return commitToFile();
        }

        return false;
    }        
    
    
    
    
    
    
}
