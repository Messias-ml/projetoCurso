package messiasproject.microservicespecialist.cartoes.infra.repository;

import messiasproject.microservicespecialist.cartoes.domain.ClienteCartaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteCartaoRepository extends JpaRepository<ClienteCartaoEntity, Long> {
    List<ClienteCartaoEntity> findByCpf(String cpf);
}
