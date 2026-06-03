# Sistema de Gestión de Pedidos Comerciales

### PARTE 1

Este repositorio contiene el diseño e implementación de un sistema para la gestión de pedidos de una tienda. El proyecto ha sido desarrollado aplicando la Programación Orientada a Objetos (POO) y usando las herramientas de modelado UML.

## Metodología de Desarrollo

El ciclo de vida de este proyecto se estructuró en tres fases de sincronización de diseño y código:

1. Ingeniería Directa (Fase de Diseño): Creación del modelo conceptual inicial en StarUML y exportación automática del esqueleto de clases hacia archivos fuentes .java
2. Implementación y Refactorización: Ajuste manual del código autogenerado, corrección de errores...
3. Ingeniería Inversa (Fase de Evaluación): Se genera un nuevo diagrama UML usando PlantUML en VS Code.

## Arquitectura del Sistema (Estructura UML)

El sistema se compone de 5 clases principales interconectadas de forma óptima para mantener un bajo acoplamiento:

* `Cliente`: Clase contenedora que encapsula los datos del comprador (DNI, nombre, correo, dirección y categoría comercial).
* `Producto` (Clase Abstracta): Define la plantilla base del catálogo con atributos públicos comunes e impone el comportamiento polimórfico mediante el método abstracto `calcularPrecioFinal()`.
* `ProductoFisico` (Subclase): Hereda de `Producto`. Especialización encargada de controlar el inventario disponible (`stockDisponible`), restar unidades en compras autorizadas (`reducirStock`) y sumar gastos de transporte al importe base.
* `ProductoDigital` (Subclase): Hereda de `Producto`. Especialización orientada a la entrega de archivos, aplicando un 21% de IVA digital al precio base y simulando enlaces seguros de descarga.
* `Pedido`: Motor transaccional del sistema. Utiliza una relación de composición para gestionar una lista protegida de tipo `List<Producto>` y es la encargada de orquestar el flujo de la compra (`PENDIENTE` a `PAGADO`).

## Pilares de POO Aplicados

* Abstracción: Representación de entidades del mundo real dividiendo las lógicas de productos físicos y virtuales a través de una clase abstracta pura.
* Encapsulación: Protección absoluta del estado de los objetos. Todos los atributos del sistema se definen como privados (`-`) y la comunicación externa ocurre estrictamente a través de métodos de acceso público (`+` getters y setters).
* Herencia: Reutilización de código estructural extendiendo las propiedades de la clase padre `Producto` hacia sus dos variantes hijas.
* Polimorfismo: El método `calcularPrecioFinal()` se ejecuta de forma dinámica en tiempo de ejecución. Dependiendo del objeto que esté en el carrito, el sistema sabe si debe aplicar el algoritmo de peso/envío o la tasa impositiva del IVA digital.
