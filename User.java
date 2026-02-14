package clinica;

public class User extends Person{
    private String username;
    private String password;
    private Role role;

    public User(){

    }
    
    public User(String firstName,String lastName, String document, String email, String cellphone, java.time.LocalDate birthday, String address,
                String username, String password, Role role){
        super(firstName,lastName, document, email, cellphone, birthday, address); //llamado a los atributos del padre (Person)
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public String getFirstName(){
        return this.getfirstName();
    }

    public void setFirstName(String firstName){
        this.setfirstName(firstName);
    }

     public String getLastName(){
        return this.getlastName();
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
}
