package myCode.lafore.objectSort;

public class ObjectSortApp {

    public static void main(String[] args) {
        int maxSize = 100;          //размер массива
        ArrayInOb arr;              //ссылка на массив

        arr = new ArrayInOb(maxSize); //создание массива

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasques", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Cresswell", "Lucinda", 18);

        System.out.println("Before sorting:");
        arr.display();        //вывод содержимого
        arr.insertionSort();  //сортировка методом вставки

        System.out.println("After sorting:");
        arr.display();       // повторный вывод
    }
}
