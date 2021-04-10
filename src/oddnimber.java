//    Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.
//    Пример ввода: [3,5,20,8,7,3,100]
//    Пример вывода: 3,5,7,3

public class oddnimber {
    public static void main(String[] args) {

        //int[] array = new int[8];
        int[] array = {3,5,20,8,7,3,100};
        int[] arraysort = new int[array.length];
        //Scanner sc = new Scanner(System.in);
        //a = sc.nextInt();
        for (int i = 0; i <array.length; i++) {
            //array[i] = i;
            if(i / 2 == 0) {
                arraysort[i] = i;
            }
        }
        for(int k= 0; k < arraysort.length; k++) {
            System.out.print(arraysort[k]);
        }
    }
}
