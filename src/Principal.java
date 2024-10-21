import com.google.gson.JsonSyntaxException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 9;

        // Esta instancia se utilizará para realizar consultas de conversiones de moneda.
        Consulta consulta = new Consulta();

        /* Se pasa una instancia de `ConsultaConversion` al constructor de `Calculos` porque esta clase necesita
          acceder a ella para realizar las conversiones de moneda. */

        Conversion calculos = new Conversion(consulta);
        GrabaLog graba = new GrabaLog();

        List<String> respuestas = new ArrayList<>();

        String menu = """
                *****************************************************
                *               Conversor de Monedas                *
                *****************************************************
                
                     1) Peso Argentino       > Dólar Estadounidense
                     2) Peso Argentino       > Euro
                     3) Peso Argentino       > Real 
                     4) Dólar Estadounidense > Peso Argentino
                     5) Euro                 > Peso Argentino
                     6) Real                 > Peso Argentino
                
                     0) Salir
                ****************************************************
                """;

        while (opcion != 0) {
            try {


                System.out.println(menu);
                opcion = Integer.parseInt(lectura.nextLine());

                // Obtener fecha y hora actual
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);

                switch (opcion) {
                    case 1:
                        calculos.almacenarValores("ARS", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        graba.grabaLinea(respuestas);
                        break;
                    case 2:
                        calculos.almacenarValores("ARS", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        graba.grabaLinea(respuestas);
                        break;
                    case 3:
                        calculos.almacenarValores("ARS", "BRL");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        graba.grabaLinea(respuestas);
                        break;
                    case 4:
                        calculos.almacenarValores("USD", "ARS");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        graba.grabaLinea(respuestas);
                        break;
                    case 5:
                        calculos.almacenarValores("EUR", "ARS");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        graba.grabaLinea(respuestas);
                        break;
                    case 6:
                        calculos.almacenarValores("BRL3", "ARS");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        graba.grabaLinea(respuestas);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Ingrese una opción ");
                }


                System.out.println("\n\tPulse ENTER para continuar");
                lectura.nextLine();

            } catch (JsonSyntaxException | NullPointerException e) {
                System.out.println("Error. Ingrese solo códigos de moneda.");
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Ingrese un numero.");
            }
        }

        System.out.println("Gracias por usar el conversor");
    }
}