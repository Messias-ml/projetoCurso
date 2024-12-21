package messiasproject.microservicespecialist.avaliadorCredito.infra.client;

import messiasproject.microservicespecialist.avaliadorCredito.domain.model.DadosCliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cliente", path = "/clientes")
public interface ClienteResourceFeign {
    @GetMapping("/{cpf}")
    DadosCliente findByCPF(@PathVariable String cpf);
}
