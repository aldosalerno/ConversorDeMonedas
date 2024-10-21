

# Conversor de Monedas

## Descripción 

Este proyecto consiste en un Conversor de Monedas desarrollado en Java que permite realizar conversiones entre distintas divisas utilizando una API de tasas de cambio en tiempo real.

La aplicación realiza solicitudes a la API, analiza las respuestas en JSON, filtra las monedas de interés y presenta los resultados al usuario de forma clara y precisa.

Además, incluye un historial de conversiones que registra cada consulta con su correspondiente marca de tiempo, permitiendo al usuario revisar sus operaciones previas y saber en qué momento exacto fueron realizadas.

## Tecnologías Utilizadas 

- **Lenguaje de Programación:** Java
- **API de Tasas de Cambio:** Se utilizó una API de tasas de cambio en tiempo real para obtener las tasas de conversión entre diferentes divisas.
- **Biblioteca Gson:** Gson se empleó para analizar la respuesta JSON de la API y convertirla en objetos Java para su manipulación.
- **Control de Versiones:** Git/GitHub se usaron para el control de versiones del proyecto y la colaboración en equipo.
- **Entorno de Desarrollo Integrado (IDE):** IntelliJ IDEA fue el entorno de desarrollo utilizado para escribir, depurar y ejecutar el código Java.

## Clases y Funcionalidades 


### Principal.java

Desde esta clase se inicia el funcionamiento del conversor. 
Aquí se maneja la interacción con el usuario a través de la consola, mostrando un menú de opciones y gestionando las conversiones de moneda.


### Conversion.java

Esta clase es responsable de manejar la lógica de las conversiones de moneda. 
Se definen métodos para almacenar valores de moneda, realizar conversiones y obtener mensajes de respuesta.

### Consulta.java

Realiza consultas a una API externa para obtener las tasas de cambio entre diferentes monedas.

### GrabaLog.java

Almacena el historial de conversiones realizadas en un archivo de texto.

## Desarrollado por
- Aldo Salerno
