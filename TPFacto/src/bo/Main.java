package bo;

public class Main {
	
	private static int factoriel(int chiffre) {
        if (chiffre == 1) {
            return 1;
        } else {
            return chiffre * factoriel(chiffre - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factoriel(4)); 
    }
}