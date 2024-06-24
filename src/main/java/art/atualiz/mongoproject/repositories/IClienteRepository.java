package art.atualiz.mongoproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import art.atualiz.mongoproject.models.butecoModel;

public interface IClienteRepository extends MongoRepository<butecoModel, String>{


}
