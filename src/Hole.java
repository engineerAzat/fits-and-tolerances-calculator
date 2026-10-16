public class Hole {
    private final double nominalSize; //Номинальный размер
    private final double upperDeviation;  //Верхнее отклонение
    private final double lowerDeviation;  // Нижнее отклонение

    public Hole(double nominalSize, double upperDeviation, double lowerDeviation) {
        this.nominalSize = nominalSize;
        this.upperDeviation = upperDeviation;
        this.lowerDeviation = lowerDeviation;
    }

    // Расчет максимального отверстия
    public double getMaxSpecification() {
        return nominalSize + upperDeviation;
    }

    // Расчет минимального отверстия
    public double getMinSpecification() {
        return nominalSize + lowerDeviation;
    }
}
