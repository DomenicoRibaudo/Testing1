//Riprendi uno degli esercizi già svolti e corretti
//        Aggiungi Junit al progetto
//        Crea una funzione di test che non dia errori
public class Main {
    public static void main(String[] args) {

    }
    public static int eseguiSomma(Integer a, Integer b) {
        // Verifica se uno dei parametri è null e lancia un'eccezione se necessario
        if (a == null || b == null) {
            throw new NullPointerException("I parametri non possono essere nulli");
        }

        // Esegue la somma se entrambi i parametri sono non nulli
        return a + b;
    }
}
