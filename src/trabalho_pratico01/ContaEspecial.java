package trabalho_pratico01;
import javax.swing.JOptionPane;

public class ContaEspecial extends Conta{
    
    private double limite;
    private double multa;
     
    @Override
    public void sacar(double valor){
        if(limite <= 0){
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente."  + "\n" + "Saldo do Cheque Especial Indisponivel: " + (this.getSaldo() + limite));
        }
        else if(valor > this.getSaldo() ){
            JOptionPane.showMessageDialog(null,"Saldo da conta insuficiente, usar cheque especial?");
            double valorMulta = Math.abs(this.getSaldo() - valor) * multa;
            double saldoChequeRestante = ((this.getSaldo() + limite) - valor) - valorMulta;
            this.setSaldo(0.0);
            limite = saldoChequeRestante;
            JOptionPane.showMessageDialog(null,"Sauqe efetuado com sucesso. " + "\n" + "Saldo restante do Cheque Especial: " + limite); 
            
        }
        else if( valor > (this.getSaldo() + limite)){
            JOptionPane.showMessageDialog(null,"Confirmar Saque?");
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente."  + "\n" + "Saldo total da conta: " + (this.getSaldo() + limite));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Confirmar Saque?");
            double saldoEspecial = this.getSaldo() - valor;
            this.setSaldo(saldoEspecial);
            JOptionPane.showMessageDialog(null,"Sauqe efetuado com sucesso. " + "\n" + "Saldo restante: " + this.getSaldo()); 
        }
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
    
    public void setMulta(double multa) {
        this.multa = multa;
    }
    
     @Override
    public void tipoConta(){
        System.out.println("Tipo de Conta: Conta Especial.");
    }
    
    }
    

