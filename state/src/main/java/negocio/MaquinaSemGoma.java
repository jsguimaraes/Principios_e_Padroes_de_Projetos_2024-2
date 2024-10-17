/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package negocio;


public class MaquinaSemGoma implements MaquinaState {

    private final Maquina maquina;

    public MaquinaSemGoma(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public MaquinaState semGoma() {
        System.out.println("Não há gomas disponíveis.");
        return this;
    }

    @Override
    public MaquinaState comGoma() {
        System.out.println("Não há gomas disponíveis.");
        return this;
    }

    @Override
    public MaquinaState semMoeda() {
        System.out.println("Você não pode inserir uma moeda, não há gomas.");
        return this;
    }

    @Override
    public MaquinaState comMoeda() {
        System.out.println("Você não pode inserir uma moeda, não há gomas.");
        return this;
    }

}
