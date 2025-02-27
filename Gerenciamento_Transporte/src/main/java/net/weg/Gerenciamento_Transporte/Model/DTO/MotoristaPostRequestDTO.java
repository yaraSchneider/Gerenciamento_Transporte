package net.weg.Gerenciamento_Transporte.Model.DTO;

import jakarta.validation.constraints.NotBlank;
import net.weg.Gerenciamento_Transporte.Model.Entity.Motorista;

public record MotoristaPostRequestDTO (@NotBlank String nome,
                                      @NotBlank String email,
                                       String telefone){

    public Motorista convertMotorista (){
        return Motorista.builder()
                .nome(this.nome)
                .email(this.email)
                .telefone(this.telefone)
                .build();
    }
}
