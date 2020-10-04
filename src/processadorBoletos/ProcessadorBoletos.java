package processadorBoletos;

import java.util.List;


public class ProcessadorBoletos {



    public void criaPg(Boleto bol){
        int id = bol.getId();
        double valorPago = bol.getValor();
        String tipoPg = "BOLETO";
        Pagamento pg = new Pagamento(id, valorPago, tipoPg);

    }



    public void pgFatura(Fatura fat, List<Boleto> boletos) {

        double valorTotalBoletos = 0;

        for(Boleto bol : boletos){

            criaPg(bol);

            valorTotalBoletos += bol.getValor();

        }

        if (valorTotalBoletos >= fat.getValorTotal()){
            fat.setStatus("PAGA");
        }
        else{
            fat.setStatus("NAO PAGA");
        }


    }
}
