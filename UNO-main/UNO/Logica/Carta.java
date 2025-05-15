package UNO.Logica;

public class Carta {
    private int numero;       // Pot representar també valors especials com -1 = +2, -2 = +4, etc.
    private Color color;      // Pot ser null per a comodins

    public Carta(int numero, Color color) {
        this.numero = numero;
        this.color = color;
    }

    public boolean sonCartesCompatibles(Carta altra) {
        if (this.color != null && this.color.equals(altra.getColor())) {
            return true;
        }

        if (this.numero == altra.getNumero()) {
            return true;
        }


        if (this.numero == -2 || this.numero == -3) {
            return true;
        }

        return false;
    }

    public int getNumero() {
        return numero;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Carta{" + "valor=" + numero + ", color=" + color + '}';
    }

    public void mostrarCarta() {
        System.out.println("Carta: " + color + " " + numero);
    }
}
