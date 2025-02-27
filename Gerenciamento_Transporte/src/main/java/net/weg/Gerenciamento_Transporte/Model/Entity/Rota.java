package net.weg.Gerenciamento_Transporte.Model.Entity;


import jakarta.persistence.*;
import lombok.*;
import net.weg.Gerenciamento_Transporte.Model.Entity.Endereco;
import net.weg.Gerenciamento_Transporte.Model.Entity.Motorista;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tb_rota")
public class Rota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Endereco origem;

    private Endereco destino;

    @NonNull
    @Column(nullable = false)
    private Double distancia;

    @ManyToOne
    private Motorista motorista;
}
