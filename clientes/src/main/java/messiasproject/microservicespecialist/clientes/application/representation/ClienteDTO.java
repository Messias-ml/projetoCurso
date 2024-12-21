package messiasproject.microservicespecialist.clientes.application.representation;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long id;
    private String cpf;

    private String nome;

    private Integer idade;
}
