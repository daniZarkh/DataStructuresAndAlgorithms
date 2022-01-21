package myCode.lafore.objectSort;

public class ArrayInOb {

    private Person[] a;                 // ссылка на массив a
    private int nElems;                 // количество элементов данных

    public ArrayInOb(int max) {         // конструктор
        a = new Person[max];            //создание массива
        nElems = 0;                     //пока нет ни одного элемента
    }

    public void insert(String last, String first, int age) {     // включение хаписи в массив
        a[nElems] = new Person(last, first, age);
        nElems++;                                                 // увеличение размера
    }

    public void display() {                             //вывод содержимого массива
        for (int j = 0; j < nElems; j++) {              //для каждого элемента
           a[j].displayPerson();                          //вывод
        }
        System.out.println("");
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {                //out - разделительный маркер
            Person temp = a[out];                           //скопировать помеченный элемент
            in = out;                                       //начать перемещения c out
            while (in > 0
                    && a[in - 1].getLast().compareTo(temp.getLast()) > 0) {   // пока не найден меньший элемент
                a[in] = a[in - 1];                              //сдвинуть элемент вправо
                --in;                                           //перейти на одну позицию влево
            }
            a[in] = temp;                                   //вставить помеченный элемент
        }
    }
}
