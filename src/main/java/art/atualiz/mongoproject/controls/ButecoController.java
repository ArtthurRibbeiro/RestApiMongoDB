package art.atualiz.mongoproject.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import art.atualiz.mongoproject.models.butecoModel;
import art.atualiz.mongoproject.services.IButecoService;

@RestController
@RequestMapping("/buteco")
public class ButecoController {

    @Autowired
    IButecoService service;

    
 @GetMapping("/buteco")
 public List<butecoModel> findAll() {
    return service.listarTodos();
 }

 @GetMapping("/buteco/{id}")
 public butecoModel findById(@PathVariable("id") String id) {
     return service.buscarPorId(id);
 }

 @PostMapping("/buteco")
 public butecoModel criarButeco(butecoModel buteco){
    return service.cadastrar(buteco);
 }

@PutMapping("/buteco")
public butecoModel atualizarButeco( butecoModel buteco){
    return service.atualizar(buteco);
}

}
