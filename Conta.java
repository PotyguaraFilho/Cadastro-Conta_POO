
public class Conta {
   private int numeroConta;
   private float saldoConta;


    public Conta(int numeroConta, float saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    //GET e SET - Número da Conta.
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    //GET e SET - Saldo da Conta.
    public float getSaldoConta(){
        return this.saldoConta;
    }
    public void setSaldoConta(float saldoConta){
        this.saldoConta = saldoConta;
    }

}
