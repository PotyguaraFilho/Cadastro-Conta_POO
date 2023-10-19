# Cadastro-Conta_POO
It consists of a bank account registration system with the functionalities of a CRUD, in Java (POO).

Classe Conta: Esta classe é usada para representar uma conta bancária. Ela armazena duas informações principais:
    numeroConta: O número da conta.
    saldoConta: O saldo da conta.
Além disso, existem quatro métodos, dois para acessar (GET) e dois para modificar (SET) esses valores. Os métodos permitem obter o número da conta e o saldo da conta, enquanto os métodos permitem definir o número da conta e o saldo da conta.

Classe CadastroDeContas: Aqui, temos uma classe que lida com o cadastro e gerenciamento de várias contas bancárias. Possui as seguintes partes:

Atributos:
    contas: Uma lista (como uma folha de papel com várias contas escritas) que armazena objetos do tipo Conta.
    qtdConta: Mantém o controle de quantas contas estão cadastradas.
    capacidade: Define o número máximo de contas que podem ser armazenadas na lista.

Construtores:
    CadastroDeContas(): Cria uma lista de contas com espaço para 10 contas por padrão.
    CadastroDeContas(int capacidade): Cria uma lista de contas com espaço para um número específico de contas, garantindo que seja pelo menos 5.

Método cadastrar(int numeroConta, float saldoConta): Este método permite adicionar uma nova conta a lista. Verifica se ainda há espaço (não ultrapassou a capacidade) e adiciona uma nova conta à lista. Ele também atualiza o número de contas cadastradas.

Método procurar(int numeroConta): Este método procura uma conta específica na lista usando o número da conta fornecido. Se encontrar a conta, mostra suas informações (número e saldo). Caso contrário, diz que a conta não foi encontrada.

Método excluir(int numeroConta): Este método remove uma conta da lista com base no número da conta fornecido. Se a conta existir, ela é excluída, e o número de contas é atualizado. Se não existir, o programa informa que a conta não existe.

Método qtdCadastradas(): Este método exibe quantas contas foram cadastradas e lista os números das contas. Se não houver contas, ele informa que não há contas cadastradas.

Classe BancoMain: Esta é a classe principal que inicia o programa. Aqui estão as principais partes:

Método main(String[] args): É o ponto de partida do programa. Começa criando uma lista de contas (uma instância de CadastroDeContas) e entra em um loop que permite ao usuário escolher opções.

Principal de loop - O programa oferece opções para o usuário:

1.	Cadastrar uma nova conta com um número e saldo.
2.	Procurar uma conta pelo número.
3.	Excluir uma conta pelo número.
4.	Mostrar quantas contas estão cadastradas.
5.	Sair do programa.
   
O programa pede ao usuário que escolha uma opção, realiza a ação correspondente com base na escolha do usuário e depois pergunta se o usuário deseja fazer mais operações ou sair do programa.
