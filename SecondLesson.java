import java.util.Arrays;

public class SecondLesson {
    public static void main(String[] args) {
        array();
        arrayGenerate();
        changeArray();
        System.out.println("Задание 4");
        fillDiagonal();
        minMaxArr();
        int[] forCheckArrSum = {2, 2, 2, 2, 2, 10};
        System.out.println("Задание 6");
        System.out.println(checkArrSum(forCheckArrSum));
        int[] array = {2, 3, 4, 5};
        moveAsideArray(array,-2);
    }
    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
   // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void array(){
        int [] myArr = {1 ,1 ,0 ,1 ,0 ,0 ,1};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 0) {
                myArr[i] = 1;
            } else if (myArr[i] == 1) {
                myArr[i] = 0;
            }
        }
        System.out.println("Задание 1 " + Arrays.toString(myArr));
    }
    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void arrayGenerate(){
        int [] myArr = new int[8];
        for (int i = 1; i < myArr.length; i++) {
            myArr[i] = myArr[i - 1] + 3;
        }
        System.out.println("Задание 2 " + Arrays.toString(myArr));
    }
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray(){
        int [] myArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] < 6) {
                myArr[i] = myArr[i] * 2;
            }
        }
        System.out.println("Задание 3 " + Arrays.toString(myArr));
    }
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal(){
        int [][] myArr = new int[6][6];
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                if (i == j){
                    myArr[i][j] = 1;
                }
                else if (i + j == 5){
                    myArr[i][j] = 1;
                }
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
        }

        }
    // Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minMaxArr(){
    int [] nums = {8 ,7 ,3 ,2 ,16 ,11 ,5 ,-3 ,-7 ,19 };
    int min = nums[0];
    int max = nums[1];
    for (int num : nums){
        if (num < min) {
            min = num;
        }
        else if (num > max){
            max = num;
        }
    }
        System.out.println("Задание 5");
        System.out.println("Минимальное значение= " + min);
        System.out.println("Максимальное значение= " + max);
        }
    //** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    public static boolean checkArrSum(int[] array) {
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            int sum1 = 0;
            for (int j = 0; j < array.length; j++) {
            sum1 += (j > i)? array[j] : 0;
        }
        if (sum == sum1){
            return true;
        }
        }
        return false;
    }
    // Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static void moveAsideArray(int[] array, int n) {
        System.out.println("Задание 8");
        System.out.println(Arrays.toString(array));
       boolean direction;
        if (n < 0) {
           direction = true;
           n = -n;
       }else{
           direction = false;
       }
        int last = array.length - 1;
        for (int i = 0; i < n; i++) {
            int temp = (direction) ? array[0] : array[last];

            for (int j = 0; j < last; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[last - j] = array[last - j - 1];
            }

            if (direction)
                array[last] = temp;
            else
                array[0] = temp;
        }
        System.out.println("n= " + n);
        System.out.println(Arrays.toString(array));
    }
}


