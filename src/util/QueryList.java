package util;

import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends QueryItem> extends ArrayList<T> {

  public QueryList(List<T> items) {
    super(items);
  }

  public QueryList() {

  }

  public QueryList<T> getMatches(String field, String value) {
    QueryList<T> matches = new QueryList<>();

    for (var item : this) {
      if (item.matchFieldValues(field, value)) {
        matches.add(item);
      }
    }

    return matches;
  }
}
