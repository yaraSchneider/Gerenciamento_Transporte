package net.weg.Gerenciamento_Transporte.Model.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import net.weg.Gerenciamento_Transporte.Model.Entity.Endereco;

public record EnderecoPostRequestDTO(@NotBlank String rua,
                                     @NotBlank @Positive String numero,
                                     @NotBlank String cidade,
                                     @NotBlank String bairro,
                                     @NotBlank String cep) {


    public Endereco convertEndereco(){
        return Endereco.builder()
                .rua(this.rua)
                .cidade(this.cidade)
                .numero(Integer.valueOf(numero))
                .bairro(this.bairro)
                .cep(this.cep)
                .build();
    }
}
