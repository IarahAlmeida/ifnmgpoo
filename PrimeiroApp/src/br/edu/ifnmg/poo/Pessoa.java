package br.edu.ifnmg.poo;

/**
 *
 * @author Iarah
 */
public class Pessoa {
    protected int id;
    private String nome;
    public Pessoa() {
        this.nome = "sem nome";
        this.id = 0;
    }
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return this.id + "\t" + this.nome;
    }
}
