import java.util.ArrayList;

public class User {
    private long Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private UserRole Role;
    private Facebook FacebookData;
    private ArrayList<Session> Sessions;

    public User() {
        Sessions = new ArrayList<>();
    }

    public ArrayList<Session> getSessions() {
        return Sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        Sessions = sessions;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public UserRole getRole() {
        return Role;
    }

    public void setRole(UserRole role) {
        Role = role;
    }

    public Facebook getFacebookData() {
        return FacebookData;
    }

    public void setFacebookData(Facebook facebookData) {
        FacebookData = facebookData;
    }
}
