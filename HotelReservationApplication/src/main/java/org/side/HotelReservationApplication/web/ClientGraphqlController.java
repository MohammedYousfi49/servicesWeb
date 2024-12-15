package org.side.HotelReservationApplication.web;

import org.side.HotelReservationApplication.Repository.ClientRepository;
import org.side.HotelReservationApplication.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class ClientGraphqlController {

    @Autowired
    private ClientRepository clientRepository;

    // Consulter tous les clients
    @QueryMapping
    public List<Client> allClients() {
        return clientRepository.findAll();
    }

    // Trouver un client par ID
    @QueryMapping
    public Client getClientById(@Argument Long id) {
        return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client non trouvé"));
    }

    // Ajouter un nouveau client
    @MutationMapping
    public Client addClient(
            @Argument String nom,
            @Argument String prenom,
            @Argument String email,
            @Argument String telephone
    ) {
        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setEmail(email);
        client.setTelephone(telephone);
        return clientRepository.save(client);
    }

    // Mettre à jour un client existant
    @MutationMapping
    public Client updateClient(
            @Argument Long id,
            @Argument String nom,
            @Argument String prenom,
            @Argument String email,
            @Argument String telephone
    ) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client non trouvé"));
        if (nom != null) client.setNom(nom);
        if (prenom != null) client.setPrenom(prenom);
        if (email != null) client.setEmail(email);
        if (telephone != null) client.setTelephone(telephone);
        return clientRepository.save(client);
    }
}