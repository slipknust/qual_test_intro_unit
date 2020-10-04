package processadorBoletos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ProcessadorBoletosTest {

    private Fatura fat;
    private Boleto bol1;
    private Boleto bol2;
    private Boleto bol3;
    private ProcessadorBoletos procBol;
    private List<Boleto> boletos;

    @BeforeEach
    public void inicializa(){

        fat = new Fatura(1, 1500.0, "Joaozinho");

        bol1 = new Boleto(1, 300.0);
        bol2 = new Boleto(2, 200.0);
        bol3 = new Boleto(3, 1000.0);

        boletos = new ArrayList<Boleto>();

        boletos.add(bol1);
        boletos.add(bol2);
        boletos.add(bol3);

        procBol = new ProcessadorBoletos();

    }

    @Test
    public void pgFaturaPagaTest() {

        boolean statusFatExpected = true;
        Assert.assertEquals(statusFatExpected, procBol.pgFatura(fat, boletos));

    }

}
