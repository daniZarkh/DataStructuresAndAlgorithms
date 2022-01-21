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

    public void display() {

    }

    public void insertionSort() {

    }
}
