package org.side.HotelReservationApplication.web;

import org.side.HotelReservationApplication.Repository.ChambreRepository;
import org.side.HotelReservationApplication.entities.Chambre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ChambreGraphqlController {

    @Autowired
    private ChambreRepository chambreRepository;

    // Consulter toutes les chambres
    @QueryMapping
    public List<Chambre> allChambres() {
        return chambreRepository.findAll();
    }

    // Trouver une chambre par ID
    @QueryMapping
    public Chambre getChambreById(@Argument Long id) {
        // Rechercher la chambre dans la base de données par son ID
        return chambreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chambre avec ID " + id + " non trouvée"));
    }

    // Ajouter une nouvelle chambre
    @MutationMapping
    public Chambre addChambre(
            @Argument String type,
            @Argument double prix,
            @Argument boolean disponible
    ) {
        Chambre chambre = new Chambre();
        chambre.setType(type);
        chambre.setPrix(prix);
        chambre.setDisponible(disponible);
        return chambreRepository.save(chambre);
    }

    // Vérifier la disponibilité des chambres
    @QueryMapping
    public List<Chambre> availableChambres() {
        return chambreRepository.findByDisponible(true);
    }
}
