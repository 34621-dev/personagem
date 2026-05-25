package classes;

public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro1 = new Guerreiro(
                "Davi", 10, 120, "Espada");

        Guerreiro guerreiro2 = new Guerreiro(
                "Jeno", 8, 90, "Machado");

        guerreiro1.atacar();

        guerreiro1.atacar(35);

        guerreiro1.atacar(50, "Dragao");

        System.out.println();

        guerreiro1.exibirInfo();

        System.out.println();

        guerreiro2.exibirInfo();

        System.out.println();

        if (guerreiro1.getPontosDeVida() > guerreiro2.getPontosDeVida()) {

            System.out.println(
                    guerreiro1.getNome() + " esta em melhor estado."
            );

        } else if (guerreiro2.getPontosDeVida() > guerreiro1.getPontosDeVida()) {

            System.out.println(
                    guerreiro2.getNome() + " esta em melhor estado."
            );

        } else {

            System.out.println("Os dois guerreiros estao no mesmo estado.");
        }
    }
}