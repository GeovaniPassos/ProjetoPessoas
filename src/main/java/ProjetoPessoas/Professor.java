/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoPessoas;

/**
 *
 * @author Geovani-PC
 */
public class Professor extends Pessoa{
    
    private String escolaridade;
    private float salario;
    
    public void receberAumento(float aum){
        this.salario += aum;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
