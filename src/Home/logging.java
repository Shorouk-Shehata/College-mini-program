/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home;

/**
 *
 * @author dell
 */
public class logging {
    private String username;
    private String password;

    public logging(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "logging{" + "username=" + username + ", password=" + password + '}';
    }
    
    public logging() {
    }

    public String getPassword() {
        return password;
    }
    public void getText(){
    
    
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
   
        

}
