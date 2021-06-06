package simplon.com.ponionz.services;

import org.springframework.stereotype.Service;

import simplon.com.ponionz.domaine.dto.DemandeCreate;
import simplon.com.ponionz.repositories.DemandRepository;

@Service
public class DemandeServiceImpl implements DemandeService {


    private final DemandRepository demandRepository;

    DemandeServiceImpl(DemandRepository demandRepository) {
        this.demandRepository = demandRepository;
    }
    @Override
    public void create(DemandeCreate demande) {
	
        System.out.println("La periode pour laquelle demande a été faite est " + demande.getPeriod() + " années");
	System.out.println(demande.toString());
    }

}
