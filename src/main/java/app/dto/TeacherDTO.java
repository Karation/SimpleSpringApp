package app.dto;

/**
 * Created by mkrec_000 on 16/06/2017.
 */
public class TeacherDTO {
    private String uuid;

    private String firstName;

    private String lastName;

    public TeacherDTO() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
