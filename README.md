Crea una función llamada `morse()` que reciba una cadena de texto y la devuelva convertida a su representación en [código morse](https://es.wikipedia.org/wiki/Código_morse).

## Requisitos

- Desde el programa principal, pide al usuario una frase completa, usa la función para traducirla a morse y muestra el resultado. 
- El programa sólo acabará cuando el usuario escriba literalmente `**STOP**`.
- Usa `StringBuilder` para concatenar el texto de forma eficiente.

## Concatenar texto con StringBuilder

Cuando necesitemos unir varias cadenas entre sí en un bucle, en lugar de utilizar el operador `+`:

```java
String s = "Hola";
s += " mundo"; 
```

Por razones de eficiencia deberíamos usar `StringBuilder`, como en este ejemplo:

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

StringBuilder resultado = new StringBuilder();

// Leer una línea
System.out.print("Escribe: ");
String texto = br.readLine();

while (!texto.isEmpty()) { // ¿Cadena vacía? ("")

    // Añadirla al StringBuilder
    resultado.append(texto);
    resultado.append("\n");

    // Leer más líneas
    System.out.print("Escribe: ");
    texto = br.readLine();
}

// Mostrar el resultado
System.out.println("---------");
System.out.print(resultado);
System.out.println("---------");
```
