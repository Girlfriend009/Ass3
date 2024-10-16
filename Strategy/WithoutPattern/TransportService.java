package BehavioralPatterns2.Strategy.WithoutPattern;

public class TransportService {
    // Метод для поездки в аэропорт с выбором транспорта
    public void travelToAirport(String transport) {
        if (transport.equals("taxi")) {
            System.out.println("Вы едете на такси. Стоимость: 1000 тенге.");
        } else if (transport.equals("bus")) {
            System.out.println("Вы едете на автобусе. Стоимость: 300 тенге.");
        } else if (transport.equals("metro")) {
            System.out.println("Вы едете на метро. Стоимость: 200 тенге.");
        } else {
            System.out.println("Неизвестный вид транспорта.");
        }
    }
}




