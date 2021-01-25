public class BonusMilesService {
    public int calculate (int cost) {

        int priseLimit = 20;
        int miles = cost / priseLimit;
        return miles;
    }
}
