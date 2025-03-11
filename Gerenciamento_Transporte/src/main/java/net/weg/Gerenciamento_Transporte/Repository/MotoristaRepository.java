package net.weg.Gerenciamento_Transporte.Repository;
import net.weg.Gerenciamento_Transporte.Model.Entity.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoristaRepository extends JpaRepository<Motorista, Integer> {

    boolean existsByNome(String nome);
}
