import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationServiceTest {

    @Test
    void ChillPerMonths() {
        VacationService service = new VacationService();

        // подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int months = 3;

        // вызываем целевой метод:
        int actual = service.calculateChill(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(months, actual);
    }

    @Test
    void ChillPerMonths1() {
        VacationService service = new VacationService();

        // подготавливаем данные:
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int months = 2;

        // вызываем целевой метод:
        int actual = service.calculateChill(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(months, actual);
    }
}
