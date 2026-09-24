# Polymorphism Lab

Proyecto académico desarrollado en **Java** con el objetivo de aplicar y comprender el concepto de **polimorfismo en Programación Orientada a Objetos (POO)**.

## Descripción

El proyecto implementa diferentes figuras geométricas utilizando una clase abstracta llamada `Figure`.

Cada figura hereda de esta clase e implementa su propio comportamiento para calcular:

* Área
* Perímetro

Las figuras implementadas son:

* `Circle` — Círculo
* `Square` — Cuadrado
* `Triangle` — Triángulo

## Polimorfismo

La clase abstracta `Figure` define los métodos:

```java
public abstract double calculateArea();
public abstract double calculatePerimeter();
```

Las clases `Circle`, `Square` y `Triangle` sobrescriben estos métodos utilizando `@Override`.

En la clase `Main` se utiliza una colección de objetos de tipo `Figure`:

```java
List<Figure> figures = new ArrayList<>();
```

Esto permite almacenar diferentes tipos de figuras y ejecutar los mismos métodos:

```java
for (Figure fig : figures) {
    System.out.println("Area: " + fig.calculateArea());
    System.out.println("Perimeter: " + fig.calculatePerimeter());
}
```

Java determina en tiempo de ejecución qué implementación debe utilizar dependiendo del objeto almacenado, demostrando así el uso del **polimorfismo**.

## Estructura del proyecto

```text
polymorphism-lab
│
├── pom.xml
│
└── src
    ├── main
    │   └── java
    │       └── co.edu.unicauca.polymorphismlab
    │           ├── app
    │           │   └── Main.java
    │           │
    │           └── model
    │               ├── Figure.java
    │               ├── Circle.java
    │               ├── Square.java
    │               └── Triangle.java
    │
    └── test
        └── java
            └── co.edu.unicauca.polymorphismlab.model
                ├── CircleTest.java
                ├── SquareTest.java
                └── TriangleTest.java
```

## Tecnologías utilizadas

* Java 17
* Maven
* JUnit
* Programación Orientada a Objetos

## Conceptos aplicados

* Abstracción
* Herencia
* Polimorfismo
* Sobrescritura de métodos
* Clases abstractas
* Colecciones en Java
* Pruebas unitarias

## Ejecución

Clonar el repositorio:

```bash
git clone https://github.com/britneybenitez-gif/polymorphism-lab.git
```

Ingresar al proyecto:

```bash
cd polymorphism-lab
```

Compilar el proyecto:

```bash
mvn compile
```

Ejecutar las pruebas:

```bash
mvn test
```

## Autor

**Britney Benítez**

Trabajo académico presentado como ejercicio de aplicación de **polimorfismo y Programación Orientada a Objetos en Java**.

**Universidad del Cauca**
