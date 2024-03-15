import com.votreentreprise.applicationparfum.model.Parfum;
import com.votreentreprise.applicationparfum.repository.ParfumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParfumService {
    @Autowired
    private ParfumRepository parfumRepository;

    public List<Parfum> getAllParfums() {
        return parfumRepository.findAll();
    }

    // Ajoutez d'autres méthodes pour gérer les parfums
}
