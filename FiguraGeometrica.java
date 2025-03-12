public class FiguraGeometrica {

    // Área del círculo
    double area(double radio) {
        return Math.PI * radio * radio;
    }

    // Área del rectángulo
    double area(double base, double altura) {
        return base * altura;
    }

    // Área del triángulo rectángulo
    double areaTrianguloRectangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Área del trapecio
    double area(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    // Área del pentágono regular
    double areapentagonoRegular(double lado, double apotema) {
        return (5 * lado * apotema) / 2;
    }

    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica();

        System.out.println("Área del círculo: " + figura.area(5)); // Círculo con radio 5
        System.out.println("Área del rectángulo: " + figura.area(4, 6)); // Rectángulo con base 4 y altura 6
        System.out.println("Área del triángulo rectángulo: " + figura.areaTrianguloRectangulo(3, 4)); // Triángulo rectángulo con base 3 y altura 4
        System.out.println("Área del trapecio: " + figura.area(5, 3, 4)); // Trapecio con bases 5 y 3, y altura 4
        System.out.println("Área del pentágono: " + figura.area(5, 3)); // Pentágono regular con lado 5 y apotema 3
    }
}