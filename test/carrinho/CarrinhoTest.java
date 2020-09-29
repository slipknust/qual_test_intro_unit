package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import produto.Produto;

public class CarrinhoTest {

    private Carrinho cart;

    @BeforeEach
    public void inicializa() {
        var prd1 = new Produto("celular", 900.0);
        var prd2 = new Produto("notebook", 2500.0);
        cart = new Carrinho();
        cart.addItem(prd1);
        cart.addItem(prd2);
    }

    @Test
    public void testValorTotal() {
        double valTotal = 3400.0;
        Assertions.assertEquals(valTotal, cart.getValorTotal());
    }

    @Test
    public void testQtdItems() {
        int qtdTotal = 2;
        Assertions.assertEquals(qtdTotal, cart.getQtdeItems());
    }

    @Test
    public void testEsvazia() {
        cart.esvazia();
        Assertions.assertEquals(cart.getQtdeItems(), 0.0);
    }

}
