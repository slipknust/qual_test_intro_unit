package processadorBoletos;

import java.util.List;


public class ProcessadorBoletos {
    public boolean pgFatura(Fatura fat, List<Boleto> boletos) {

        double valorTotalBoletos = 0;

        for(Boleto bol : boletos){

            valorTotalBoletos += bol.getValor();

        }

        if (valorTotalBoletos >= fat.getValorTotal()){
            return true;
        }
        else{
            return false;
        }


    }
}
