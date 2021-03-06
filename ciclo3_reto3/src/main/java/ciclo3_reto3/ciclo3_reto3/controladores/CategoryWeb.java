
package ciclo3_reto3.ciclo3_reto3.controladores;

import ciclo3_reto3.ciclo3_reto3.modelo.Category;
import ciclo3_reto3.ciclo3_reto3.sevicios.ServiciosCategory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mrcro
 */
@RestController
@RequestMapping("/api/Category")

public class CategoryWeb {
    @Autowired
    private ServiciosCategory servicios;
    @GetMapping("/all")
    public List<Category> getCategory(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int idCategory){
        return servicios.getCategory(idCategory);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return servicios.save(category);
    }
}
