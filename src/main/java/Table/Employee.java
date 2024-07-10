package Table;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "сотрудник")
public class Employee {
    private int id;
    private int branch;
    private int idHuman;
    private Date dataOfHiring;
    private double wages;
    private String post;
    private Date birthday;

    public Employee(int branch, int idHuman, Date dataOfHiring, double wages, String post, Date birthday){
        setBranch(branch);
        setIdHuman(idHuman);
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
    @Basic
    @Column(name = "филиал")
    public int getBranch() { return branch;}

    public void setBranch(int branch) { this.branch = branch;}
    @Basic
    @Column(name = "id_человека")
    public int getIdHuman() { return idHuman;}

    public void setIdHuman(int idHuman) { this.idHuman = idHuman;}
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
}
