import com.votreentreprise.applicationparfum.model.Commande;
import com.votreentreprise.applicationparfum.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commandes")
public class CommandeController {
    @Autowired
    private CommandeService commandeService;

    @GetMapping
    public List<Commande> getAllCommandes() {
        return commandeService.getAllCommandes();
    }

    @PostMapping
    public Commande createCommande(@RequestBody Commande commande) {
        return commandeService.saveCommande(commande);
    }

    // Ajoutez d'autres endpoints selon les besoins
}
