# Practica 1: Sistema de pago para e-commerce
# Índice
# Práctica 1: Sistema de pago para e-commerce

# Índice
  1. [Introducción](#1-introduccion)
  2. [Estructura del Proyecto](#estructura-del-proyecto)
  3. [Código](#codigo)
  4. [Diagrama UML](#diagrama-uml)
  5. [Pruebas](#pruebas)


## 1. Introduccion
En esta práctica se ha desarrollado un sistema de pago para una tienda online de cursos de programación.  
El sistema permite realizar pagos mediante distintos métodos: Tarjeta de Crédito, PayPal y Bizum.

# Estructura del Proyecto
  ### Clases del proyecto
  
  - **MetodoPago**  
    Clase abstracta que define el método `procesarPago(double importe)`.  
    Sirve como clase base para los distintos métodos de pago.
  
  - **TarjetaCredito**  
    Hereda de `MetodoPago`.  
    Gestiona los pagos con tarjeta y valida el número y tipo de tarjeta.
  
  - **PayPal**  
    Hereda de `MetodoPago`.  
    Gestiona los pagos mediante cuenta de correo electrónico y comprueba el saldo disponible.
  
  - **Bizum**  
    Hereda de `MetodoPago`.  
    Permite realizar pagos mediante número de teléfono y validación de PIN.
  
  - **Tienda**  
    Contiene los métodos estáticos:
    - `iniciarPago()` → Permite al usuario elegir el método de pago y valida los datos.
    - `realizarPago()` → Procesa el pago utilizando polimorfismo.
  
  - **AppEcommerce**  
    Clase principal que ejecuta la aplicación llamando a:
    `Tienda.iniciarPago();`
    
# Código

# Diagrama UML

# Pruebas
