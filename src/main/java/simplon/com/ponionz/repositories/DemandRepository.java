package simplon.com.ponionz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simplon.com.ponionz.domaine.entities.Demande;

public interface DemandeRepository extends JpaRepository<Demande, Long> {
}
