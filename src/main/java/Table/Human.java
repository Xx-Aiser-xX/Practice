package Table;

import jakarta.persistence.*;

@Entity
@Table(name = "человек")
public class Human {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;

    public Human(int id, String firstName,String lastName,String patronymic){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setPatronymic(patronymic);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_человека")
    public int getId() { return id;}

    public void setId(int id) { this.id = id;}

    @Basic
    @Column(name = "имя")
    public String getFirstName() { return firstName;}

    public void setFirstName(String firstName) { this.firstName = firstName;}
    @Basic
    @Column(name = "фамилия")
    public String getLastName() { return lastName;}

    public void setLastName(String lastName) { this.lastName = lastName;}
    @Basic
    @Column(name = "отчество")
    public String getPatronymic() { return patronymic;}

    public void setPatronymic(String patronymic) { this.patronymic = patronymic;}
}
