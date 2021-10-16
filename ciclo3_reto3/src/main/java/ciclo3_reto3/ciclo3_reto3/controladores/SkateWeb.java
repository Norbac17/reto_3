
package ciclo3_reto3.ciclo3_reto3.controladores;

import java.util.List;
import java.util.Optional;
import ciclo3_reto3.ciclo3_reto3.modelo.Skate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ciclo3_reto3.ciclo3_reto3.sevicios.ServiciosSkate;


/**
 *
 * @author Mrcro
 */
@RestController
@RequestMapping("/api/Skate")
public class SkateWeb {
    @GetMapping("/saludar")
    public String saludar(){
        return "hola mundo";
    }
    @Autowired
    private ServiciosSkate servicios;
    @GetMapping("/all")
    public List<Skate> getSkate(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Skate> getSkate(@PathVariable("id") int idSkate){
        return servicios.getSkate(idSkate);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Skate save(@RequestBody Skate skate){
        return servicios.save(skate);
    }
}
