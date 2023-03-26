public class Cafetera {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public Cafetera() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public String toString(){
        return "Ingredientes actuales: agua= " + this.agua + "ml, café= " + this.cafe + "g, crema= " + this.crema + "ml, vasos= "
                + this.vasos;
    }

    public void HacerAmericano() {
        if (this.agua >= 100 && this.cafe >= 15 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 15;
            this.vasos--;

            System.out.println("Café americano servido");
            System.out.println(this.toString());
        } else {
            System.out.println("No hay suficientes ingredientes para servir el americano...");
            System.out.println(this.toString());
        }
    }

    public void HacerExpreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;

            System.out.println("Café expreso servido");
            System.out.println(this.toString());
        } else {
            System.out.println("No hay suficientes ingredientes para servir el expreso...");
            System.out.println(this.toString());
        }
    }
    public void HacerCapuchino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;

            System.out.println("Capuchino servido");
            System.out.println(this.toString());
        } else {
            System.out.println("No hay suficientes ingredientes para servir el capuchino...");
            System.out.println(this.toString());
        }
    }
}


