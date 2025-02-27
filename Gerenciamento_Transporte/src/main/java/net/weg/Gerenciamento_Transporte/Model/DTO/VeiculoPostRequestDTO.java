package net.weg.Gerenciamento_Transporte.Model.DTO;

import jakarta.validation.constraints.NotBlank;
import net.weg.Gerenciamento_Transporte.Model.Entity.Veiculo;

public record VeiculoPostRequestDTO(@NotBlank String marca,
                                    @NotBlank String modelo,
                                    @NotBlank String placa) {

    public Veiculo converVeiculo(){
        return Veiculo.builder()
                .marca(this.marca)
                .modelo(this.modelo)
                .placa(this.placa)
                .build();
    }

}
