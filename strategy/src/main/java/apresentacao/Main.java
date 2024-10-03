package apresentacao;
import java.util.Scanner;

import negocio.Personagem;
import negocio.Round;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner in = new Scanner(System.in);

        System.out.println("Escola o Player 1");
        System.out.println("1. Rainha \n2. Rei \n3. Cavaleiro");
        int escolhaPerson1 = in.nextInt();
        
        System.out.println("Digite o apelido do seu Personagem");
        String apelidoPerson1 = in.next();

        Personagem personagem1 = Round.criarPersonagem(escolhaPerson1, apelidoPerson1);

        System.out.println("Escolha sua Opções de Arma");
        Round.mostrarOpcoesDeArma();
        int escolhaArmaPerson1 = in.nextInt();
        personagem1.setFormaDeLuta(Round.criarFormaDeLuta(escolhaArmaPerson1));

        System.out.println("Escola o Player 2");
        System.out.println("1. Rainha \n2. Rei \n3. Cavaleiro");
        int escolhaPerson2 = in.nextInt();
        System.out.println("Digite o apelido do seu Personagem");
        String apelidoPerson2 = in.next();

        Personagem personagem2 = Round.criarPersonagem(escolhaPerson2, apelidoPerson2);

        System.out.println("Escolha sua Opções de Arma");
        Round.mostrarOpcoesDeArma();
        int escolhaArmaPerson2 = in.nextInt();

        personagem2.setFormaDeLuta(Round.criarFormaDeLuta(escolhaArmaPerson2));

        System.out.println("Round 1 \nFIGTH!");

        Round.roundLuta(personagem1, personagem2);
        
        


    }
}