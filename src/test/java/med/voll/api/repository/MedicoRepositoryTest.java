package med.voll.api.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // para testes de interface repository
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // Configurar banco de dados desse teste e não subtitua as configurações do banco de dados. Se não tiver essa annotation por default o spring tenta usar um banco em memória como o H2
@ActiveProfiles("test") // para ler as configurações do arquivo application-test.properties
class MedicoRepositoryTest {

    @Test
    void findRandomMedicoForConsulta() {
    }
}