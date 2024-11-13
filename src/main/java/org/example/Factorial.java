package org.example;

public class Factorial {
    /*
    * Si quiero el factorial del numero 5, tengo que multiplicar 1, 2, ... hasta
    * el numero que quiero hallar el factorial osea 5
    * */
    public static int fact(int numero){


//        while (numero > 0) {
//            factorial *= numero; // Multiplica el valor actual del factorial por el número
//            numero--; // Decrementa el número en 1
//        }
//
//        return factorial; // Retorna el factorial calculado
//        int i = 1;
//        for(int y = numero; y > 1; y--){
//            i = i * y;
//            System.out.println("i=i*y");
//            System.out.println(i+"="+i+"*"+y+"\n");
//        }
//        return i;
        int i = numero;

        while(numero > 1){
//            System.out.print(i+"="+i+"*("+numero+"-"+1+")");
            i = i * (numero - 1);
//            System.out.println("->"+i+"\n");
            numero--;
        }
        return i;
    }
}
