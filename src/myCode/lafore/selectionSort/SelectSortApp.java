package myCode.lafore.selectionSort;

public class SelectSortApp {

    public static void main(String[] args) {
        int maxSize = 100;                  //размер массива
        ArraySel arr;                       //ссылка на массив
        arr = new ArraySel(maxSize);        //создание массива
        arr.insert(77);               // вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);

        arr.insert(22);
        arr.insert(88);
        arr.insert(11);

        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();                      //вывод элементов

        arr.selectionSort();                //сортировка метолом выбора

        arr.display();                      //повторный вывод
    }
}
