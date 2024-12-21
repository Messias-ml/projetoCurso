package messiasproject.microservicespecialist.avaliadorCredito.infra.client;


import messiasproject.microservicespecialist.avaliadorCredito.domain.model.CartaoCliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "cartoes", path = "/cartoes")
public interface CartoesResourceFeign {


    @GetMapping("/{cpf}")
    List<CartaoCliente> findByCpf(@PathVariable("cpf") String cpf);
}
