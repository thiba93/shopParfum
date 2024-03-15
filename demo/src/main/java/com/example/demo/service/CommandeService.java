import com.votreentreprise.applicationparfum.model.Commande;
import com.votreentreprise.applicationparfum.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    // Méthode pour ajouter une commande
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    // Ajoutez d'autres méthodes selon les besoins
}
