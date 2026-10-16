public class Shaft {
    private final double nominalSize; //Номинальный размер
    private final double upperDeviation;  //Верхнее отклонение
    private final double lowerDeviation;  // Нижнее отклонение

    public Shaft(double nominalSize, double upperDeviation, double lowerDeviation) {
        this.nominalSize = nominalSize;
        this.upperDeviation = upperDeviation;
        this.lowerDeviation = lowerDeviation;
    }

    // Расчет максимального вала
    public double getMaxSpecification() {
        return nominalSize + upperDeviation;
    }

    // Расчет минимального вала
    public double getMinSpecification() {
        return nominalSize + lowerDeviation;
    }
}
