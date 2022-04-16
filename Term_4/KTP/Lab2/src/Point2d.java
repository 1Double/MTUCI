// 2d точка
public class Point2d {
    private double xCoord; // Координата X
    private double yCoord; // Координата Y

    public Point2d() { // Конструктор по умолчанию
        this(0,0);
    }

    public Point2d(double x, double y) { // Конструктор с двумя параметрами
        xCoord = x;
        yCoord = y;
    }

    public double getX() {
        return xCoord;
    } // Возвращает координату X

    public double getY() {
        return yCoord;
    } // Возвращает координату Y

    public void setX(double xCoord) {
        this.xCoord = xCoord;
    } // Установка занчения координаты X

    public void setY(double yCoord) {
        this.yCoord = yCoord;
    } // Установка занчения координаты Y
}
