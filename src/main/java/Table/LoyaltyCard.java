package Table;

import jakarta.persistence.*;

@Entity
@Table(name = "карта_лояльности")
public class LoyaltyCard {
    private int id;
    private int points;
    private String contactDetails;
    private String ownerStatus;

    private Client client;

    public LoyaltyCard(int points, String contactDetails, String ownerStatus){
        setPoints(points);
        setContactDetails(contactDetails);
        setOwnerStatus(ownerStatus);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_карты_лояльности")
    public int getId() { return id;}
    public void setId(int id) { this.id = id;}

    @Basic
    @Column(name = "кол_во_баллов")
    public int getPoints() { return points;}
    public void setPoints(int points) { this.points = points;}

    @Basic
    @Column(name = "контактные_данные_владельца")
    public String getContactDetails() { return contactDetails;}
    public void setContactDetails(String contactDetails) { this.contactDetails = contactDetails;}

    @Basic
    @Column(name = "статус_владельца")
    public String getOwnerStatus() { return ownerStatus;}
    public void setOwnerStatus(String ownerStatus) { this.ownerStatus = ownerStatus;}

    @OneToOne(mappedBy = "loyaltyCard", cascade = CascadeType.ALL)
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
}
