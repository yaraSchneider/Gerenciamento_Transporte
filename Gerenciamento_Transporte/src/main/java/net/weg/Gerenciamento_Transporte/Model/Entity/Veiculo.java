package net.weg.Gerenciamento_Transporte.Model.Entity;

import jakarta.persistence.*;
import lombok.*;
import net.weg.Gerenciamento_Transporte.Model.Entity.Motorista;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tb_veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private String placa;

    @ManyToOne
    private Motorista motorista;
}
