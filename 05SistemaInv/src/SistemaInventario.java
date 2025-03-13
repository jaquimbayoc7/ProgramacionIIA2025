import java.util.Scanner;

public class SistemaInventario {
        public static void main(String[] args) {
            // Declaración de constantes
            final int MAX_PRODUCTOS = 20;

            // Declaración de variables
            Scanner entrada = new Scanner(System.in);
            int opcion;
            int contadorProductos = 0;

            // Arreglos paralelos para almacenar la información de los productos
            String[] codigos = new String[MAX_PRODUCTOS];
            String[] nombres = new String[MAX_PRODUCTOS];
            double[] precios = new double[MAX_PRODUCTOS];
            int[] cantidades = new int[MAX_PRODUCTOS];
            int[] categorias = new int[MAX_PRODUCTOS];

            // Variables auxiliares
            String codigo, nombre, busqueda, nombreCategoria;
            double precio, valorTotal, valorProducto;
            int cantidad, categoria, indice, cantidadActualizar;
            boolean encontrado;

            // Inicio del programa con estructura do-while para el menú
            do {
                // Mostrar menú
                System.out.println("\n===== SISTEMA DE INVENTARIO =====");
                System.out.println("1. Agregar producto");
                System.out.println("2. Buscar producto");
                System.out.println("3. Listar productos");
                System.out.println("4. Actualizar stock");
                System.out.println("5. Calcular valor del inventario");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = entrada.nextInt();
                entrada.nextLine(); // Limpiar buffer

                // Estructura switch para las opciones del menú
                switch (opcion) {
                    case 1: // Agregar producto
                        if (contadorProductos < MAX_PRODUCTOS) {
                            System.out.println("\n--- AGREGAR PRODUCTO ---");

                            // Solicitar código y verificar que no exista
                            System.out.print("Ingrese código del producto: ");
                            codigo = entrada.nextLine();

                            // Verificar si el código ya existe
                            encontrado = false;
                            for (int i = 0; i < contadorProductos; i++) {
                                if (codigos[i].equals(codigo)) {
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado) {
                                System.out.println("¡Error! El código ya existe en el inventario.");
                            } else {
                                // Solicitar resto de datos
                                System.out.print("Ingrese nombre del producto: ");
                                nombre = entrada.nextLine();

                                System.out.print("Ingrese precio del producto: ");
                                precio = entrada.nextDouble();

                                // Validar precio positivo
                                if (precio <= 0) {
                                    System.out.println("¡Error! El precio debe ser mayor que cero.");
                                    entrada.nextLine(); // Limpiar buffer
                                    break;
                                }

                                System.out.print("Ingrese cantidad en stock: ");
                                cantidad = entrada.nextInt();

                                // Validar cantidad no negativa
                                if (cantidad < 0) {
                                    System.out.println("¡Error! La cantidad no puede ser negativa.");
                                    entrada.nextLine(); // Limpiar buffer
                                    break;
                                }

                                System.out.println("Categorías disponibles:");
                                System.out.println("1. Alimentos");
                                System.out.println("2. Limpieza");
                                System.out.println("3. Electrónica");
                                System.out.print("Seleccione categoría (1-3): ");
                                categoria = entrada.nextInt();
                                entrada.nextLine(); // Limpiar buffer

                                // Validar categoría válida
                                if (categoria < 1 || categoria > 3) {
                                    System.out.println("¡Error! Categoría inválida.");
                                    break;
                                }

                                // Guardar los datos en los arreglos
                                codigos[contadorProductos] = codigo;
                                nombres[contadorProductos] = nombre;
                                precios[contadorProductos] = precio;
                                cantidades[contadorProductos] = cantidad;
                                categorias[contadorProductos] = categoria;

                                contadorProductos++;
                                System.out.println("Producto agregado exitosamente.");
                            }
                        } else {
                            System.out.println("¡Error! El inventario está lleno (máximo " + MAX_PRODUCTOS + " productos).");
                        }
                        break;

                    case 2: // Buscar producto
                        if (contadorProductos == 0) {
                            System.out.println("No hay productos en el inventario.");
                            break;
                        }

                        System.out.println("\n--- BUSCAR PRODUCTO ---");
                        System.out.println("1. Buscar por código");
                        System.out.println("2. Buscar por nombre");
                        System.out.print("Seleccione una opción: ");
                        int opcionBusqueda = entrada.nextInt();
                        entrada.nextLine(); // Limpiar buffer

                        if (opcionBusqueda == 1) {
                            System.out.print("Ingrese el código a buscar: ");
                            busqueda = entrada.nextLine();

                            encontrado = false;
                            for (int i = 0; i < contadorProductos; i++) {
                                if (codigos[i].equals(busqueda)) {
                                    // Determinar nombre de categoría
                                    switch (categorias[i]) {
                                        case 1: nombreCategoria = "Alimentos"; break;
                                        case 2: nombreCategoria = "Limpieza"; break;
                                        case 3: nombreCategoria = "Electrónica"; break;
                                        default: nombreCategoria = "Desconocida";
                                    }

                                    // Mostrar detalles del producto
                                    System.out.println("\nDETALLES DEL PRODUCTO");
                                    System.out.println("--------------------------------------------------------------------");
                                    System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "PRECIO", "STOCK", "CATEGORÍA");
                                    System.out.println("--------------------------------------------------------------------");
                                    System.out.printf("%-10s %-20s $%-9.2f %-10d %-10s\n",
                                            codigos[i], nombres[i], precios[i], cantidades[i], nombreCategoria);

                                    encontrado = true;
                                    break;
                                }
                            }

                            if (!encontrado) {
                                System.out.println("Producto no encontrado.");
                            }
                        } else if (opcionBusqueda == 2) {
                            System.out.print("Ingrese el nombre a buscar: ");
                            busqueda = entrada.nextLine().toLowerCase();

                            encontrado = false;
                            for (int i = 0; i < contadorProductos; i++) {
                                if (nombres[i].toLowerCase().contains(busqueda)) {
                                    if (!encontrado) {
                                        System.out.println("\nRESULTADOS DE LA BÚSQUEDA");
                                        System.out.println("--------------------------------------------------------------------");
                                        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "PRECIO", "STOCK", "CATEGORÍA");
                                        System.out.println("--------------------------------------------------------------------");
                                        encontrado = true;
                                    }

                                    // Determinar nombre de categoría
                                    switch (categorias[i]) {
                                        case 1: nombreCategoria = "Alimentos"; break;
                                        case 2: nombreCategoria = "Limpieza"; break;
                                        case 3: nombreCategoria = "Electrónica"; break;
                                        default: nombreCategoria = "Desconocida";
                                    }

                                    System.out.printf("%-10s %-20s $%-9.2f %-10d %-10s\n",
                                            codigos[i], nombres[i], precios[i], cantidades[i], nombreCategoria);
                                }
                            }

                            if (!encontrado) {
                                System.out.println("Producto no encontrado.");
                            }
                        } else {
                            System.out.println("Opción inválida.");
                        }
                        break;

                    case 3: // Listar productos
                        if (contadorProductos == 0) {
                            System.out.println("No hay productos en el inventario.");
                            break;
                        }

                        System.out.println("\n--- LISTAR PRODUCTOS ---");
                        System.out.println("1. Listar todos los productos");
                        System.out.println("2. Filtrar por categoría");
                        System.out.print("Seleccione una opción: ");
                        int opcionListado = entrada.nextInt();
                        entrada.nextLine(); // Limpiar buffer

                        if (opcionListado == 1) {
                            System.out.println("\nLISTADO COMPLETO DE PRODUCTOS");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "PRECIO", "STOCK", "CATEGORÍA");
                            System.out.println("--------------------------------------------------------------------");

                            for (int i = 0; i < contadorProductos; i++) {
                                // Determinar nombre de categoría
                                switch (categorias[i]) {
                                    case 1: nombreCategoria = "Alimentos"; break;
                                    case 2: nombreCategoria = "Limpieza"; break;
                                    case 3: nombreCategoria = "Electrónica"; break;
                                    default: nombreCategoria = "Desconocida";
                                }

                                System.out.printf("%-10s %-20s $%-9.2f %-10d %-10s\n",
                                        codigos[i], nombres[i], precios[i], cantidades[i], nombreCategoria);
                            }
                        } else if (opcionListado == 2) {
                            System.out.println("Categorías disponibles:");
                            System.out.println("1. Alimentos");
                            System.out.println("2. Limpieza");
                            System.out.println("3. Electrónica");
                            System.out.print("Seleccione categoría (1-3): ");
                            int categoriaFiltro = entrada.nextInt();
                            entrada.nextLine(); // Limpiar buffer

                            if (categoriaFiltro < 1 || categoriaFiltro > 3) {
                                System.out.println("Categoría inválida.");
                                break;
                            }

                            // Determinar nombre de categoría para el encabezado
                            switch (categoriaFiltro) {
                                case 1: nombreCategoria = "Alimentos"; break;
                                case 2: nombreCategoria = "Limpieza"; break;
                                case 3: nombreCategoria = "Electrónica"; break;
                                default: nombreCategoria = "Desconocida";
                            }

                            System.out.println("\nPRODUCTOS DE LA CATEGORÍA " + nombreCategoria);
                            System.out.println("--------------------------------------------------------------------");
                            System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "PRECIO", "STOCK", "CATEGORÍA");
                            System.out.println("--------------------------------------------------------------------");

                            encontrado = false;
                            for (int i = 0; i < contadorProductos; i++) {
                                if (categorias[i] == categoriaFiltro) {
                                    System.out.printf("%-10s %-20s $%-9.2f %-10d %-10s\n",
                                            codigos[i], nombres[i], precios[i], cantidades[i], nombreCategoria);
                                    encontrado = true;
                                }
                            }

                            if (!encontrado) {
                                System.out.println("No hay productos en esta categoría.");
                            }
                        } else {
                            System.out.println("Opción inválida.");
                        }
                        break;

                    case 4: // Actualizar stock
                        if (contadorProductos == 0) {
                            System.out.println("No hay productos en el inventario.");
                            break;
                        }

                        System.out.println("\n--- ACTUALIZAR STOCK ---");
                        System.out.print("Ingrese el código del producto: ");
                        codigo = entrada.nextLine();

                        encontrado = false;
                        indice = -1;

                        for (int i = 0; i < contadorProductos; i++) {
                            if (codigos[i].equals(codigo)) {
                                encontrado = true;
                                indice = i;
                                break;
                            }
                        }

                        if (encontrado) {
                            System.out.println("Producto encontrado: " + nombres[indice]);
                            System.out.println("Stock actual: " + cantidades[indice]);

                            System.out.println("1. Aumentar stock");
                            System.out.println("2. Disminuir stock");
                            System.out.print("Seleccione operación: ");
                            int operacion = entrada.nextInt();
                            entrada.nextLine(); // Limpiar buffer

                            if (operacion == 1) {
                                System.out.print("Ingrese cantidad a agregar: ");
                                cantidadActualizar = entrada.nextInt();
                                entrada.nextLine(); // Limpiar buffer

                                if (cantidadActualizar < 0) {
                                    System.out.println("La cantidad debe ser positiva.");
                                } else {
                                    cantidades[indice] += cantidadActualizar;
                                    System.out.println("Stock actualizado. Nuevo stock: " + cantidades[indice]);
                                }
                            } else if (operacion == 2) {
                                System.out.print("Ingrese cantidad a retirar: ");
                                cantidadActualizar = entrada.nextInt();
                                entrada.nextLine(); // Limpiar buffer

                                if (cantidadActualizar < 0) {
                                    System.out.println("La cantidad debe ser positiva.");
                                } else if (cantidadActualizar > cantidades[indice]) {
                                    System.out.println("Error: No hay suficiente stock disponible.");
                                } else {
                                    cantidades[indice] -= cantidadActualizar;
                                    System.out.println("Stock actualizado. Nuevo stock: " + cantidades[indice]);
                                }
                            } else {
                                System.out.println("Operación inválida.");
                            }
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                        break;

                    case 5: // Calcular valor del inventario
                        if (contadorProductos == 0) {
                            System.out.println("No hay productos en el inventario.");
                            break;
                        }

                        System.out.println("\n--- VALOR DEL INVENTARIO ---");
                        valorTotal = 0;

                        for (int i = 0; i < contadorProductos; i++) {
                            valorProducto = precios[i] * cantidades[i];
                            valorTotal += valorProducto;
                            System.out.printf("%s - %s: %d unidades x $%.2f = $%.2f\n",
                                    codigos[i], nombres[i], cantidades[i], precios[i], valorProducto);
                        }

                        System.out.printf("\nVALOR TOTAL DEL INVENTARIO: $%.2f\n", valorTotal);
                        break;

                    case 6: // Salir
                        System.out.println("Gracias por usar el Sistema de Inventario. ¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }

                // Pausa para que el usuario pueda leer los resultados (excepto al salir)
                if (opcion != 6) {
                    System.out.print("\nPresione ENTER para continuar...");
                    entrada.nextLine();
                }

            } while (opcion != 6);

            // Cerrar el scanner
            entrada.close();
        }
    }

