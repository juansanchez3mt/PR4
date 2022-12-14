package com.example.reto3.repository;

import com.example.reto3.entities.Message;
import com.example.reto3.entities.Reservation;
import com.example.reto3.repository.crudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    public Reservation save(Reservation r){
        return reservationCrudRepository.save(r);
    }
    public Optional<Reservation> getById(int idReservation){
        return reservationCrudRepository.findById(idReservation);
    }
    public void delete(Reservation r){
        reservationCrudRepository.delete(r);
    }
}
