package simplon.com.ponionz.services;

import org.springframework.stereotype.Service;

import simplon.com.ponionz.domaine.dto.DemandeCreate;
import simplon.com.ponionz.domaine.entities.Demande;
import simplon.com.ponionz.repositories.DemandeRepository;
import simplon.com.ponionz.repositories.DemandeRepository;

import java.time.LocalDate;

@Service
public class DemandeServiceImpl implements DemandeService {


    private final DemandeRepository demandes;

    DemandeServiceImpl(DemandeRepository demandes) {
        this.demandes = demandes;
    }
    @Override
    public void create(DemandeCreate dto) {

        Demande demande = new Demande();
        demande.setAmount(dto.getAmount());
        demande.setApport(dto.getApport());
        demande.setInsuranceRate(dto.getInsuranceRate());
        demande.setDate(dto.getDate());
        demande.setInterestRate(dto.getInterestRate());
        demande.setJobLossInsuranceTaken(dto.isJobLossInsuranceTaken());

        demande.setTime(LocalDate.now());

        /// etc a faire
        demandes.save(demande);

        System.out.println("La periode pour laquelle demande a été faite est " + demande.getPeriod() + " années");
	System.out.println(demande.toString());
    }

}
