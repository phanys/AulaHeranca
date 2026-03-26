public class Moto extends Veiculo{
    private String guidao;

    public Moto(String marca, String modelo, String guidao){
        super(marca, modelo);
        this.guidao=guidao;
    }

    public String setGuidao(){
        return guidao;
    }

}
