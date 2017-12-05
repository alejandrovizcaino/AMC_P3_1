package problematrespuntos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ProblemaTresPuntos {

    private List<Punto> puntos;
    private int nelementos;

    public ProblemaTresPuntos(int nelementos) {
        puntos = new ArrayList<Punto>();
        this.nelementos = nelementos;
        Random r = new Random();
        //r.setSeed(System.currentTimeMillis());

        for (int i = 0; i < nelementos; i++) {
            Punto p1 = new Punto(r.nextInt(20), r.nextInt(20));
            puntos.add(p1);
        }
    }

    public void mostrarConjunto() {
        for (int i = 0; i < puntos.size(); i++) {
            Punto p = puntos.get(i);
            System.out.println("(" + p.getX() + "," + p.getY()+")" );
        }
    }

    public int busquedaExhaustiva() {
        int distancia;
        for (int n = 0; n < nelementos; n++) {

            Punto p = new Punto(puntos.get(n).getX(), puntos.get(n).getY());
            for (int i = 0; i < nelementos; i++) {
                Punto s = new Punto(puntos.get(i).getX(), puntos.get(i).getY());
                for (int j = 0; j < nelementos; j++) {

                }
            }
        }

        return distancia;
    }

    public static void main(String[] args) {
        int n;
        System.out.printf("Escribe el numero de puntos: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ProblemaTresPuntos p = new ProblemaTresPuntos(n);

        p.mostrarConjunto();
    }

}
