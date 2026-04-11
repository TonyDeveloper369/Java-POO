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
}
