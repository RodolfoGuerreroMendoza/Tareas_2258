public class CafeteraDriver {
    public static void main(String[] args) {
        Cafetera maquina = new Cafetera();
        System.out.println(maquina.toString());

        for (int i = 1; i <= 50; i++){
            int tipo = (int)(Math.random() * 3) + 1;
            switch (tipo){
                case 1:
                    maquina.HacerAmericano();
                    break;

                case 2:
                    maquina.HacerExpreso();
                    break;

                case 3:
                    maquina.HacerCapuchino();
                    break;
            }
        }
        System.out.println("Se han servido los cafés...");
        System.out.println("Estado final de la cafetera:");
        System.out.println(maquina.toString());
    }
}
