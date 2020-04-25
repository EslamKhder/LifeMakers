package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eng Eslam khder
 */
@Entity
@Table(name="Volunteer")
public class Volunteer {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "First_Name",nullable = false)
    private String fname;
    @Column(name = "Last_Name",nullable = false)
    private String lname;
    @Column(name = "Age",nullable = false)
    private int age;
    @Column(name = "Phone",nullable = false)
    private String phone;
    @Column(name = "City",nullable = false)
    private String city;
    @Enumerated(EnumType.STRING)
    @Column(name = "Gender",nullable = false)
    private Gender gender;
    @Column(name = "MESSAGE")
    private String message;

    public Volunteer() {
        
    }
    
    public Volunteer(int id,String fname, String lname, int age, String phone, String city, Gender gender, String message) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.phone = phone;
        this.city = city;
        this.gender = gender;
        this.message = message;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
