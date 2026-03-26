public class Main {
    public static void main(String[] args) {
        /*EXERCÍCIO 1*/

        Carro carro = new Carro( "alguma", "fox", "JANELA");
        Moto moto = new Moto("algum", "AAAA", "GUIDAO");

        carro.exibirInformacoes();
        moto.exibirInformacoes();


        /*EXERCÍCIO 2*/

        Gerente rodrigo = new Gerente();
        rodrigo.nome = "Rodrigo Cardoso";
        rodrigo.salario = 2000.00;
        rodrigo.bonus = 1000.00;

        Estagiario laura = new Estagiario();
        laura.nome = "Laura Roberta";
        laura.salario = 1500.00;
        laura.cargaHoraria = 60;

        /*EXERCÍCIO 3*/
        Cachorro cacau = new Cachorro();
        cacau.fazerSom();

        Gato mingau = new Gato();
        mingau.fazerSom();

        /*EXERCÍCIO 4*/

        ContaCorrente contaJoão = new ContaCorrente();
        contaJoão.titular = "João Felipe";
        contaJoão.limiteCredito = 400.00;
        contaJoão.saldo = 100.00;

        ContaPoupanca contaStephany = new ContaPoupanca();
        contaStephany.titular = "Stephany Christine";
        contaStephany.saldo = 10000.00;
        contaStephany.rendimento = 90000.00;


    }
}
