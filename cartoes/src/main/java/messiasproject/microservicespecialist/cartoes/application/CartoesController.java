package messiasproject.microservicespecialist.cartoes.application;

import lombok.RequiredArgsConstructor;
import messiasproject.microservicespecialist.cartoes.application.representation.CartaoDTO;
import messiasproject.microservicespecialist.cartoes.domain.CartaoEntity;
import messiasproject.microservicespecialist.cartoes.domain.service.CartaoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
@RequiredArgsConstructor
public class CartoesController {

    private final CartaoService service;

    @GetMapping("/status")
    public String status(){
        return "OK";
    }

    @GetMapping
    public List<CartaoEntity> buscarCartoes(){
        return service.buscarCartoes();
    }

    @GetMapping("/{rendaCliente}")
    public List<CartaoEntity> buscarCartoesMenorOuIgualARendaDoCliente(@PathVariable Long rendaCliente){
        return service.buscarCartoesMenorOuIgualARendaDoCliente(rendaCliente);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrar(@RequestBody CartaoDTO cartaoDTO){
        service.save(cartaoDTO);
    }
}
