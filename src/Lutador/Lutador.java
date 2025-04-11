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
        System.out.println("__________________________________________________________________");
        System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR " + this.getNome());
        System.out.println("Diretamenre de: " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + "anos e " + this.getAltura());
        System.out.println("Pesando: " + this.getPeso() + "kg");
        System.out.println(this.getVitoria() + " Vitoria(s)!");
        System.out.println(this.getDerrota()+ " Derrota(s)");
        System.out.println(this.getEmpate() + " Empate(s)!");

    }
    public void status() {
        System.out.println("_________________________________");
        System.out.println(this.getNome() + " é um peso " + this.getPeso());
        System.out.println("Ganhou " + this.getVitoria() + " vezes");
        System.out.println("Perdeu " + this.getDerrota() + " vezes");
        System.out.println("Empatou " + this.getEmpate() + " vezes");
    }
    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta() {
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
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
       this.setCategoria();
    }
//-----------------------------------------------------------------
    public String getCategoria() {
        return categoria;
    }
//Como a categoria vai mudar assim que colocar o peso, ficou dessa forma:
    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            System.out.println("Invalido");
        }else if (this.getPeso() <= 70.3) {
            System.out.println("Peso leve");
        }else if (this.getPeso() <= 83.9) {
            System.out.println("Médio");
        }else if (this.getPeso() <= 120.2) {
            System.out.println("Pesado");
        }else {
            System.out.println("Invalido");
        }
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
