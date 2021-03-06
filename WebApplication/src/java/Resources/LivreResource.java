/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Resources;

import Model.Livre;
import Services.LivreService;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author drging
 */
@Path("livre")
public class LivreResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Livre> getLivres()
    {
        return LivreService.getLivres();
    }

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{LivreId}")
    public Livre getLivre(@PathParam("LivreId") int id) throws IOException
    {
        return LivreService.getLivre(id);
    }
    
}
