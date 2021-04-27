package lesson3;

public class home3 {
    public static void main(String[] args) {
        // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        //int[] arg = new int[ 8 ];
        int[] arg = { 1,1,0,0,1,1,0,0 };

        for (int i = 0; i < arg.length; i++){
            arg[i] = (arg[i] +1) % 2;
            //0011
            //1100
        }
        for (int i = 0; i < arg.length; i++){
            System.out.print(arg[i]+ " ");
           }
        System.out.println(" ");


//Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] array1 = new int[ 100 ];
        int maxMass = array1.length;
        for(int i = 0; i < maxMass; i++)
        {
            array1[ i ] = i + 1;
        }
        for(int i = 0; i < maxMass; i++)
        {
            System.out.print (i + "-" + array1[i]+" ");
        }
System.out.println(" ");

//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] mas ={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;

        for(int i = 0; i < maxMas; i++){
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++) {
            System.out.print(i + "-" + mas[i] + " ");
        }
        System.out.println(" ");


//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int[][] m = new int[6][6];
        filMatrix(m);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(m[i][j] + "");
            }
            System.out.println();
        }


    }


    static void replace(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (a[i] +1) % 2;
            //0011
            //1100
        }
    }



   static void filMatrix(int[] [] m){
        for(int i = 0; i < m.length; i++){
            m[i][i] = m[i][m.length - i - 1] = 1;
        }
    }


}
