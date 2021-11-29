//2) Класс Phone.
//а) Создайте класс Phone, который содержит переменные number, model и weight.
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        // б) Создайте три экземпляра класса Phone
        Phone phone1 = new Phone(3, "Samsung", 150);
        Phone phone2 = new Phone(22, "Nokia", 80);
        Phone phone3 = new Phone(5, "Redmi", 120);
        //в) Выведите на консоль значения их переменных.
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        //з) Вызвать из конструктора с тремя параметрами конструктор с двумя.

        //и) Добавьте перегруженный метод receiveCall, который принимает два параметра -
        // имя звонящего и номер телефона звонящего. Вызвать этот метод.
        phone1.recieveCall("elena", phone1.number);

        Phone phone = new Phone();
        phone.sendMessage(18255, 12255, 14455);

    }
}
