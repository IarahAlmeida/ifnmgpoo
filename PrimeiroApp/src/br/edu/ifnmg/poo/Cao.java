package br.edu.ifnmg.poo;

/**
 *
 * @author Iarah
 */
public class Cao {
    private String nome;
    private String raca;
    private String cor;
    private float peso;
    private int idade;
    private String latido;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPeso(float peso) {
        if (peso < 0) {
            this.peso = 0;
        } else {
            this.peso = peso;
        }
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            this.idade = 0;
        } else {
            this.idade = idade;
        }
    }
    public void setLatido(String latido) {
        this.latido = latido;
    }
    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }
    public String getCor() {
        return cor;
    }
    public float getPeso() {
        return peso;
    }
    public int getIdade() {
        return idade;
    }
    public String getLatido() {
        return latido;
    }
}
