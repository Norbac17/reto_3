
package ciclo3_reto3.ciclo3_reto3.sevicios;

import java.util.List;
import java.util.Optional;
import ciclo3_reto3.ciclo3_reto3.modelo.Skate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ciclo3_reto3.ciclo3_reto3.repositorios.RepositorioSkate;


/**
 *
 * @author Jhohan
 */
@Service
public class ServiciosSkate {
    @Autowired
    private RepositorioSkate metodosCrud;
    
    
    public List<Skate> getAll(){
        return metodosCrud.getAll();
    }
    public Optional<Skate> getSkate(int idSkate){
        return metodosCrud.getSkate(idSkate);
    }
    public Skate save(Skate skate){
        if(skate.getId()==null){
            return metodosCrud.save(skate);
        }
        else{
            Optional<Skate> evt=metodosCrud.getSkate(skate.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(skate);
            }
            else{
                return skate;
            }
        }
    }
}
