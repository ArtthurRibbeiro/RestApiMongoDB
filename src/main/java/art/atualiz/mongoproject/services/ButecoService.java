package art.atualiz.mongoproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import art.atualiz.mongoproject.models.butecoModel;
import art.atualiz.mongoproject.repositories.IClienteRepository;

@Service
public class ButecoService implements IButecoService{

    @Autowired
    private IClienteRepository butecoRepositorio;

    @Override
    public List<butecoModel> listarTodos() {
        return this.butecoRepositorio.findAll();
        
    }

    @Override
    public butecoModel buscarPorId(String id) {
        Optional<butecoModel> optional = this.butecoRepositorio.findById(id);

        if (optional.isPresent()) {
            return optional.get();
            
        }else{
            
            throw new RuntimeException("Registro não encontrado");
        }


    }

    @Override
    public butecoModel cadastrar(butecoModel buteco) {
        return this.butecoRepositorio.save(buteco);
    }

    @Override
    public butecoModel atualizar(butecoModel buteco) {

        return this.butecoRepositorio.save(buteco);
    }

    @Override
    public boolean excluir(String id) {
        this.butecoRepositorio.deleteById(id);
        return true;
    }
}
