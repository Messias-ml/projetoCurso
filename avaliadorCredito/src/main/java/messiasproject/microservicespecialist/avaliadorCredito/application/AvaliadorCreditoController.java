package messiasproject.microservicespecialist.avaliadorCredito.application;

import lombok.RequiredArgsConstructor;
import messiasproject.microservicespecialist.avaliadorCredito.domain.model.DadosCliente;
import messiasproject.microservicespecialist.avaliadorCredito.domain.model.SituacaoCliente;
import messiasproject.microservicespecialist.avaliadorCredito.domain.service.AvaliadorCreditoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("avaliacoes-credito")
@RequiredArgsConstructor
public class AvaliadorCreditoController {

    private final AvaliadorCreditoService service;
    @GetMapping
    public String status(){
        return "ok";
    }
    @GetMapping("/situacao-cliente/{cpf}")
    public SituacaoCliente consultaCadastral(@PathVariable String cpf){
        return service.consultaCadastral(cpf);
    }
}
