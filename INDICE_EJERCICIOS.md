# 📋 Índice de Ejercicios - Curso Java

## 🎯 Resumen de Ejercicios

Este documento proporciona una descripción detallada de cada ejercicio en el repositorio, incluyendo objetivos de aprendizaje, conceptos clave y ejemplos de uso.

---

## 📚 Ejercicio 1: Declaración e Inicialización de Variables

**Archivo:** `Ejercicio1.java`

### 🎯 Objetivo
Introducir los conceptos básicos de declaración e inicialización de variables en Java.

### 🔑 Conceptos Clave
- Declaración de variables (`int`, `String`)
- Inicialización en una línea vs. separada
- Tipos de datos primitivos vs. objetos
- Salida por consola con `System.out.println()`

### 💡 Ejemplo de Uso
```java
int edad = 47;           // Declaración e inicialización
String nombre;           // Solo declaración
nombre = "Ana Belén";   // Inicialización posterior
```

### 🚀 Cómo ejecutar
```bash
javac Ejercicio1.java
java Ejercicio1
```

---

## 🔄 Ejercicio 2: Intercambio con Variable Auxiliar

**Archivo:** `Ejercicio2.java`

### 🎯 Objetivo
Demostrar el intercambio de valores entre dos variables usando una variable auxiliar.

### 🔑 Conceptos Clave
- Algoritmo de intercambio clásico
- Uso de variable temporal
- Entrada de datos con `Scanner`
- Interacción con el usuario

### 💡 Algoritmo
```java
AUX = A;    // Guardar valor de A
A = B;      // Asignar B a A
B = AUX;    // Asignar valor guardado a B
```

### 🚀 Cómo ejecutar
```bash
javac Ejercicio2.java
java Ejercicio2
```

---

## 🧮 Ejercicio 3: Operaciones Aritméticas Básicas

**Archivo:** `Ejercicio3.java`

### 🎯 Objetivo
Implementar las cuatro operaciones aritméticas fundamentales con validación de división por cero.

### 🔑 Conceptos Clave
- Operadores aritméticos (`+`, `-`, `*`, `/`)
- Tipo de dato `float` para decimales
- Validación de condiciones (`if`)
- Manejo de errores básico

### 💡 Operaciones
- Suma: `numero1 + numero2`
- Resta: `numero1 - numero2`
- Multiplicación: `numero1 * numero2`
- División: `numero1 / numero2` (con validación)

### 🚀 Cómo ejecutar
```bash
javac Ejercicio3.java
java Ejercicio3
```

---

## ⚡ Ejercicio 4: Intercambio con XOR

**Archivo:** `Ejercicio4.java`

### 🎯 Objetivo
Demostrar intercambio de valores sin variable auxiliar usando operaciones XOR bit a bit.

### 🔑 Conceptos Clave
- Operaciones XOR (`^`)
- Intercambio sin variable temporal
- Operaciones bit a bit
- Algoritmos avanzados

### 💡 Algoritmo XOR
```java
num1 = num1 ^ num2;  // Paso 1
num2 = num1 ^ num2;  // Paso 2
num1 = num1 ^ num2;  // Paso 3
```

### 🚀 Cómo ejecutar
```bash
javac Ejercicio4.java
java Ejercicio4
```

---

## 👤 Ejercicio 5: Lectura y Muestra de Datos

**Archivo:** `Ejercicio5.java`

### 🎯 Objetivo
Practicar la lectura de diferentes tipos de datos y su presentación formateada.

### 🔑 Conceptos Clave
- Lectura de `String` con `nextLine()`
- Lectura de `int` con `nextInt()`
- Concatenación de strings
- Formateo de salida

### 💡 Tipos de Lectura
```java
String nombre = scanner.nextLine();  // Línea completa
int edad = scanner.nextInt();        // Número entero
```

### 🚀 Cómo ejecutar
```bash
javac Ejercicio5.java
java Ejercicio5
```

---

## ➕ Ejercicio 6: Suma de Dos Números

**Archivo:** `Ejercicio6.java`

### 🎯 Objetivo
Implementar una calculadora simple que sume dos números decimales.

### 🔑 Conceptos Clave
- Tipo de dato `double` para precisión decimal
- Operación aritmética básica
- Almacenamiento de resultados
- Entrada y salida numérica

### 💡 Características
- Manejo de números decimales
- Interfaz de usuario clara
- Resultado formateado

### 🚀 Cómo ejecutar
```bash
javac Ejercicio6.java
java Ejercicio6
```

---

## 🔢 Ejercicio 7: Expresiones Aritméticas con Tres Números

**Archivo:** `Ejercicio7.java`

### 🎯 Objetivo
Realizar múltiples operaciones aritméticas con tres números de entrada.

### 🔑 Conceptos Clave
- Operaciones con múltiples variables
- Reutilización de variables
- Suma, resta y multiplicación
- Manejo de tres entradas

### 💡 Operaciones Implementadas
- Suma: `num1 + num2 + num3`
- Resta: `num1 - num2 - num3`
- Multiplicación: `num1 * num2 * num3`

### 🚀 Cómo ejecutar
```bash
javac Ejercicio7.java
java Ejercicio7
```

---

## 🎓 Progresión de Aprendizaje

### Nivel Básico
1. **Ejercicio 1** - Variables básicas
2. **Ejercicio 5** - Entrada de datos
3. **Ejercicio 6** - Operaciones simples

### Nivel Intermedio
4. **Ejercicio 3** - Operaciones múltiples
5. **Ejercicio 7** - Múltiples variables

### Nivel Avanzado
6. **Ejercicio 2** - Algoritmos de intercambio
7. **Ejercicio 4** - Operaciones bit a bit

---

## 🛠️ Tecnologías y Herramientas

- **Java** - Lenguaje de programación
- **Scanner** - Para entrada de datos
- **IDE** - Eclipse, IntelliJ IDEA, o VS Code
- **Terminal** - Para compilación y ejecución

---

## 📝 Notas de Desarrollo

- Todos los ejercicios incluyen comentarios explicativos
- Se implementan buenas prácticas de programación
- Código limpio y bien documentado
- Manejo adecuado de recursos (cerrar Scanner)

---

*Este índice documenta el progreso de aprendizaje en Java durante el bootcamp. Cada ejercicio representa un paso más en el dominio de la programación.* 🚀
