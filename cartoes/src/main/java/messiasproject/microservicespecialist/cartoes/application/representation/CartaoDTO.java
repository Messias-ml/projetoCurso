package messiasproject.microservicespecialist.cartoes.application.representation;

import lombok.Data;
import messiasproject.microservicespecialist.cartoes.domain.BandeiraCartao;
import messiasproject.microservicespecialist.cartoes.domain.CartaoEntity;

@Data
public class CartaoDTO {
    private String nome;

    private BandeiraCartao bandeiraCartao;

    private Double renda;
    private Double limite;

    public CartaoEntity toModel(){
        return new CartaoEntity(nome, bandeiraCartao, renda, limite);
    }
}
