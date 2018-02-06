public class App {

    public static void main(String[] args) {

        String vehichle = Vehicle.producer();
        VehichleImp vehichleImp = new VehichleImp();
        String vehicleImp  = vehichleImp.getOverview();


        System.out.println(vehichle);
        System.out.println();
        System.out.println(vehicleImp);
    }
}
