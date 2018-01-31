package nyc.c4q.marvelcomicsdb.model.comics;


import io.realm.RealmObject;

public class SeriesSummary extends RealmObject {

  private String resourceURI;
  private String name;

  public String getResourceURI() {
    return resourceURI;
  }

  public String getName() {
    return name;
  }
}
