package net.weg.Gerenciamento_Transporte.Service;

import lombok.AllArgsConstructor;
import net.weg.Gerenciamento_Transporte.Model.DTO.VeiculoPostRequestDTO;
import net.weg.Gerenciamento_Transporte.Model.Entity.Veiculo;
import net.weg.Gerenciamento_Transporte.Repository.VeiculoRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VeiculoService {

    private VeiculoRepository veiculoRepository;

    public Veiculo addVeiculo(VeiculoPostRequestDTO veiculoPostRequestDTO){
        if (veiculoRepository.existsByVeiculoPlaca(veiculoPostRequestDTO.placa())){
            
        }
    }

}
