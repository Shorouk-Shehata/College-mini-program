package Project;

import static Project.Student.Students;
import java.io.Serializable;
import java.util.ArrayList;




public class Admin extends Person implements Serializable{
    
    private String password;

    private final String adminFileName = "Admin.bin";
    
    public static ArrayList<Admin> Admins = new ArrayList<Admin>();    
 
    
    public Admin(){
        
    }
    
    
    
    public void setPassword(String password){
        this.password=password;
    }   
    
    
    
    public String getPassword(){
        return password;
    }
    
    
    
    









    public boolean addAdmin() {
        loadFromFile();
        Admins.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(adminFileName, Admins);
    }

    public void loadFromFile() {
        Admins = (ArrayList<Admin>) FManger.read(adminFileName);
    }

    private int getAdminIndex(int id) {
        for (int i = 0; i < Admins.size(); i++) {
            if (Admins.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }

    public Admin searchAdminById(int id) {
        Admin temp = new Admin();
        loadFromFile();
        int index = getAdminIndex(id);
        if (index != -1) {
            return Admins.get(index);
        } else {
            return temp;
        }
    }

    public ArrayList<Admin> listAdmins() {
        loadFromFile();
        return Admins;
    }

    public boolean updateAdmin() {
        loadFromFile();
        int index = getAdminIndex(this.getId());

        if (index != -1) {
            Admins.set(index, this);

            return commitToFile();
        }

        return false;
    }

    public boolean deleteAdmin(int id) {
        loadFromFile();
        int index = getAdminIndex(id);

        if (index != -1) {
            Admins.remove(index);

            return commitToFile();
        }

        return false;
    }    
    
    
    
    
}
