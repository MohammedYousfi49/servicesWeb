package org.side.HotelReservationApplication.Repository;

import org.side.HotelReservationApplication.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findByDisponible(boolean b);
}
