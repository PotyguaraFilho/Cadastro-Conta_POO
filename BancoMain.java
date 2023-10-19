
import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
        
        CadastroDeContas novaConta = new CadastroDeContas();
        Scanner lerDados = new Scanner(System.in);
        int item, loop = 0, miniLoop = 0;

        do{
            System.out.println("|=======================================|");
            System.out.println("|===   >>>      BANCO POO      <<<   ===|");
            System.out.println("|=======================================|");
            System.out.println("|=== [1] --> Cadastrar Conta  <--    ===|");
            System.out.println("|=== [2] -->  Procurar Conta  <--    ===|");
            System.out.println("|=== [3] -->  Excluir Conta   <--    ===|");
            System.out.println("|=== [4] -->  Mostrar Contas  <--    ===|");
            System.out.println("|=======================================|");
            System.out.print("\nDigite o número correspondente ao item desejado: ");
            item = lerDados.nextInt();
            
            switch(item){
                case 1:
                    System.out.print("Digite o número da conta: ");
                    int numConta = lerDados.nextInt();
                    System.out.print("Digite o valor inical da conta: ");
                    float valorConta = lerDados.nextFloat();
                    novaConta.cadastrar(numConta, valorConta);
                break;
                case 2:
                    System.out.print("Qual conta você procura? ");
                    int procuraConta = lerDados.nextInt();
                    novaConta.procurar(procuraConta);
                break;
                case 3:
                    System.out.println("Qual conta deseja excluir? ");
                    int excluirConta = lerDados.nextInt();
                    novaConta.excluir(excluirConta);
                break;
                case 4:
                    novaConta.qtdCadastradas();
                break;
                default:
                    System.out.println("\nOpção inexistente! Escolha entre 1 a 4!\n");
                    break;
            }
                System.out.println("\n\nSua operação foi realizada com sucesso!\n");
            do{
                System.out.println("Deseja fazer algo mais? S - Sim | N - Não: ");
                char resp = lerDados.next().charAt(0);

                if(resp == 's' || resp == 'S'){
                    miniLoop = 1;
                }
                else if(resp == 'n' || resp == 'N'){
                    System.out.println("\nPrograma encerrado!\n");
                    loop = 1;
                    miniLoop = 1;
                }
                else{
                    System.out.println("\nDigite S para sim ou N para não!\n");
                    miniLoop = 0;
                }
            }while(miniLoop == 0);
        }while(loop == 0);

        lerDados.close();
    }
}
