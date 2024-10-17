/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package negocio;


public class MaquinaSemMoeda implements MaquinaState {

    private final Maquina maquina;


    public MaquinaSemMoeda(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public MaquinaState semGoma() {
        System.out.println("Você precisa inserir uma moeda primeiro.");
        return this;
    }

    @Override
    public MaquinaState comGoma() {
        System.out.println("Você precisa inserir uma moeda primeiro.");
        return this;
    }

    @Override
    public MaquinaState semMoeda() {
        System.out.println("Você não inseriu uma moeda.");
        return this;
    }

    @Override
    public MaquinaState comMoeda() {
        System.out.println("Moeda inserida.");
        maquina.adicionarMoeda();
        return new MaquinaComMoeda(maquina);
    }

}
