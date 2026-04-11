public class Moto extends Veiculo {
    private int quantasCilidrada;

    public Moto(String marca, String modelo, int ano, String placa, double precoBase, int quantasCilidrada) {
        super(marca,modelo, ano, placa, precoBase);
        this.quantasCilidrada = quantasCilidrada;
    }
    @Override
    public double calcularDiaria(){
        if (quantasCilidrada > 300){
            return getPrecoBase() * 1.15;
        }
        return  getPrecoBase();

    }
    @Override
    public String exibirDados() {
        return super.exibirDados() + " " + quantasCilidrada;
    }
}
