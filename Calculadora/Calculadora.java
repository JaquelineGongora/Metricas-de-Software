public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b; // No hay manejo de excepciones para división por cero
    }

    public int operacionCompleja(int a, int b, int c) {
        int resultado = a + b;
        resultado *= c;
        resultado -= b;
        resultado /= (a + 1);
        resultado += 5;
        return resultado;
    }
}
