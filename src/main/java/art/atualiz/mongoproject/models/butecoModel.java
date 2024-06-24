package art.atualiz.mongoproject.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Data
@Document("buteco")
public class butecoModel {

    @Id
    private String id;

    private String nome;
    private String endereço;
    private String nota;




 
}
