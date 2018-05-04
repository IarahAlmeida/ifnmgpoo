package br.edu.ifnmg.poo;

/**
 *
 * @author Iarah
 */
public class Pessoa {
    private String nome;
    protected int id;
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }
}
