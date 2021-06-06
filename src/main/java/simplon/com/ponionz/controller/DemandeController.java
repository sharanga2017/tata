package simplon.com.ponionz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import simplon.com.ponionz.domaine.dto.DemandeCreate;
import simplon.com.ponionz.services.DemandeService;

@RestController
public class DemandeController {
    private final DemandeService service;

    public DemandeController(DemandeService service) {
	this.service = service;
    }

    @PostMapping("/demandes/test")
    public void create(@RequestBody DemandeCreate demande)
    {
	service.create(demande);
    }

    @GetMapping("/test")
    public String testConnexion() {
	return "Connexion est réussi";
    }

}
