package Table;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "человек")
public class Human {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Set<Employee> employee;
    private Set<Client> client;


    public Human(String firstName,String lastName,String patronymic){
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


    @OneToMany(mappedBy = "human", targetEntity = Employee.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Employee> getEmployee() {
        return employee;
    }
    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }


    @OneToMany(mappedBy = "human", targetEntity = Client.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Client> getClient() {
        return client;
    }
    public void setClient(Set<Client> client) {
        this.client = client;
    }
}
