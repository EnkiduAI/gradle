import utils.StringUtils;

import java.util.Arrays;

public class Utils {
    private final StringUtils utils = new StringUtils();
public boolean isPostitveNumbers(String... str){
    return Arrays.stream(str).filter(utils::isPositiveNumber).count() == str.length;
}
}
