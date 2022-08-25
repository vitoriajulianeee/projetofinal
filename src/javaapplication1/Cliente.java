/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author vfelinto54
 */
public class Cliente {
    private int idCliente, cpf;
    private String nome, telefone,endereco;
  

    public Cliente(int idCliente, String nome, String telefone, String endereco, int cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    //sem o id, pq determinadas momentos não vai ser preciso passar o id vai 
    //pq ele vai ser gerado automaticamente pelo BD
    public Cliente(String nome, String telefone, String endereco, int cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCpf() {
        return cpf;
    }
    
    
}
