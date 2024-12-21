package messiasproject.microservicespecialist.clientes.application;

import lombok.AllArgsConstructor;
import messiasproject.microservicespecialist.clientes.application.representation.ClienteDTO;
import messiasproject.microservicespecialist.clientes.domain.ClienteEntity;
import messiasproject.microservicespecialist.clientes.infra.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientesService {

    private final ClientesRepository repository;

    public void createCliente(ClienteDTO cliente){
        ClienteEntity clienteEntity = new ClienteEntity(cliente.getCpf(), cliente.getNome(),cliente.getIdade());
        repository.save(clienteEntity);
    }

    public ClienteDTO findByCPF(String cpf){
        ClienteEntity clienteEntity = repository.findByCpf(cpf).get();
        ClienteDTO clienteDTO = new ClienteDTO();
        transformClienteDTO(clienteEntity, clienteDTO);
        return clienteDTO;
    }

    private void transformClienteDTO(ClienteEntity clienteEntity, ClienteDTO clienteDTO) {
        clienteDTO.setId(clienteEntity.getId());
        clienteDTO.setCpf(clienteEntity.getCpf());
        clienteDTO.setNome(clienteEntity.getNome());
        clienteDTO.setIdade(clienteEntity.getIdade());
    }

}
