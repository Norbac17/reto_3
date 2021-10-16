/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo3_reto3.ciclo3_reto3.repositorios;

import ciclo3_reto3.ciclo3_reto3.interfaces.InterfaceScore;
import ciclo3_reto3.ciclo3_reto3.modelo.Reservation;
import ciclo3_reto3.ciclo3_reto3.modelo.Score;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mrcro
 */
@Repository
public class RepositorioScore {
    @Autowired
    private InterfaceScore crud;
    
    public List<Score> getAll(){
        return (List<Score>) crud.findAll();
    }
    public Optional<Score> getScore(int id){
        return crud.findById(id);
    }
    public Score save(Score score){
        return crud.save(score);
    }
}
