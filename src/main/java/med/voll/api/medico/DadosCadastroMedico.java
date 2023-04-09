package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank // Verifica se está null or empty
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") // de 4 a 6 dígitos
        String crm,
        @NotNull // Not blank é só para campos String
        Especialidade especialidade,
        @NotNull
        @Valid // Validar outro objeto que tbm terá anotações de validações
        DadosEndereco endereco) {
}
