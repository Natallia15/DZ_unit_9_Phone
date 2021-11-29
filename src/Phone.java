public class Phone {
    int number;
    String model;
    int weight;
    int nomer;
    int a;

    //д) Добавить конструктор в класс Phone, который принимает на
    // вход три параметра для инициализации переменных класса - number, model и weight.

    // Phone (int number, String model, int weight){
    //    this.number = number;
     //  this.model = model;
      //  this.weight = weight;
   // }

    @Override
    public String toString() {
    return  number+" " + model+" " +  weight                ;
    }

    //е) Добавить конструктор, который принимает на вход два параметра для инициализации
    // переменных класса - number, model.
    Phone(int number, String model){
        this.number = number;
        this.model = model;
    }


   Phone (int number, String model, int weight){
       this(number, model);
       this.weight = weight;
   }
public void recieveCall (String name, int number){
        System.out.println("Звонит " + name+ " его номер "+ number);

}
    // ж) Добавить конструктор без параметров.
    Phone(){

    }

// к) Создать метод sendMessage с аргументами переменной длины.
// Данный метод принимает на вход номера телефонов, которым
// будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    public void sendMessage (Integer ... nomer){
for (Integer o : nomer){

        System.out.println("Номеру " + o.toString() + " будет отправлено сообщение ");

    }


    }}



