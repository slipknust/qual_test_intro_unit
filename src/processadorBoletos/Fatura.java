package processadorBoletos;

public class Fatura {

    private int id;
    private double valorTotal;
    private String nome;

    public Fatura(int i, double vt, String n) {
        this.id = i;
        this.valorTotal = vt;
        this. nome = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
