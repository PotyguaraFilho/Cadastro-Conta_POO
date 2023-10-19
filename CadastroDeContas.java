import java.util.ArrayList;
import java.util.List;

public class CadastroDeContas {
    Conta numeroConta;
    Conta saldoConta;
    private int qtdConta = 0;
    private int capacidade;
  
    List<Conta> contas = new ArrayList<>(); 

    public CadastroDeContas() {
        capacidade = 10;
        this.contas = new ArrayList<>(capacidade);
    }
    public CadastroDeContas(int capacidade){
        if(capacidade < 5){
            capacidade = 5;
        }
        this.capacidade = capacidade;
        this.contas = new ArrayList<>(capacidade);
    }

    public void cadastrar(int numeroConta, float saldoConta){

        boolean statusConta = false;
        
        if(this.qtdConta < capacidade){
            Conta novaConta = new Conta(numeroConta, saldoConta);
            contas.add(novaConta);
            System.out.printf("Conta [%d] - Criada com Sucesso!\n", this.qtdConta + 1); 
            statusConta = true;
            this.qtdConta++;
        }
        
        if(!statusConta){
            System.out.println("Não foi possível adicionar a conta!");
        }
    }
    public void procurar(int numeroConta){

        boolean contaEncontrada = false;

        if(qtdConta == 0){
            System.out.println("\nNão há contas cadastradas.\n");
            return;
        }
        for(int i = 0; i < contas.size(); i++){
            if(contas.get(i).getNumeroConta() == numeroConta){
                System.out.printf("Conta [%d] Encontrada!\nNúmero: %d\nSaldo: R$%.2f", i + 1,
                    contas.get(i).getNumeroConta(),contas.get(i).getSaldoConta());
                contaEncontrada = true;
                break;
            }
        }
        if(!contaEncontrada){
            System.out.println("\nConta inexistente!");
        }
    }
    public void excluir(int numeroConta){
        boolean contaExcluida = false;

        if(qtdConta == 0){
            System.out.println("\nNão há contas para excluir!");
            return;
        }
        for(int i = 0; i < contas.size(); i++){
            if(contas.get(i).getNumeroConta() == numeroConta){
                contas.remove(i);
                System.out.println("\nConta removida com sucesso!");
                qtdConta--;
                contaExcluida = true;
                break;
            }
        }
        if(!contaExcluida){
            System.out.println("Conta inexistente!");
        }

    }
    public void qtdCadastradas(){
        if(qtdConta == 0){
            System.out.println("\nNão há contas cadastradas!");
        }
        else{
            System.out.printf("\nO Banco possui %d conta(s) cadastrada(s)!\n", qtdConta);
            
            for(int i = 0; i < contas.size(); i++){
                System.out.printf("\nNº Conta: %d\n", contas.get(i).getNumeroConta());
            }
        }
    }
}
