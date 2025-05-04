package pro1;

import com.google.gson.Gson;
import pro1.apiDataModel.ScopesList;

import java.util.ArrayList;

public class Main7 {

    public static String specializationDeadlines(int year) {
        String json = Api.getSpecializations(2025);

        ScopesList scopesList = new Gson().fromJson(json, ScopesList.class);
        scopesList.uniqueScopes();
        scopesList.sortByDeadline();

        ArrayList<String> dates = scopesList.getScopesFormated();

        String formated = String.join(",", dates);
        return formated;
    }
}
