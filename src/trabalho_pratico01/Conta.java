package trabalho_pratico01;
import javax.swing.JOptionPane;

public class Conta {
        private String nome;
        private int numero;
        private double saldo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
        
    public void depositar(double valor){
        this.saldo += valor;
        JOptionPane.showMessageDialog(null,"Deposito efetuado com sucesso.");
    }    
       
    public void sacar(double valor){
        if(this.getSaldo() < valor)
        {
            JOptionPane.showMessageDialog(null,"Confirmar Saque?");
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente."  + "\n" + "Saldo em conta: " + this.getSaldo());
        }
        else if(this.getSaldo() >= valor)
        {
            JOptionPane.showMessageDialog(null,"Confirmar Saque?");
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null,"Sauqe efetuado com sucesso. " + "\n" + "Saldo restante: " + this.getSaldo());    
        }
        
        
    }
    
    public void trasferir(Conta origem, Conta destino, double valor){
       
       
    }
    
    public void tipoConta(){
        JOptionPane.showMessageDialog(null,"Tipo de conta: Conta Comum.");
    }
}
