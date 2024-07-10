package Table;
import jakarta.persistence.*;

@Entity
@Table(name = "филиал_организации")
public class BranchOfTheOrganization {
    private int branch;
    private int mainBranch;
    private String nameBranch;
    private String phone;
    private String address;

    public BranchOfTheOrganization(int mainBranch, String nameBranch, String phone, String address){
        setMainBranch(mainBranch);
        setNameBranch(nameBranch);
        setPhone(phone);
        setAddress(address);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "филиал")
    public int getBranch() { return branch;}

    public void setBranch(int branch) { this.branch = branch;}
    @Basic
    @Column(name = "главный_филиал")
    public int getMainBranch() { return mainBranch;}

    public void setMainBranch(int mainBranch) { this.mainBranch = mainBranch;}
    @Basic
    @Column(name = "название_филиала")
    public String getNameBranch() { return nameBranch;}

    public void setNameBranch(String nameBranch) { this.nameBranch = nameBranch;}
    @Basic
    @Column(name = "телефон")
    public String getPhone() { return phone;}

    public void setPhone(String phone) { this.phone = phone;}
    @Basic
    @Column(name = "адрес")
    public String getAddress() { return address;}

    public void setAddress(String address) { this.address = address;}
}
