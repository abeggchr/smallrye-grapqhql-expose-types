import org.apache.commons.math3.stat.interval.ConfidenceInterval;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class Resource {

    @Query
    public ConfidenceInterval getAllFilms() {
        return new ConfidenceInterval(1,2,3);
    }
}