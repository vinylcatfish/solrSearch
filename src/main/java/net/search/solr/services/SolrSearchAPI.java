package net.search.solr.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/solrApi")
public class SolrSearchAPI {
    @GET
    @Produces("application/xml")
    public String solrApi() {

        Double fahrenheit = 98.24;
        Double celsius = 36.8;
        celsius = ((fahrenheit - 32) * 5) /9 ;
//        fahrenheit = ((celsius * 9) / 5) + 32;

        String result = "@Produces(\"application/xml\") Output: \n\nF to C Converter Output: \n\n" +
                celsius;
        return "<solrApi>" + "<fahrenheit>" + fahrenheit + "</fahrenheit>" + "<ftocoutput>" + result +
                "</ftocoutput>" + "</solrApi>";
    }

    @Path("{f}")
    @GET
    @Produces("application/xml")
    public String solrApi(@PathParam("f") Double f) {
        
        Double fahrenheit = f;
        Double celsius = 36.8;
        celsius = ((fahrenheit - 32) * 5) /9 ;

        String result = "@Produces(\"application/xml\") Output: \n\nF to C Converter Output From Input: \n\n" +
                celsius;
        return "<solrApi>" + "<fahrenheit>" + fahrenheit + "</fahrenheit>" + "<ftocoutput>" + result +
                "</ftocoutput>" + "</solrApi>";
    }
}