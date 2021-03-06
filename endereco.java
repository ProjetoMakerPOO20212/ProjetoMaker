package projetomaker;

import java.util.Scanner;

/**
 *
 * @author caios
 */
public class endereco {
    private String cidade, bairro, rua;
    private int cep;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public endereco(){
    }
    
    public endereco(String cidade, String bairro, String rua, int cep) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
    }
    
    public void imprimir() {
        System.out.println("Cidade: " + getCidade());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Rua: " + getRua());
        System.out.println("Cep: " + getCep());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Cidade: ");
        setCidade(ent.nextLine());
        System.out.println("Bairro: ");
        setBairro(ent.nextLine());
        System.out.println("Rua: ");
        setRua(ent.nextLine());
        System.out.println("Cep: ");
        setCep(Integer.parseInt(ent.nextLine()));
    }
}