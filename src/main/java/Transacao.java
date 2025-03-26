import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private String descricao;
    private double valor;
    private tipoTransacao tipo;

    public enum tipoTransacao {
        RECEITA, DESPESA;
    }

    public double getValor() {
        return valor;
    }

    public tipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(tipoTransacao tipo) {
        this.tipo = tipo;
    }

    public Transacao(String descricao, double valor, tipoTransacao tipo){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }
    public void exibirTransacao(){
        System.out.printf("Descricao: ", descricao);
        System.out.printf("Valor : ", valor);

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

