package art.atualiz.mongoproject.services;

import java.util.List;

import art.atualiz.mongoproject.models.butecoModel;

public interface IButecoService {

    public List<butecoModel> listarTodos();

    public butecoModel buscarPorId(String id);

    public butecoModel cadastrar(butecoModel buteco);

    public butecoModel atualizar(butecoModel buteco);

    public boolean excluir(String id);



}
