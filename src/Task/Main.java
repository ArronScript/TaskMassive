package Task;

    public class Main{
        public static void main(String[] args){
            //В переменной а будет храниться значение размера массива, которое мы получим с помощью простого цикла
            int a=0;
            for(int i=2;i<=20;i++){
                if(i%2==0)a++;
            }
            //Создадим массив, и используя цикл, заполним его ячейки. Сразу выведем на экран значения элементов массива в строку
            int[] Mas = new int[a];
            for(int i=2,b=0;i<=20;i++){
                if(i%2==0){
                    Mas[b]=i;
                    System.out.print(Mas[b]+" ");
                    b++;
                    System.out.println(Mas[b]);
                }
            }
            //Выведем на экран каждый элемент массива на отдельной строке
            System.out.println(" ");
            for(int i=0;i<Mas.length;i++){
                System.out.println(Mas[i]);
            }
        }
    }