/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package negocio;


public class MaquinaComMoeda implements MaquinaState {

    private final Maquina maquina;

    public MaquinaComMoeda(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public MaquinaState semGoma() {
        System.out.println("Você precisa acionar a alavanca para obter uma goma.");
        return this;
    }

    @Override
    public MaquinaState comGoma() {
        System.out.println("Alavanca acionada.");
        maquina.liberarGoma();
        if (maquina.getContGomas() > 0) {
            return new MaquinaSemMoeda(maquina);
        } else {
            return new MaquinaSemGoma(maquina);
        }
    }

    @Override
    public MaquinaState semMoeda() {
        System.out.println("Moeda devolvida.");
        return new MaquinaSemMoeda(maquina);
    }

    @Override
    public MaquinaState comMoeda() {
        System.out.println("Você já inseriu uma moeda.");
        return this;
    }

}
