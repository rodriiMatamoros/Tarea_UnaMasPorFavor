# Tarea_UnaMasPorFavor
Mi repositorio es: https://github.com/rodriiMatamoros/Tarea_UnaMasPorFavor.git

Ejercicios 1 y 2 respondidos en el ReadMe y el 3,4 y 5 en proyecto maven.

# Ejercicios de repaso
## 1. Dado el siguiente fragmento de código C:

a)¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?

b) Implemente un algoritmo iterativo equivalente.

### Respuesta:
a) La llamada a la función recursiva bisect(0,N) calcula la raíz cuadrada de 2 (N=2) mediante el método de la bisección. 
Al cambiar el valor de N, estaríamos calculando la raíz cuadrada de ese nuevo valor. Si cambiamos la función f(x), estaríamos
calculando la raíz de la ecuación f(x)=0 en el intervalo [0,N], utilizando el método de la bisección.

b) public class MetodoDeBiseccion {

    static final double N = 2;
    static final double PREC = 1e-6;

    static double f(double x) {
        return x * x - N;
    }

    static double bisect(double min, double max) {
        double med = (min + max) / 2;
        while (max - min >= PREC) {
            if (f(min) * f(med) < 0) {
                max = med;
            } else {
                min = med;
            }
            med = (min + max) / 2;
        }
        return med;
    }

    public static void main(String[] args) {
        double raiz = bisect(0, N);
        System.out.println("La raíz cuadrada de " + N + " es " + raiz);
    }
}


## 2. Dado el siguiente algoritmo recursivo:

a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda equivalentes.

### Respuesta:
