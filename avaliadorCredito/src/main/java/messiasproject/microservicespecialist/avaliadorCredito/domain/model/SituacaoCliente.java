package messiasproject.microservicespecialist.avaliadorCredito.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SituacaoCliente {
    private DadosCliente cliente;
    private List<CartaoCliente> cartoes;

}
