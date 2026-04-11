public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Porsche", "Cayanne", 2027, "huf-8888", 2350, 4);
        Moto moto1 = new Moto("Suzuki", "Hayabusa", 2005, "jjj-888", 190, 1000);

        System.out.println(carro1.exibirDados());
        System.out.println(moto1.exibirDados());

        Locadora locadora = new Locadora();

        locadora.adicionarveiculo(new Carro("Porsche", "Cayanne", 2027, "huf-8888", 2350, 4));
        locadora.adicionarveiculo(new Moto("Suzuki", "Hayabusa", 2005, "jjj-888", 190, 1000));
        locadora.adicionarveiculo(carro1);
        locadora.adicionarveiculo(moto1);

        locadora.listarVeiculo();

    }

}
