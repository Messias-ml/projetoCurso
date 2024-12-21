package messiasproject.microservicespecialist.avaliadorCredito.domain.model;

import lombok.Data;

@Data
public class CartaoCliente {
    private String nome;
    private String Bandeira;
    private Double limiteLiberado;

}
