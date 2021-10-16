/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3_reto3.ciclo3_reto3.sevicios;

import ciclo3_reto3.ciclo3_reto3.modelo.Reservation;
import ciclo3_reto3.ciclo3_reto3.repositorios.RepositorioReservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mrcro
 */
@Service
public class ServiciosReservation {
    @Autowired
    private RepositorioReservation metodosCrud;
    
    
    public List<Reservation> getAll(){
        return metodosCrud.getAll();
    }
    public Optional<Reservation> getReservation(int idReservation){
        return metodosCrud.getReservation(idReservation);
    }
    public Reservation save(Reservation reservation){
        if(reservation.getIdReservation()==null){
            return metodosCrud.save(reservation);
        }
        else{
            Optional<Reservation> evt=metodosCrud.getReservation(reservation.getIdReservation());
            if(evt.isEmpty()){
                return metodosCrud.save(reservation);
            }
            else{
                return reservation;
            }
        }
    }
}
