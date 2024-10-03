package negocio;

import java.util.Scanner;

public class Round {
    
    public static Personagem criarPersonagem(int opcao, String apelido){
        switch (opcao) {
            case 1: return new Rainha(apelido);
            case 2: return new Rei(apelido);
            case 3: return new Cavaleiro(apelido);
            default: throw new IllegalArgumentException("Personagem Invalido");
        }
    }

    public static FormaDeLuta criarFormaDeLuta(int opcao){
        switch (opcao) {
            case 1: return new ComArcoEflecha();
            case 2: return new ComEspada();
            case 3: return new ComFaca();
            case 4: return new ComMachado();
            default: throw new IllegalArgumentException("Arma Invalida");
                
        }
    }

    public static void roundLuta(Personagem p1, Personagem p2){
        System.out.println("Luta Começa entre: " + p1.apelido + " e " + p2.apelido);

        Scanner in = new Scanner(System.in);
        
        while(p1.vida > 0 && p2.vida > 0){
            System.out.println("Escolha uma Ação");
            System.out.println("Player1: (A) Atacar " + p2.apelido);
            System.out.println("Player2: (B) Atacar " + p1.apelido);
            System.out.println("UP1: trocar de arma PLAYER 1");
            System.out.println("UP2: trocar de arma PLAYER 2");

            String acao = in.nextLine().toUpperCase();

            if(acao.equals("A")){
                p1.atacar(p2);
            }else if(acao.equals("B")){
                p2.atacar(p1);
            }else if(acao.equals("UP1")){
                System.out.println(p1.apelido + " escolha sua nova arma.");
                mostrarOpcoesDeArma();
                int novaArma = in.nextInt();
                in.nextLine();
                p1.setFormaDeLuta(criarFormaDeLuta(novaArma));
                System.out.println(p1.apelido + " trocou de arma");
            }else if(acao.equals("UP2")){
                System.out.println(p2.apelido + " escolha sua nova arma.");
                mostrarOpcoesDeArma();
                int novaArma = in.nextInt();
                in.nextLine();
                p2.setFormaDeLuta(criarFormaDeLuta(novaArma));
                System.out.println(p2.apelido + " trocou de arma");
            }
        }

        if(p1.vida > 0){
            System.out.println(p1.apelido + " VENCEU");
        } else{
            System.out.println(p2.apelido + " VENCEU");
        }
    }

    public static void mostrarOpcoesDeArma() {
        System.out.println("1. Arco e Flecha");
        System.out.println("2. Espada");
        System.out.println("3. Faca");
        System.out.println("4. Machado");
    }




}
