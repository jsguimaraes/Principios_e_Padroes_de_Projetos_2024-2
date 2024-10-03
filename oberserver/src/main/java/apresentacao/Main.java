/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apresentacao;

import negocio.Leiloeiro;
import negocio.Participante;
import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner in = new Scanner(System.in);
        Leiloeiro leiloeiro = new Leiloeiro();
        Participante participante = new Participante("Jaime");
        Participante participante2 = new Participante("Maisson");
        Participante participante3 = new Participante("Adriano");
        
        
        leiloeiro.addSubscribe(participante);
        leiloeiro.addSubscribe(participante2);
        leiloeiro.addSubscribe(participante3);

        leiloeiro.iniciaLeilao();

        boolean continuar = true;
        while (continuar) {
            for (Participante p : new Participante[]{participante, participante2, participante3}) {
                System.out.print(p.getNome() + ", digite seu lance (ou -1 para sair): ");
                float lance = in.nextFloat();

                if (lance == -1) {
                    continuar = false;
                    break;
                }

                p.darLance(lance);
                leiloeiro.changeState(p);
            }
        }


        leiloeiro.terminaLeilao();




    }
}
