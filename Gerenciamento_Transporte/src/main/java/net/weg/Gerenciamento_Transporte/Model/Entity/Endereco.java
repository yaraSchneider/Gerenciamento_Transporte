package net.weg.Gerenciamento_Transporte.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    @Column(nullable = false)
    private String rua;
    @NonNull
    @Column(nullable = false)
    private Integer numero;
    @NonNull
    @Column(nullable = false)
    private String cidade;
    @NonNull
    @Column(nullable = false)
    private String estado;
    @NonNull
    @Column(nullable = false)
    private String bairro;
    @NonNull
    @Column(nullable = false)
    private  String cep;
}
