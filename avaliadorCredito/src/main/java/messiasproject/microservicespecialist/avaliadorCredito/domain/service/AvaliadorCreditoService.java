package messiasproject.microservicespecialist.avaliadorCredito.domain.service;

import lombok.RequiredArgsConstructor;
import messiasproject.microservicespecialist.avaliadorCredito.domain.model.SituacaoCliente;
import messiasproject.microservicespecialist.avaliadorCredito.infra.client.ClienteResourceFeign;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceFeign clienteResourceFeign;

    public SituacaoCliente consultaCadastral(String cpf) {
        clienteResourceFeign.findByCPF(cpf);
    }
}
