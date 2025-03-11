package net.weg.Gerenciamento_Transporte.Service;
import lombok.AllArgsConstructor;
import net.weg.Gerenciamento_Transporte.Model.DTO.EnderecoPostRequestDTO;
import net.weg.Gerenciamento_Transporte.Model.Entity.Endereco;
import net.weg.Gerenciamento_Transporte.Repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    public Endereco addEndereco(EnderecoPostRequestDTO enderecoPostRequestDTO){
        if (enderecoRepository.existsByNumero(Integer.valueOf(enderecoPostRequestDTO.numero()))){
            throw new RuntimeException();
        }
        return enderecoRepository.save(enderecoPostRequestDTO.convertEndereco());
    }

    public List<Endereco> procurarEndereco(){
       return enderecoRepository.findAll();
    }

    public Endereco procurarEnderecoPorId(Integer id){
        Optional<Endereco> enderecoOptional = enderecoRepository.findById(id);
        if (enderecoOptional.isPresent()){
            return enderecoOptional.get();
        }
        throw new RuntimeException();
    }

    public Endereco atualizarEndereco(Integer id, Endereco endereco){
        endereco.setId(id);
        return enderecoRepository.save(endereco);
    }

    public void deletarEndereco(Integer id){
        enderecoRepository.deleteById(id);
    }

}
