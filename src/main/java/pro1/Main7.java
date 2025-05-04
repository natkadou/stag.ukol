package pro1;

import com.google.gson.Gson;
import pro1.apiDataModel.ScopesList;

import java.util.ArrayList;

public class Main7 {

    public static String specializationDeadlines(int year) {
        String json = Api.getSpecializations(2025);

        ScopesList scopesList = new Gson().fromJson(json, ScopesList.class);
        scopesList.uniqueScopes(); // vezme jen ty unikáty
        scopesList.sortByDeadline(); //seřadí podle data

        ArrayList<String> dates = scopesList.getScopesFormated();

        String formated = String.join(",", dates); // vrátí řetězec oddělený čárkami
        return formated;
    }
}
