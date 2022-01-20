package myCode.lafore.selectionSort;

public class ArraySel {
    private long[] a;               //ссылка на массив a
    private int nElems;             //количество элементов данных

    public ArraySel(int max) {      //конструктор
        a = new long[max];          //создание массива
        nElems = 0;                 //пока нет ни одного элемента
    }

    public void insert(long value) { //вставка элемента в массив
        a[nElems] = value;           //собственно вставка
        nElems++;                    //увеличение размера
    }

    public void display() {                       //вывод содержимого массива
        for (int j = 0; j < nElems; j++) {        //для каждого элемента
            System.out.print(a[j] + " ");         //вывод
        }
        System.out.println();
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) {        //внешний цикл
            min = out;                                  //минимум
            for (in = out + 1; in < nElems; in++) {     //внутренний цикл
                if (a[in] < a[min]) {                   //если значение min больше
                    min = in;                           //значит, найден новый минимум
                    swap(out, in);                       //swap them
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
