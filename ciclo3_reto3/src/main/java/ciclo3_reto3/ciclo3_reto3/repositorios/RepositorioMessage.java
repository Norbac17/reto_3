
package ciclo3_reto3.ciclo3_reto3.repositorios;

import ciclo3_reto3.ciclo3_reto3.interfaces.InterfaceMessage;
import ciclo3_reto3.ciclo3_reto3.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mrcro
 */
@Repository
public class RepositorioMessage {
    @Autowired
    private InterfaceMessage crud;
    
    public List<Message> getAll(){
        return (List<Message>) crud.findAll();
    }
    public Optional<Message> getMessage(int id){
        return crud.findById(id);
    }
    public Message save(Message message){
        return crud.save(message);
    }
}
