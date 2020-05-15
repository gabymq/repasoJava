public class ExampleJava {
    public static void main(String[] args) {
        String mensaje1 = "Hola Mundo";
        String mensaje2 = "LLLLAAAAAAAR MEEEENSAAAAJJJJJJEEEEE";

        boolean bandera1 = true;
        boolean bandera2 = false;

        int contador = 5;
        int num1 = 50;
        int num2 = 5;
        int resultado;

        if (bandera1) {

            System.out.println("variable" + mensaje1);
            System.out.println(contador);
        } else {
            System.out.println(mensaje2);
        }

        for (int i = 0; i <= contador; i++){
            System.out.println(mensaje1);
        }

        for (int i= 4; i < contador; i++){
            resultado = num1 / num2;
            System.out.println(resultado);
            num1 = num1 + i;
            num2++;
        }
        while (contador < 7){
            System.out.println("While");
            contador++;
        }
    }
}