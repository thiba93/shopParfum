import com.votreentreprise.applicationparfum.model.Parfum;
import com.votreentreprise.applicationparfum.service.ParfumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/parfums")
public class ParfumController {
    @Autowired
    private ParfumService parfumService;

    @GetMapping
    public List<Parfum> getAllParfums() {
        return parfumService.getAllParfums();
    }

    // Ajoutez d'autres endpoints pour gérer les parfums
}
