package messiasproject.microservicespecialist.cartoes.domain.service;

import lombok.RequiredArgsConstructor;
import messiasproject.microservicespecialist.cartoes.application.representation.CartaoDTO;
import messiasproject.microservicespecialist.cartoes.domain.CartaoEntity;
import messiasproject.microservicespecialist.cartoes.infra.repository.CartaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartaoService {

    private final CartaoRepository repository;


    public void save(CartaoDTO cartaoDTO) {
        CartaoEntity cartaoEntity = cartaoDTO.toModel();
        repository.save(cartaoEntity);
    }

    public List<CartaoEntity> buscarCartoes() {
        List<CartaoEntity> all = repository.findAll();
        return all;
    }

    public List<CartaoEntity> buscarCartoesMenorOuIgualARendaDoCliente(Long rendaCliente) {
        Double rendaClienteDouble = Double.valueOf(rendaCliente);
        return repository.findByRendaLessThanEqual(rendaClienteDouble);
    }
}
