import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "commandes")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Utilisateur utilisateur;

    @ManyToOne(optional = false)
    private Parfum parfum;

    @Column(nullable = false)
    private Double prix;

    @Column(nullable = false)
    private String etat;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;

    // Getters
    public Long getId() {
        return id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Parfum getParfum() {
        return parfum;
    }

    public Double getPrix() {
        return prix;
    }

    public String getEtat() {
        return etat;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setParfum(Parfum parfum) {
        this.parfum = parfum;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
}
