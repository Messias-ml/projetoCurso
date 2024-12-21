package messiasproject.microservicespecialist.cartoes.application;

import lombok.RequiredArgsConstructor;
import messiasproject.microservicespecialist.cartoes.application.representation.ClienteCartaoDTO;
import messiasproject.microservicespecialist.cartoes.domain.service.ClienteCartãoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cartoes/clientes")
@RequiredArgsConstructor
public class ClienteCartaoController {

    private final ClienteCartãoService service;

    @GetMapping("/{cpf}")
    private List<ClienteCartaoDTO> findByCpf(@PathVariable("cpf") String cpf){
        return service.findByCpf(cpf);
    }
}
