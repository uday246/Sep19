package Sep5th;

import java.util.Scanner;

public class ColegioPerros {

public static void mostrarMenu() {
System.out.println("\n\n\n"
+ "----------Sistema Para Escuela de Perros---------------\n"
+ "0. Salir del programa\n"
+ "1. Ingresar un perro nuevo.\n"
+ "2. Imprimir reporte de perros por orden de codigo.\n"
+ "3. Imprimir reporte de perros por localidad.");

System.out.println("Digite un opción, (cero para salir).");
}

public static void inicializarPerros (Perros lista[]) {
// ( nombre, raza, localidad, diaAsiste, cedulaDueño, nombreDueño, telefono)
{
lista[0] = new Perros("Tyler", "Golden Retriever", 2, 1, 19079288, "Carlos Rocha", "3102177444");
lista[1] = new Perros("Khalifa", "Border Collie", 3, 6, 52997632, "Laura Quintana", "3016643521");
lista[2] = new Perros("Thor", "Labrador", 2, 1, 52152152, "Camilo Casas", "3152665772");
lista[3] = new Perros("Bella", "Criollo", 1, 4, 41607122, "Lilia Perez", "3102665769");
lista[4] = new Perros("Nina", "Mini Pooddle", 3, 2, 54876230, "Alejandra Ortiz", "3164228973");
lista[5] = new Perros("Pipo", "Cocker Spaniel", 4, 7, 82765297, "Oscar Mora", "3126678723");
lista[6] = new Perros("Shelby", "Basset Hound", 3, 3, 10332546, "Ricardo Sanchez", "3112118967");
lista[7] = new Perros("Tabitha", "Boxer", 2, 1, 80889654, "Carlos Jimenez", "3208786543");
lista[8] = new Perros("Fanny", "Shih Tzu", 3, 2, 20982357, "Maria Salas", "3012453687");
lista[9] = new Perros("Mike", "Criollo", 1, 3, 42776453, "Marina Porras", "3105667423");
lista[10] = new Perros("Sheila", "Doberman", 4, 4, 80907981, "Jason Gonzalez", "30");
lista[11] = new Perros("Hunter", "Pastor Aleman", 2, 2, 58765418, "Jeniffer Fonseca", "31");
System.out.println("total de perros por el momento: " + lista[0].getContadorPerros());
}
}

public static void main(String[] args) {
double opcionMenuPrincipal = 0; //menu principal
Scanner digitadoPorTeclado = new Scanner(System.in);
Perros listaPerro[] = new Perros[50];
inicializarPerros(listaPerro);

//cargar la informacion desde la clase ColegioPerros y mandarla a la clase Perros.
String nombrePerroAux = ""; // nombre del perro
String razaAux = "";
double localidadAux = 0; // 1=Teusaquillo, 2=Suba, 3=Usaquen y 4=Chapinero.
double diaAsisteAux = 0;// 1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.
double cedulaDue�oAux = 0; // numero de identificacion del dueño del perro
String nombreDue�oAux = ""; // nombre del cliente
String telefonoAux = ""; // numero de del cliente
  
//----------------------------------------------------------

do {
mostrarMenu();

opcionMenuPrincipal = (int)digitadoPorTeclado.nextDouble();
switch ((int)opcionMenuPrincipal) {
case 0:
System.out.println("Programa terminado con éxito. \n\n");
break;
case 1:
  

  
System.out.println("Por favor digite el nombre del perro SIN ESPACIOS:");
nombrePerroAux = digitadoPorTeclado.next();
System.out.println("Digite la raza del perro SIN ESPACIOS:");
razaAux = digitadoPorTeclado.next();
  
do { // Para evitar opciones que no existen,

System.out.println("Digite un numero para la localidad de 1 a 4 (1=Teusaquillo, 2=Suba, 3=Usaquen y 4=Chapinero.):");
localidadAux = (int)digitadoPorTeclado.nextDouble();
}while( (localidadAux>=1 && localidadAux<=4)==false );
  
do {
  
System.out.println("Digite el día de asistencia en numero de 1 a 7 (1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.):");
diaAsisteAux = (int)digitadoPorTeclado.nextDouble();
}while( (diaAsisteAux>=1 && diaAsisteAux<=7)==false );
  
System.out.println("Digite el nombre del dueño del perro Sin Espacios:");
nombreDue�oAux = digitadoPorTeclado.next();   
System.out.println("Digite el teléfono de contacto SIN ESPACIOS:");
telefonoAux = digitadoPorTeclado.next();
System.out.println("Digite la cedula del dueño SIN ESPACIOS:");
cedulaDue�oAux = (int)digitadoPorTeclado.nextDouble();
  
  
if (listaPerro[0] != null) {
//si existe previamente una lista, coloca el perro nuevo al final de la lista con su codigo
listaPerro[listaPerro[0].getContadorPerros()] = new Perros(nombrePerroAux, razaAux, localidadAux, diaAsisteAux, cedulaDue�oAux, nombreDue�oAux, telefonoAux);
} else {
//Si no existe una lista de perros, aqui creo el perro No. 0 que encabeza la lista
listaPerro[0] = new Perros(nombrePerroAux, razaAux, localidadAux, diaAsisteAux, cedulaDue�oAux, nombreDue�oAux, telefonoAux);
}
break;
case 2:
if (listaPerro[0] != null) {
listaPerro[0].imprimirPerros(listaPerro, listaPerro[0].getContadorPerros());
} else {
System.out.println("Por favor crear al menos un perro antes de indicar esta opcion.");
}
break;
case 3:
if (listaPerro[0] != null) {
listaPerro[0].imprimirPerrosLocalidad(listaPerro, listaPerro[0].getContadorPerros());
} else {
System.out.println("Por favor crear al menos un perro antes de indicar esta opcion.");
}
break;
default:
System.out.println("Selecciono una opcion que no esta disponible.\n\n");
break;
}

} while (opcionMenuPrincipal != 0);
}

}