# ganaderos-casanare

Proyecto académico en Java orientado al manejo de un registro básico de reses usando un árbol binario de búsqueda (BST). Cada res se almacena por `código`, lo que permite insertar, buscar y modificar información de forma organizada dentro de la estructura del árbol.

## Autor

- Lee Chourio
- CC: 1118582019
- Ingeniería de Sistemas
- Semestre III

## Propósito del proyecto

Este proyecto aplica la estructura de datos `Binary Search Tree` a un caso sencillo del contexto ganadero. El árbol ordena las reses por su código y permite trabajar con datos como:

- `codigo`
- `raza`
- `peso`
- `edad`

La idea principal es demostrar cómo una estructura jerárquica facilita operaciones de consulta y organización de registros.

## Funcionalidades actuales

Según el código fuente actual, el sistema permite:

- Insertar una res nueva en el árbol.
- Consultar una res por código.
- Modificar la información de una res existente.
- Mostrar el recorrido `PreOrden`.
- Cargar un conjunto inicial de datos al iniciar el programa.

## Datos precargados

Al iniciar la aplicación se insertan estos registros de ejemplo:

| Código | Raza       | Peso (kg) | Edad (años) |
|--------|------------|-----------|-------------|
| 104    | Holstein   | 550.0     | 4           |
| 101    | Angus      | 620.5     | 6           |
| 110    | Brahman    | 480.0     | 3           |
| 99     | Hereford   | 510.0     | 5           |
| 106    | Simmental  | 700.2     | 2           |

## Estructura del proyecto

```text
src/main/java/
|- Main.java       -> menú principal y ejecución por consola
|- ArbolBST.java   -> lógica del árbol binario de búsqueda
|- NodoBST.java    -> definición de cada nodo del árbol
```

## Cómo funciona el árbol

- Si el `codigo` nuevo es menor que el nodo actual, se inserta a la izquierda.
- Si el `codigo` nuevo es mayor, se inserta a la derecha.
- Si el `codigo` ya existe, no se inserta un duplicado.

Esto mantiene el árbol ordenado por código y permite búsquedas recursivas sobre la estructura.

## Menú del programa

Al ejecutar el proyecto, se muestra un menú interactivo:

```text
1. Insertar res
2. Consultar res por código
3. Modificar res
4. Mostrar recorrido Pre-Orden
0. Salir
```

## Compilación y ejecución

El proyecto no usa Maven ni Gradle; se puede compilar directamente con `javac`.

### Compilar

```bash
javac src/main/java/*.java
```

### Ejecutar

```bash
java -cp . src.main.java.Main
```

## Ejemplo de uso

Un flujo básico de prueba puede ser:

1. Ejecutar el programa.
2. Elegir la opción `4` para ver el recorrido `PreOrden`.
3. Elegir la opción `2` para consultar una res por su código.
4. Elegir la opción `3` para modificar una res existente.

## Conceptos de estructuras de datos aplicados

Este proyecto permite practicar:

- Árboles binarios de búsqueda.
- Inserción recursiva.
- Búsqueda recursiva.
- Recorridos de árboles.
- Manejo de datos por consola en Java.

## Observaciones sobre el estado actual

- El recorrido implementado y accesible desde el menú es `PreOrden`.
- La modificación de datos se hace directamente sobre el nodo encontrado.
- No hay validación fuerte de entradas; si el usuario escribe un valor no numérico donde se espera un número, el programa puede lanzar una excepción.
- Los archivos `.class` están incluidos en el repositorio, aunque normalmente solo sería necesario versionar los `.java`.

## Posibles mejoras

- Agregar recorridos `InOrden` y `PostOrden`.
- Validar entradas del usuario antes de convertirlas a `int` o `double`.
- Mostrar también el `codigo` en el recorrido `PreOrden`.
- Implementar eliminación de nodos.
- Separar mejor la lógica del menú y la lógica del árbol.

## Contexto académico

El proyecto tiene sentido como práctica de clase para demostrar cómo una estructura BST puede adaptarse a un problema del mundo real, en este caso, el registro de ganado mediante identificadores únicos.
