package org.example;

public class Funcionario implements Cloneable {
    private int matricula;
    private String nome;
    private Endereco endereco;
    private String cargo;

    public Funcionario(int matricula, String nome, Endereco endereco, String cargo) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.endereco = (Endereco) funcionarioClone.endereco.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}