package trabalho_pratico01;

public class ContaPoupanca extends Conta {
    
    private double taxa;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
        
     public void reajustar(double taxa){
        double saldoAtual = this.getSaldo();
        double saldoReajustado = this.getSaldo() + (saldoAtual * (taxa/100));
        this.setSaldo(saldoReajustado);
     }
    
     public void reajustar(){
        double saldoAtual = this.getSaldo();
        double saldoReajustado = saldoAtual * (0.1);
        this.setSaldo(saldoReajustado);
     }
     
     @Override
     public void tipoConta(){
         System.out.println("Tipo de Conta: Conta POupanca."); 
     }
    
}
