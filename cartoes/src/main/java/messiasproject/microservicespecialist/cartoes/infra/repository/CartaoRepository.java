package messiasproject.microservicespecialist.cartoes.infra.repository;

import messiasproject.microservicespecialist.cartoes.domain.CartaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartaoRepository extends JpaRepository<CartaoEntity, Long> {
    List<CartaoEntity> findByRendaLessThanEqual(Double rendaClienteDouble);
}
