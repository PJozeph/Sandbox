public interface Vehicle {

    static String producer(){
        return "A&A Vehicles";
    }

    default String getOverview(){
            return "ATV by " + producer();
    }

}
