public class CicloForEach {
    public static void main(String[] args) {
        /*
        Funciona para recorrer: Arrays, Listas o Mapas
        SINTAXIS:
        for (tipo variable : array)
            {
                declaraciones usando variables;
            }
         */

//        int []a = new int[]{1,2,3,4,5,6,7,8,9,10};
//        for(int i : a) {
//            System.out.println(i);
//        }

        String nombres[] = new String[]{"Jose","Carlos","Patricia","Manuel"};
        for(String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
