package messiasproject.microservicespecialist.cartoes.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CartaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartao")
    private Long id;
    @Column
    private String nome;

    @Enumerated(EnumType.STRING)
    private BandeiraCartao bandeiraCartao;

    @Column
    private Double renda;
    @Column
    private Double limiteBasico;

    public CartaoEntity(String nome, BandeiraCartao bandeiraCartao, Double renda, Double limiteBasico) {
        this.nome = nome;
        this.bandeiraCartao = bandeiraCartao;
        this.renda = renda;
        this.limiteBasico = limiteBasico;
    }
}
