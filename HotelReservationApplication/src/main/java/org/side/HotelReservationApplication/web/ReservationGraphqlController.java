package org.side.HotelReservationApplication.web;

import org.side.HotelReservationApplication.Repository.ChambreRepository;
import org.side.HotelReservationApplication.Repository.ClientRepository;
import org.side.HotelReservationApplication.Repository.ReservationRepository;
import org.side.HotelReservationApplication.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ReservationGraphqlController {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ChambreRepository chambreRepository;

    // Ajouter une nouvelle réservation
    @MutationMapping
    public Reservation addReservation(
            @Argument Long clientId,
            @Argument Long chambreId,
            @Argument String dateDebut,
            @Argument String dateFin,
            @Argument String preferences
    ) {
        var client = clientRepository.findById(clientId).orElseThrow(() -> new RuntimeException("Client non trouvé"));
        var chambre = chambreRepository.findById(chambreId).orElseThrow(() -> new RuntimeException("Chambre non trouvée"));

        Reservation reservation = new Reservation();
        reservation.setClient(client);
        reservation.setChambre(chambre);
        reservation.setDateDebut(LocalDate.parse(dateDebut));
        reservation.setDateFin(LocalDate.parse(dateFin));
        reservation.setPreferences(preferences);

        return reservationRepository.save(reservation);
    }

    // Consulter une réservation par ID
    @QueryMapping
    public Reservation getReservationById(@Argument Long id) {
        return reservationRepository.findById(id).orElseThrow(() -> new RuntimeException("Réservation non trouvée"));
    }

    // Mettre à jour une réservation existante
    @MutationMapping
    public Reservation updateReservation(
            @Argument Long id,
            @Argument Long clientId,
            @Argument Long chambreId,
            @Argument String dateDebut,
            @Argument String dateFin,
            @Argument String preferences
    ) {
        Reservation reservation = reservationRepository.findById(id).orElseThrow(() -> new RuntimeException("Réservation non trouvée"));

        if (clientId != null) {
            var client = clientRepository.findById(clientId).orElseThrow(() -> new RuntimeException("Client non trouvé"));
            reservation.setClient(client);
        }

        if (chambreId != null) {
            var chambre = chambreRepository.findById(chambreId).orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
            reservation.setChambre(chambre);
        }

        if (dateDebut != null) {
            reservation.setDateDebut(LocalDate.parse(dateDebut));
        }

        if (dateFin != null) {
            reservation.setDateFin(LocalDate.parse(dateFin));
        }

        if (preferences != null) {
            reservation.setPreferences(preferences);
        }

        return reservationRepository.save(reservation);
    }

    // Supprimer une réservation
    @MutationMapping
    public String deleteReservation(@Argument Long id) {
        Reservation reservation = reservationRepository.findById(id).orElseThrow(() -> new RuntimeException("Réservation non trouvée"));
        reservationRepository.delete(reservation);
        return "Réservation supprimée avec succès";
    }
}
