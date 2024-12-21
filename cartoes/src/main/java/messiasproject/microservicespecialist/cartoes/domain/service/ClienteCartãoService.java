package messiasproject.microservicespecialist.cartoes.domain.service;

import lombok.RequiredArgsConstructor;
import messiasproject.microservicespecialist.cartoes.application.representation.ClienteCartaoDTO;
import messiasproject.microservicespecialist.cartoes.domain.ClienteCartaoEntity;
import messiasproject.microservicespecialist.cartoes.infra.repository.ClienteCartaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClienteCartãoService {

    private final ClienteCartaoRepository repository;

    public List<ClienteCartaoDTO> findByCpf(String cpf) {
        List<ClienteCartaoEntity> listCartaoCliente = repository.findByCpf(cpf);
        return listCartaoCliente.stream().map(ClienteCartaoDTO::fromModel).collect(Collectors.toList());
    }
}
