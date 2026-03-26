public class Carro extends Veiculo {
    private String janela;

    public Carro(String marca, String modelo, String janela){
        super(marca, modelo);
        this.janela=janela;

    }

    public String getJanela(){
        return janela;
    }
}
