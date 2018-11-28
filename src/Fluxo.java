public class Fluxo {

    public static void main(String[] args) {
        System.out.println("ini do main");
        metodo1();
        System.out.println("fim do main");
    }

    public static void metodo1(){
        System.out.println("ini do metodo 1");
        metodo2();
        System.out.println("fim do metodo 1");
    }

    private static void metodo2() {
        System.out.println("ini do metodo 2");

        for(int i = 1; i <=5; i++){
            System.out.println(i);
        }

        System.out.println("fim o metodo 2 ");
    }


}
