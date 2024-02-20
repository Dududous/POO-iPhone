public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;

    // Construtor
    public iPhone(String modelo) {
        this.modelo = modelo;
    }

    // Implementação dos métodos das interfaces
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na Internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Método main para testar todos os métodos
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone("iPhone 13");

        // Testando métodos do Reprodutor Musical
        meuIPhone.selecionarMusica();
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando métodos do Aparelho Telefônico
        meuIPhone.ligar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando métodos do Navegador na Internet
        meuIPhone.exibirPagina();
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
