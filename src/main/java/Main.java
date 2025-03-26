
public class Main {
    public static void main(String[] args) {
   GestorFinanceiro gestor = new GestorFinanceiro();
   gestor.adicionarTransacao("Salario", 5000.0, Transacao.tipoTransacao.RECEITA);
   gestor.adicionarTransacao("Freelancer", 1200.0, Transacao.tipoTransacao.RECEITA);
   gestor.adicionarTransacao("Aluguel", 1500.0, Transacao.tipoTransacao.DESPESA);
   gestor.adicionarTransacao("Supermercado", 600.0, Transacao.tipoTransacao.DESPESA);
   gestor.adicionarTransacao("Internet", 100.0, Transacao.tipoTransacao.DESPESA);

   gestor.listarTransacoes();

   System.out.printf("\nSaldo Final : R$ %.2f\n", gestor.calcularSaldo());
    }
}