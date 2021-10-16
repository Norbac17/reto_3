
package ciclo3_reto3.ciclo3_reto3.repositorios;

import ciclo3_reto3.ciclo3_reto3.interfaces.InterfaceClient;
import ciclo3_reto3.ciclo3_reto3.modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mrcro
 */
@Repository
public class RepositorioClient {
    @Autowired
    private InterfaceClient crud;
    
    public List<Client> getAll(){
        return (List<Client>) crud.findAll();
    }
    public Optional<Client> getClient(int id){
        return crud.findById(id);
    }
    public Client save(Client client){
        return crud.save(client);
    }
}
