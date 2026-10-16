public class FitCalculator {
    public static void calculateFit(Hole hole, Shaft shaft) {

        double dMax = hole.getMaxSpecification(); // Максимальное отверстие
        double dMin = hole.getMinSpecification(); // Минимальное отверстие

        double sMax = shaft.getMaxSpecification(); // Максимальный вал
        double sMin = shaft.getMinSpecification(); // Минимальный вал

        System.out.println("\n--- Результаты расчетов предельных размеров---");
        System.out.printf("Отверстие: макс = %.3f мм, мин = %.3f мм\n", dMax, dMin);
        System.out.printf("Вал:       макс = %.3f мм, мин = %.3f мм\n", sMax, sMin);
        System.out.println("________________________________________");

        // Посадка с зазором: Самый большой вал меньше самого маленького отверстия
        if (sMax <= dMin) {
            double maxClearance = dMax - sMin; // Максимальный зазор
            double minClearance = dMin - sMax; // Минимальный зазор
            System.out.println("Тип посадки: С ЗАЗОРОМ");
            System.out.printf("Максимальный зазор: %.3f мм\n", maxClearance);
            System.out.printf("Минимальный зазор: %.3f мм\n", minClearance);

        }

        // Посадка с натягом: Самый маленький вал больше самого большого отверстия
        else if (sMin >= dMax) {
            double maxInterference = sMax - dMin; // Максимальный натяг
            double minInterference = sMin - dMax;  // Минимальный натяг
            System.out.println("Тип посадки: С НАТЯГОМ");
            System.out.printf("Максимальный зазор: %.3f мм\n", maxInterference);
            System.out.printf("Минимальный зазор: %.3f мм\n", minInterference);
        }

        // Переходная посадка
        else {
            double maxClearance = dMax - sMin; // максимальный зазор
            double maxInterference = sMax - dMin; // максимальный натяг
            System.out.println("Тип посадки: ПЕРЕХОДНАЯ");
            System.out.printf("Максимальный зазор: %.3f мм\n", maxClearance);
            System.out.printf("Максимальный натяг: %.3f мм\n", maxInterference);
        }
    }
}
