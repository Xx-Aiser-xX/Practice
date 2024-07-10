package Table;

import Relationship.Manufactures;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "сотрудник")
public class Employee {
    private int id;
    private BranchOfTheOrganization branchOfTheOrganization;
    private Human human;
    private Date dataOfHiring;
    private double wages;
    private String post;
    private Date birthday;
    private Set<Manufactures> manufactures;


    public Employee(BranchOfTheOrganization branchOfTheOrganization, Human human,
                    Date dataOfHiring, double wages, String post, Date birthday){

        setBranchOfTheOrganization(branchOfTheOrganization);
        setHuman(human);
        setDataOfHiring(dataOfHiring);
        setWages(wages);
        setPost(post);
        setBirthday(birthday);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_сотрудника")
    public int getId() { return id;}
    public void setId(int id) { this.id = id;}


    @ManyToOne(optional = false)
    @JoinColumn(name = "филиал", referencedColumnName = "филиал")
    public BranchOfTheOrganization getBranchOfTheOrganization() {
        return branchOfTheOrganization;
    }
    public void setBranchOfTheOrganization(BranchOfTheOrganization branchOfTheOrganization) {
        this.branchOfTheOrganization = branchOfTheOrganization;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_человека", referencedColumnName = "id_человека")
    public Human getHuman() {
        return human;
    }
    public void setHuman(Human human) {
        this.human = human;
    }


    @Basic
    @Column(name = "дата_найма")
    @Temporal(TemporalType.DATE)
    public Date getDataOfHiring() { return dataOfHiring;}

    public void setDataOfHiring(Date dataOfHiring) {
        this.dataOfHiring = dataOfHiring;
    }
    @Basic
    @Column(name = "заработная_плата")
    public double getWages() { return wages;}

    public void setWages(double wages) { this.wages = wages;}
    @Basic
    @Column(name = "должность")
    public String getPost() { return post;}

    public void setPost(String post) { this.post = post;}
    @Basic
    @Column(name = "дата_рождения")
    @Temporal(TemporalType.DATE)
    public Date getBirthday() { return birthday;}

    public void setBirthday(Date birthday) { this.birthday = birthday;}

    @OneToMany(mappedBy = "employee", targetEntity = Manufactures.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Manufactures> getManufactures() {
        return manufactures;
    }
    public void setManufactures(Set<Manufactures> manufactures) {
        this.manufactures = manufactures;
    }
}
