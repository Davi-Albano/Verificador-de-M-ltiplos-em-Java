public class Uni4Exe09 {
    private int num1;
    private int num2;

    public Uni4Exe09(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String multiplo() {
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            return "Os valores são múltiplos.";
        } else {
            return "Os valores não são múltiplos.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu primeiro valor inteiro:");
        int num1 = sc.nextInt();

        System.out.println("Digite seu segundo valor inteiro:");
        int num2 = sc.nextInt();

        Uni4Exe09 valor = new Uni4Exe09(num1, num2);
        System.out.println(valor.multiplo());
        sc.close();
    }

}
