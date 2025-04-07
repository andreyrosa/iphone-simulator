public class Iphone implements AparalhoTelefonico, ReprodutorMusical, NavegadorInternet{

    private String modelo;
    private String numeroSerie;

    public Iphone(String modelo, String numeroSerie){
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero Serie: " + numeroSerie);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página.");
    }

    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Pausando música.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a Musica: " + musica);
    }
}
