package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.ParkingSpot;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Long> {

}
