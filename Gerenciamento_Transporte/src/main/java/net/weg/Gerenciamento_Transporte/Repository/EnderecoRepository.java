package net.weg.Gerenciamento_Transporte.Repository;
import net.weg.Gerenciamento_Transporte.Model.Entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

    boolean existsbyNumero(Integer numero);
}
