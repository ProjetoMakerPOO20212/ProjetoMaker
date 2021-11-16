package projetomaker;

import java.util.Scanner;

/**
 *
 * @author caios
 */

public class pessoa {
    private int codigo;
    private String nome;
    
    endereco endereco = new endereco();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public pessoa(){
    }
    
    public pessoa(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public pessoa(int codigo, String nome, String cidade, String bairro, 
            String rua, int cep){
        this.codigo = codigo;
        this.nome = nome;
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setRua(rua);
        endereco.setCep(cep);
    }
    
    public void imprimir() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        endereco.imprimir();
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Codigo: ");
        setCodigo(Integer.parseInt(ent.nextLine()));
        System.out.println("Nome: ");
        setNome(ent.nextLine());
        endereco.entrada();
    }
}