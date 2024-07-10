package Table;
import jakarta.persistence.*;

@Entity
@Table(name = "клиент")
public class Client {
    private int id;
    private int idHuman;
    private int idLoyaltyCard;

    public Client(int idHuman, int idLoyaltyCard){
        setIdHuman(idHuman);
        setIdLoyaltyCard(idLoyaltyCard);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_клиента")
    public int getId() { return id;}

    public void setId(int id) { this.id = id;}
    @Basic
    @Column(name = "id_человека")
    public int getIdHuman() { return idHuman;}

    public void setIdHuman(int idHuman) { this.idHuman = idHuman;}
    @Basic
    @Column(name = "id_карты_лояльности")
    public int getIdLoyaltyCard() { return idLoyaltyCard;}

    public void setIdLoyaltyCard(int idLoyaltyCard) { this.idLoyaltyCard = idLoyaltyCard;}
}
