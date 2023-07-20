package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.exception.ValidacaoException;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public void validar(DadosAgendamentoConsulta dados){
        if (dados.idMedico() == null) {
            return;
        }

        //var medicoEstaAtivo = medicoRepository.findAtivoById(dados.idMedico());
        if (false) { //!medicoEstaAtivo
            throw new ValidacaoException("Consulta não pode ser agendada com médico excluído.");
        }
    }
}
