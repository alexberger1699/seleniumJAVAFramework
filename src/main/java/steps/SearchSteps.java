package steps;

import pages.SearchPage;

public class SearchSteps {
    private SearchPage searchPage = new SearchPage();

    public SearchResultsSteps executeSearchByKeyword(String keyword){
        searchPage.fillSearchField(keyword);
        searchPage.pressEnter();
        return new SearchResultsSteps();
    }
}
