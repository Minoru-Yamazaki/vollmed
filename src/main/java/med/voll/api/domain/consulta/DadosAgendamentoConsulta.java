package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,
        @NotNull
        Long idPaciente,
        @NotNull
        @Future // Obriga a ser uma data futura
                //@JsonFormat(pattern = "dd/MM/yyyy HH:mm") -> para informar ao spring o formato padrão de entrada da data
                // para mais informações https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        LocalDateTime data,
        Especialidade especialidade) {
}
