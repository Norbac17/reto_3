/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ciclo3_reto3.ciclo3_reto3.interfaces;

import ciclo3_reto3.ciclo3_reto3.modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mrcro
 */
public interface InterfaceMessage extends CrudRepository<Message, Integer>{
    
}
