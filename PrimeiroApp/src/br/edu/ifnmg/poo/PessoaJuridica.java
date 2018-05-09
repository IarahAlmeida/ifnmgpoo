package br.edu.ifnmg.poo;

/**
 *
 * @author Iarah
 */
public class PessoaJuridica extends Pessoa {
    private long cnpj;
    public PessoaJuridica() {
        this.cnpj = 0;
    }
    public PessoaJuridica(int id, String nome, long cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    public long getCnpj() {
        return cnpj;
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + this.cnpj;
    }
}
