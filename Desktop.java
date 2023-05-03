public class Desktop extends Computador {

    protected Integer potenciaDaFonte;

    @Override
    public void getInformacoes() {
        super.getInformacoes();
        System.out.println(" - Potencia da fonte: " + this.potenciaDaFonte);
    }

    @Override
    public void cadastrar(String mod, String cor, Double preco, Integer potenciaDaFonte) {
        super.modelo = mod;
        super.cor = cor;
        super.preco = preco;
        this.potenciaDaFonte = potenciaDaFonte;
    }

}
