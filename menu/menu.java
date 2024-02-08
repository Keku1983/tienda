package menu;

import leer.leer_optimizado;

public class menu {

    /**menu
     * Muestra un mensaje inicial de bienvenida a la tienda virtual.
     */
    public static void mostrarMensajeInicial() {
    // Código del método.

        System.out.println("Bienvenido a la tienda virtual\n\n"
                + "El programa simula una tienda que vende juegos, música y cine\n"
                + "Solamente se pueden vender productos si aparecen disponibles en la tienda\n");
    }

    /**
     * Muestra las opciones del menú principal.
     */
    public static void mostrarOpcionesMenu() {
    // Código del método.

        System.out.println("\nSeleccione qué desea realizar:\n\n"
                + "\t1. Mostrar productos. (Listar productos)\n"
                + "\t2. Comprar productos\n"
                + "\t3. Mostrar caja. (Importe total de la compra actual)\n"
                + "\tSALIR --> Pulse cualquier otro número\n");
    }

    /**
     * Muestra un mensaje de fin al usuario.
     */
    public static void mostrarMensajeFin() {
    // Código del método.    

        System.out.println("---- Gracias por usar este software. ----");
    }

    /**
     * Nos dá la opción ingresada por el usuario desde la entrada.
     * @return Opción ingresada por el usuario.
     */
    public static int obtenerOpcionUsuario() {
        return leer_optimizado.datoInt();
    }

    /**
     * Este es el método principal donde se inicia la ejecución del programa.
     * @param args Explicación de la linea de comandos.
     */
    public static void main(String[] args) {
        //Código del método.

        mostrarMensajeInicial();

        boolean continuar = true;
        /**El bucle do-while ejecuta el codigo mientras 
         * se cumple la condición, cuando no se cumple para.
         */
        do {
            mostrarOpcionesMenu();

            switch (obtenerOpcionUsuario()) {
                case 1:
                    // Mostrar productos
                    break;
                case 2:
                    // Comprar productos
                    break;
                case 3:
                    // Mostrar la caja
                    break;
                default:
                    // Se sale del programa
                    continuar = false;
            }

        } while (continuar);

        mostrarMensajeFin();
    }
}