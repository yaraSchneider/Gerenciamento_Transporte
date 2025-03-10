package net.weg.Gerenciamento_Transporte.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tb_motorista")
public class Motorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    @NonNull
    @Column (nullable = false)
   private String nome;
    @NonNull
    @Column(nullable = false)
   private String email;
    @NonNull
    @Column(nullable = false)
   private String telefone;

   private Endereco endereco;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany
   private List<Veiculo> veiculos;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany (mappedBy = "motorista")
   private List<Rota> rotas;
}
