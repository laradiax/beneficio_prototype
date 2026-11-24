import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Funcionario funcionario = new Funcionario(
                123,
                "Funcionario Original",
                new Endereco("Rua A", 1),
                "Analista de RH"
        );

        Funcionario funcionarioClone = funcionario.clone();

        funcionarioClone.setMatricula(456);
        funcionarioClone.setNome("Funcionario Clonado");
        funcionarioClone.getEndereco().setNumero(2);
        funcionarioClone.setCargo("Gerente de RH");

        assertEquals(
                "Funcionario{matricula=123, nome='Funcionario Original', endereco=Endereco{logradouro='Rua A', numero=1}, cargo='Analista de RH'}",
                funcionario.toString()
        );

        assertEquals(
                "Funcionario{matricula=456, nome='Funcionario Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, cargo='Gerente de RH'}",
                funcionarioClone.toString()
        );
    }
}