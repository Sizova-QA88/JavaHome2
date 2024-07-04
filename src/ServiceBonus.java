public class ServiceBonus {

    public static void main(String[] args) {

        // Переменные для входных данных

        int ticketprice = 25_870;  //стоимость билета
        int milesBonus = 20;      // количество рублей для одной бонусной мили

        int calculation = ticketprice / milesBonus; // Рассчитываем количество миль


        //Выводим данные на экран
        System.out.println("Количество начисленных бонусных миль: " + calculation);
    }
}
