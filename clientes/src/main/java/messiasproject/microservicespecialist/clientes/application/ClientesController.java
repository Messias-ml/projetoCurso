package messiasproject.microservicespecialist.clientes.application;

import lombok.RequiredArgsConstructor;
import messiasproject.microservicespecialist.clientes.application.representation.ClienteDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClientesController {

    private final ClientesService service;
    @GetMapping
    public String status(){
        return "OK";
    }

    @GetMapping("/{cpf}")
    public ClienteDTO findByCPF(@PathVariable String cpf){
        return service.findByCPF(cpf);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCliente(@RequestBody ClienteDTO clienteDTO){
        service.createCliente(clienteDTO);
    }

}
