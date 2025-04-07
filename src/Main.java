public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 4", "93487");
        System.out.println(iphone);
        iphone.selecionarMusica("Kendrick Lamar");
        iphone.atender();

        iphone.exibirPagina("https://github.com");
    }
}