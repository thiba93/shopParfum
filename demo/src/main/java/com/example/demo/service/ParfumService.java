@Service
public class ParfumService {
    @Autowired
    private ParfumRepository parfumRepository;

    public Parfum createParfum(Parfum parfum) {
        return parfumRepository.save(parfum);
    }

    public Parfum updateParfum(Long id, Parfum parfumDetails) {
        Parfum parfum = parfumRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Parfum not found"));
        parfum.setTitre(parfumDetails.getTitre());
        parfum.setDescription(parfumDetails.getDescription());
        parfum.setMiniDescription(parfumDetails.getMiniDescription());
        parfum.setPrix(parfumDetails.getPrix());
        parfum.setPhotos(parfumDetails.getPhotos());
        return parfumRepository.save(parfum);
    }

    public void deleteParfum(Long id) {
        Parfum parfum = parfumRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Parfum not found"));
        parfumRepository.delete(parfum);
    }
}
