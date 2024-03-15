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
    @PostMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public Parfum createParfum(@RequestBody Parfum parfum) {
        return parfumService.createParfum(parfum);
    }

    @PutMapping("/admin/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Parfum updateParfum(@PathVariable Long id, @RequestBody Parfum parfumDetails) {
        return parfumService.updateParfum(id, parfumDetails);
    }

    @DeleteMapping("/admin/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> deleteParfum(@PathVariable Long id) {
        parfumService.deleteParfum(id);
        return ResponseEntity.ok().build();
    }

    // Ajoutez d'autres endpoints pour gérer les parfums
}
