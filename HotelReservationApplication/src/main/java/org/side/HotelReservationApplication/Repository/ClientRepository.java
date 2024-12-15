package org.side.HotelReservationApplication.Repository;

import org.side.HotelReservationApplication.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}