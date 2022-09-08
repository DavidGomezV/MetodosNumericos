package metodobiseccion;

public class MetodoBiseccion {

    public static void main(String[] args) {
        Metodo metodo = new Metodo();

        metodo.setFuncion("x^2 - 5");
        double raiz = metodo.biseccion(2, 2.5, 0.001);
        System.out.println("La raíz es: " + raiz);

metodo.setFuncion("cos(x)-x");
        double raiz2 = metodo.biseccion(0, Math.PI/2, 0.001);
        System.out.println("La raíz es: " + raiz2);


    }

}
