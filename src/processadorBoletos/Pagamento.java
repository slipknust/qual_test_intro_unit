package processadorBoletos;

public class Pagamento {

    private int id;
    private double valorPago;
    private String tipoPg;

    public Pagamento(int i, double vp, String tpg) {

        this.id = i;
        this.valorPago = vp;
        this.tipoPg = tpg;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getTipoPg() {
        return tipoPg;
    }

    public void setTipoPg(String tipoPg) {
        this.tipoPg = tipoPg;
    }
}
