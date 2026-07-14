// Classe que representa um personagem do tipo herói
public class Personagem {

    // Atributos do personagem
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Método que exibe todas as informações do personagem no console
    void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
        System.out.println(); // linha em branco para separar os personagens
    }

    // Método principal — ponto de entrada do programa
    public static void main(String[] args) {

        // Instanciando o primeiro personagem
        Personagem heroi1 = new Personagem();
        heroi1.nome = "Arthemis";
        heroi1.classe = "Arqueira";
        heroi1.nivel = 5;
        heroi1.pontosDeVida = 80;
        heroi1.poderBase = 12.5;

        // Instanciando o segundo personagem
        Personagem heroi2 = new Personagem();
        heroi2.nome = "Thalion";
        heroi2.classe = "Mago";
        heroi2.nivel = 8;
        heroi2.pontosDeVida = 60;
        heroi2.poderBase = 20.0;

        // Exibindo os status de cada personagem
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
