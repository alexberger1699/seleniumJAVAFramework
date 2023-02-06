package steps;

import pages.SearchResultsPage;

public class SearchResultsSteps {

    private SearchResultsPage searchResultPage = new SearchResultsPage();


    public SearchResultsSteps verifyThatTopResultContainCorrectText(String text) {
        searchResultPage.assertThatTopResultContainsCorrectText(text);
        return this;
    }

    public SearchResultsSteps verifyThatTopResultContainProperAttributeText(String text) {
        searchResultPage.assertThatTopResultContainsProperAttributeText(text);
        return this;
    }
}
