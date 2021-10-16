
package ciclo3_reto3.ciclo3_reto3.sevicios;

import ciclo3_reto3.ciclo3_reto3.modelo.Category;
import ciclo3_reto3.ciclo3_reto3.repositorios.RepositorioCategory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mrcro
 */

@Service
public class ServiciosCategory {
    @Autowired
    private RepositorioCategory metodosCrud;
    
    
    public List<Category> getAll(){
        return metodosCrud.getAll();
    }
    public Optional<Category> getCategory(int idCategory){
        return metodosCrud.getCategory(idCategory);
    }
    public Category save(Category category){
        if(category.getId()==null){
            return metodosCrud.save(category);
        }
        else{
            Optional<Category> evt=metodosCrud.getCategory(category.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(category);
            }
            else{
                return category;
            }
        }
    }
}
