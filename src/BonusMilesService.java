public class BonusMilesService {
    public int calculate(int cast, int bonusAmount) {
        int miles = cast / bonusAmount;
        return miles;
    }
}