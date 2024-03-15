import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parfums")
public class Parfum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false)
    private String miniDescription;

    @Column(length = 5000)
    private String description;

    @Column(nullable = false)
    private Double prix;

    @ElementCollection
    private List<String> photos; // URLs des photos

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getMiniDescription() {
        return miniDescription;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrix() {
        return prix;
    }

    public List<String> getPhotos() {
        return photos;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setMiniDescription(String miniDescription) {
        this.miniDescription = miniDescription;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}
