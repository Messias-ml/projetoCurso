package messiasproject.microservicespecialist.cartoes.application.representation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import messiasproject.microservicespecialist.cartoes.domain.CartaoEntity;
import messiasproject.microservicespecialist.cartoes.domain.ClienteCartaoEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteCartaoDTO {

    private String nome;
    private String Bandeira;
    private Double limiteLiberado;

    public static ClienteCartaoDTO fromModel(ClienteCartaoEntity clienteCartaoEntity){
        CartaoEntity cartao = clienteCartaoEntity.getCartaoEntity();
        return new ClienteCartaoDTO(cartao.getNome(), cartao.getBandeiraCartao().toString(), cartao.getLimiteBasico());
    }


}
