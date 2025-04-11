package Lutador;

import java.lang.reflect.Constructor;

public class Lutador {

    //Atributos:--------------------------------

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;

    //Método (Especiail) Construtor:-----------------------------

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }

    //Métodos:--------------------------------------

    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitórias: " + this.getVitoria());
        System.out.println("derrotas: " + this.getDerrota());
        System.out.println("Empates: " + this.getEmpate());

    }
    public void status() {

    }
    public void ganharLuta() {

    }
    public void perderLuta() {

    }
    public void empatarLuta() {

    }
    //Getters e Setters:-----------------------------------

    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }
//-------------------------------------------
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
//--------------------------------------------------
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }
//----------------------------------------------------
    public double getAltura() {
        return altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }
//--------------------------------------------------------
    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
       // this.setCategoria();
    }
//-----------------------------------------------------------------
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String ca) {
        this.categoria = ca;
    }
//-----------------------------------------------------------
    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vi) {
        this.vitoria = vi;
    }
//-----------------------------------------------------------
    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int de) {
        this.derrota = de;
    }
    //-----------------------------------------------------------
    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int em) {
        this.empate = em;
    }
}
