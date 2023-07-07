package Project;

import java.io.Serializable;


public class Person implements Serializable {
    
    
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;
    protected String gender;
    
    
    
    private String userName;
    private String password;
    private String homeAddress;
    
    FileManger FManger = new FileManger();
    
    public Person(){
    }
    
    public Person(int id , String firstName , String lastName , String phone , String email , String gender){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phone=phone;
        this.email=email;
        this.gender=gender;
        
    }
    
    public void setId (int id){
        this.id=id;
    }
    
    public void setFirstName (String firstName){
    this.firstName=firstName;
    }
    
    public void setLastName (String lastName){
    this.lastName=lastName;
    }
    
    public void setPhone (String phone){
    this.phone=phone;
    }
    
    public void setEmail (String email){
    this.email=email;
    }
    
    public void setGender (String gender){
    this.gender=gender;
    }  
    
    public void setUserName (String userName){
    this.userName=userName;
    }   
    
    public void setPassword (String password){
    this.password=password;
    }   
    
    public void setHomeAddress (String homeAddress){
    this.homeAddress=homeAddress;
    }
    
    
    
    
    
    
    public int getId (){
        return id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getGender(){
        return gender;
    } 
    
    public String getUserNamed(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getHomeAddress(){
        return homeAddress;
    }   
}
