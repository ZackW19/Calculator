package ProgramComponents;


//lista wyników/operacji wyk. na kalkulatorze
import java.util.ArrayList;
import java.util.List;

public class ResultsList{
    private static List<String> listOfResults = new ArrayList<>();


    public static List<String> getListOfResults() {
        return listOfResults;
    }

    public static void setListOfResults(String calcLog) {
            listOfResults.add(calcLog);
    }
}
