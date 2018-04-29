[![Pipelines CI](https://img.shields.io/bitbucket/pipelines/nubeclick/posnubeclick/develop.svg)](https://bitbucket.org/nubeclick/posnubeclick/addon/pipelines/home#!/)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1d504cf174df424c9e6f645bfce890cf)](https://www.codacy.com?utm_source=git@bitbucket.org&amp;utm_medium=referral&amp;utm_content=nubeclick/posnubeclick&amp;utm_campaign=Badge_Grade)

# POSNubeClick

## Propósito del sistema.

Se trata de un sistema de ventas genérico que puede ser adaptable a cualquier tipo de negocio donde las ventas sean al mostrador, que manejara:


1.  Roles
2. Usuarios.
3. Proveedores.
4. Depósitos.
5. Inventario.
6. Compras.
7. Vendedores.
8. Clientes.
9. Ventas.
10. Movimientos (inventario Cargos-Descargos traslado, ventas CxC, compras CxP, Gastos).
11. Configuración (directorio de datos y formatos, propiedades de conexión, creación de usuarios, vendedores, depósitos).
12. Reportes (inventario, compra, ventas, vendedores, gatos, sueldos o pagos).

Pendiente por analizar: Impuestos, CxC, CxP.\

 
2. Funciones del sistema.

En todos los módulos del sistema se realizaran operaciones CRUD.

2.1. Roles.

Desde el menú de configuración, permitirá crear y asignar el nivel del rol, el cual habilitara los accesos al sistema según el nivel a los usuarios.

2.2 Usuarios.

Sera accesible desde el menú de configuración. Al crear o modificar usuarios se debe parametrizar los niveles acceso a las distintas prestaciones del sistema (rol).

2.3 Proveedores.

Sera accesible desde el menú principal, en él se podrá especificar los convenios con los proveedores, tales como días de crédito y límite de crédito.

2.4 Depósitos.

Disponible a través del menú de configuración, servirá para especificar cuantos depósitos se dispone.

2.5 Inventario.

Disponible en el menú principal, al crear los productos de inventario se debe especificar en qué deposito se almacenaran.

**Solo permitira modificar y eliminar movimientos al usuario que cumpla con los permisos

necesarios.

2.6 Compras.

Accesible desde el menú principal, procesara las compras de mercancía.

2.7 Vendedores.

Disponible desde menú de configuración, permite la creación de vendedores, se puede especificar los sueldos y comisiones de los vendedores.

2.8 Clientes.

Disponible desde el menú principal, en él se podrá especificar los convenios con los clientes, tales como días de crédito y límite de crédito.

2.9 Ventas.

Disponible desde el menú principal, realiza la venta de productos, especificando el vendedor, el cliente, el depósito con el que se trabajara y especificar los productos a agregar.

2.10 Movimientos.

Accesible desde el menú principal, en este módulo se manejaran varias opciones:

a. Movimientos Inventario:

Cargos-Descargos traslado entre depósitos.

b. Ventas:

Cortes de ventas (Cierre de jornada, corte de caja).

Cuentas por cobrar.

Reimpresión de movimientos.

c. Compras:

Cuentas por pagar.


Reimpresión de movimientos.

d. Gastos:

Pagos por gastos (compra insumos internos, pago servicios).

Pagos de sueldos y comisiones.

2.11 Configuración.

Accesible desde la barra de herramientas en la pantalla principal para los usuarios que cumplan con los permisos necesarios, desde aquí se configuraran y crearan los parámetros básicos para el funcionamiento del sistema. Estos parámetros son:

a. Propiedades de conexión.

b. Directorio de datos y formatos.

c. Creación de usuarios.

d. Vendedores.

e. Depósitos.

**Solo permitira modificar y eliminar movimientos al usuario que cumpla con los permisos

necesarios.

2.12 Reportes.

Accesible desde el menú principal, para los usuarios que cumplan con los permisos necesarios, estará disponible reportes de:

a. Ventas: cortes de caja.

b. Compra.

c. Inventario.

d. Vendedores.

e. Gastos y sueldos.

