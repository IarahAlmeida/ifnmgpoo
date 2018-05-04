package br.edu.ifnmg.poo.sub;

import br.edu.ifnmg.poo.Empregado;
import br.edu.ifnmg.poo.Pessoa;
import br.edu.ifnmg.poo.PessoaFisica;

/**
 *
 * @author Iarah
 */
public class Externa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        PessoaFisica pf1 = new PessoaFisica();
        Empregado e1 = new Empregado();
        e1.setMatricula(123456789);
        //p1.id = 123456;
        //e1.matricula = 123456789;
        //System.out.println(e1.matricula);
        pf1.setNome("Paulo Troxa");
        pf1.setCpf(45454545);
        pf1.cpf = 45454646;
        System.out.println(pf1.getNome());
        System.out.println(pf1.getCpf());
    }
}
