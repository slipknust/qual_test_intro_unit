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


    @Test
    public void pgFaturaPagaTest() {

        Fatura fat = new Fatura(1, 1500.0, "Joaozinho");
        boolean statusFatExpected = true;

        Boleto bol1 = new Boleto(1, 300.0);
        Boleto bol2 = new Boleto(2, 200.0);
        Boleto bol3 = new Boleto(3, 500.0);

        List<Boleto> boletos = new ArrayList<Boleto>();

        boletos.add(bol1);
        boletos.add(bol2);
        boletos.add(bol3);

        ProcessadorBoletos procBol = new ProcessadorBoletos();

        Assert.assertEquals(statusFatExpected, procBol.pgFatura(fat, boletos));

    }

}
