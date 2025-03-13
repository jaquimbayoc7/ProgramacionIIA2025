import java.util.Scanner;

public class SistemaInventario {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //declaracion de constante de productos
        final int MAX_PRODUCTOS=20;

        //declaracion de variables de control del ejercicio
        int opcion=0;
        int contadorProductos=0;

        //Arreglos para guardar información de productos
        String [] codigos = new String[MAX_PRODUCTOS];
        String [] nombres = new String[MAX_PRODUCTOS];
        double [] precios = new double[MAX_PRODUCTOS];
        int [] cantidades = new int[MAX_PRODUCTOS];
        int [] categorias = new int [MAX_PRODUCTOS];

        //Variable auxiliares para procesos
        String codigo="";
        String nombre="";
        String busqueda="";
        String nombreCategoria="";

        double precio=0;
        double valorTotal=0;
        double valorProducto=0;

        int cantidad=0;
        int categoria=0;
        int indice=0;
        int cantidadActualizar=0;

        boolean encontrado;

        //Construir el menú do--while
        do{
            System.out.println("\n=========SISTEMA DE INVENTARIO==========");
            System.out.println("1. Agregar producto\n" +
                    "2. Buscar Producto\n" +
                    "3. Listar Productos\n" +
                    "4. Actualizar Stock\n" +
                    "5. Calcular el valor del inventario\n" +
                    "6. Salir");
            opcion = leer.nextInt();//captura la opción a escoger
            leer.nextLine(); //limpiar la selección de la librería.
                switch (opcion){
                    case 1://Agregar Producto
                        if(contadorProductos < MAX_PRODUCTOS){
                            System.out.println("\n --- AGREGAR PRODUCTO ---");
                            //Solicitar el código y verificar si existe o no
                            System.out.println("Ingrese el código del producto");
                            codigo = leer.nextLine();
                            //Validar si el código existe en el arreglo
                            encontrado = false;
                            for (int i = 0; i < contadorProductos; i++) {
                                if(codigos[i].equals(codigo)){
                                    encontrado = true;
                                    break;
                                }
                            }
                            if(encontrado){
                                System.out.println("Error! el código ya existe en el inventario");
                            }else{
                                //Resto de datos para guardar
                                System.out.println("Ingrese el nombre del producto:  ");
                                nombre = leer.nextLine();
                                System.out.println("Ingrese el precio del producto ");
                                precio = leer.nextDouble();
                                //validar que el precio no sea cero
                                if(precio <=0 ){
                                    System.out.println("Error¡ El precio del producto no puede ser menor a cero");
                                    leer.nextLine();
                                    break;
                                }
                                System.out.println("Ingrese la cantidad del producto en el stock :");
                                cantidad = leer.nextInt();
                                //validar la cantidad no sea negativa
                                if(cantidad < 0){
                                    System.out.println("Error¡ la cantidad no puede ser negativa");
                                    leer.nextLine();
                                    break;
                                }
                                System.out.println("Categorías disponibles: ");
                                System.out.println("1. Alimentos\n" +
                                        "2. Limpieza\n" +
                                        "3. Electrónica");
                                System.out.println("Seleccione categoría (1-3): ");
                                categoria = leer.nextInt();
                                leer.nextLine();
                                //validar que el usuario digite entre 1 a 3
                                if(categoria <1 || categoria>3){
                                    System.out.println("Error! Categoría Inválida");
                                    break;
                                }
                                //Guardar los datos en los arreglos
                                codigos[contadorProductos] = codigo;
                                nombres[contadorProductos] = nombre;
                                precios[contadorProductos] = precio;
                                cantidades[contadorProductos]=cantidad;
                                categorias[contadorProductos]= categoria;

                                //Aumentamos el ciclo
                                contadorProductos++;
                                System.out.println("Producto agregado exitosamente!!!");
                            }
                        }else{
                            System.out.println("El inventario esta lleno (máximo: "+MAX_PRODUCTOS+"productos).");
                        }
                        break;

                    case 2:
                        //Buscar producto
                        if(contadorProductos == 0){
                            System.out.println("No hay Productos en el inventario.");
                            break;
                        }
                        System.out.println("\n ------BUSCAR PRODUCTO -----");
                        System.out.println("1. Buscar por código\n" +
                                "2. Buscar por nombre\n" +
                                "Seleccione una opción: ");
                        int opcionBusqueda = leer.nextInt();
                        leer.nextLine();
                        if(opcionBusqueda <1 || opcionBusqueda>2){
                            System.out.println("Error! Opción Inválida");
                            break;
                        }
                        if(opcionBusqueda == 1){
                            System.out.println("Digite el código a buscar");
                            busqueda = leer.nextLine();
                            encontrado = false;
                            for (int i = 0; i < contadorProductos; i++) {
                                if(codigos[i].equals(busqueda)){
                                    //determinar el nombre de la categoria
                                    switch (categorias[i]){
                                        case 1: nombreCategoria = "Alimentos";
                                        break;
                                        case 2: nombreCategoria = "Limpieza";
                                        break;
                                        case 3: nombreCategoria = "Electrónica";
                                        break;
                                        default: nombreCategoria = "Desconocida";
                                        break;
                                    }
                                    //Mostrar detalles de producto
                                    System.out.println("\n DETALLES DEL PRODUCTO");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "CÓDIGO","NOMBRE","PRECIO", "STOCK", "CATEGORIA");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.printf("%-10s %-20s %-9.2f %-10d %-10s\n", codigos[i],nombres[i],precios[i], cantidades[i], categorias[i]);
                                    encontrado=true;
                                    break;
                                }
                            }
                            if(!encontrado){
                                System.out.println("Producto no encontrado!");
                            }
                        }else if(opcionBusqueda==2){
                            System.out.println("Ingres el nombre a buscar");
                            busqueda = leer.nextLine().toLowerCase();
                            encontrado=false;
                            for (int i = 0; i < contadorProductos; i++) {
                                if (nombres[i].toLowerCase().contains(busqueda)) {
                                    if(!encontrado){
                                        System.out.println("\n RESULTADOS DE LA  BUSQUEDA");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "CÓDIGO","NOMBRE","PRECIO", "STOCK", "CATEGORIA");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        encontrado = true;
                                    }
                                    switch (categorias[i]){
                                        case 1: nombreCategoria = "Alimentos";
                                            break;
                                        case 2: nombreCategoria = "Limpieza";
                                            break;
                                        case 3: nombreCategoria = "Electrónica";
                                            break;
                                        default: nombreCategoria = "Desconocida";

                                    }
                                    System.out.printf("%-10s %-20s %-9.2f %-10d %-10s\n", codigos[i],nombres[i],precios[i], cantidades[i], categorias[i]);
                                }
                            }
                            if(!encontrado) {
                                System.out.println("Producto no encontrado!");
                                }
                            }else{
                                System.out.println("Opción Incorrecta!");
                            }
                            break;
                        }


        }while(opcion!=6);




    }
}
