import Lutador.Lutador;

public class Main {
    public static void main(String[] args) {

//EXISTE ESSA É UMA FORMA DE FAZER
//Leves:
Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1 );
Lutador l2 = new Lutador("Putscrip", "Brasil", 29, 1.68, 57.8, 14, 2, 1);

//Médios:
Lutador l3 = new Lutador("Snashadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
Lutador l4 = new Lutador("Dead Code", "Austrália", 28, 1.94, 81.6, 13, 0, 2);

//Pesados:
Lutador l5 = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
Lutador l6 = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);

// MAS PODEMOS FAZER EM FORMAS DE VETOR!----------------------


//--------------------------------------------------------------
        System.out.println("E COM VOCÊS ");
        System.out.println("");
        System.out.println("Para as lutas da noite temos:");
        l1.apresentar();
        System.out.println("___________X___________");
        l2.apresentar();
        System.out.println("");
        System.out.println("----------------------------------------------");
        l3.apresentar();
        System.out.println("___________X___________");
        l4.apresentar();
        System.out.println("");
        System.out.println("----------------------------------------------");
        l5.apresentar();
        System.out.println("___________X___________");
        l6.apresentar();
        System.out.println("");
        System.out.println("----------------------------------------------");
    }
}