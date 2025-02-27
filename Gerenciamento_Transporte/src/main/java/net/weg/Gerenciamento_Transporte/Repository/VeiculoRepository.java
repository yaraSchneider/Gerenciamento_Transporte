package net.weg.Gerenciamento_Transporte.Repository;

import net.weg.Gerenciamento_Transporte.Model.Entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    boolean existsByVeiculoPlaca(String placa);
}
