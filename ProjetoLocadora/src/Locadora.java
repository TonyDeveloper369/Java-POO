import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> frota;
    public Locadora(){
        this.frota = new ArrayList<>();

    }
    public void adicionarveiculo(Veiculo veiculo) {
        frota.add(veiculo);


    }
    public void listarVeiculo(){
        for (int i = 0; i < frota.size(); i++){
            Veiculo v = frota.get(i);

            System.out.printf("[%d] %s | Diaria: R$ %.2f\n", (i + 1), v.exibirDados(), v.calcularDiaria());

        }
        System.out.println("==============================");

    }
    public  List<Veiculo> getFrota(){
        return  frota;
    }

    public void aluguelVeiculo(int dias, int idVeiculo){
        Veiculo veiculo = frota.get(idVeiculo - 1);
        double total = veiculo.calcularDiaria() * dias;

        System.out.println(" ====== Resumo do aluguel veiculo =======");
        System.out.println("Veiculo: " + veiculo.exibirDados());
        System.out.println("Quantidade de dias: " + dias);
        System.out.printf("Valor diario: %.2f ", veiculo.calcularDiaria());
        System.out.printf("\n Total do periodo da regencia: %.2f ", total);


    }

}
