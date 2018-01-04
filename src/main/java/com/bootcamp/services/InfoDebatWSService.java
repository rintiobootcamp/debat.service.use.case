package com.bootcamp.services;

import com.bootcamp.client.DebatClient;
import com.bootcamp.commons.enums.EntityType;
import com.bootcamp.entities.Debat;
import com.bootcamp.helpers.InfoDebatWS;
import com.bootcamp.helpers.InfoDebatWSHelper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author ibrahim
 * The service class of the controller
 */
@Component
public class InfoDebatWSService {
    /**
     * the link for to client debat
     */
    private DebatClient debatClient;

    /**
     * This method initialize the debat client
     */
    @PostConstruct
    public void init() {
        debatClient = new DebatClient();
    }

    /**
     * This method receive in param the entity and it's id
     * and the construct the output of the controller
     * it get the list of All debat for given entity
     * and the build the
     *
     * @param entityType
     * @param entityId
     * @return infoDebatWS
     * @throws Exception
     * @see InfoDebatWS object by calling the
     * @see InfoDebatWSHelper#buildInfoDebatWS(List) with the list of debat
     * and set the remaining inforamtion to have the complet debat info.
     */
    public InfoDebatWS getInfoDebatByEnityId(String entityType, int entityId) throws Exception {
        InfoDebatWSHelper infoDebatWSHelper = new InfoDebatWSHelper();
        List<Debat> listDebat = getDebats( entityType, entityId );
        InfoDebatWS infoDebatWS = infoDebatWSHelper.buildInfoDebatWS( listDebat );
        infoDebatWS.setEntityId( entityId );
        infoDebatWS.setEntityType( EntityType.valueOf( entityType ) );
        return infoDebatWS;
    }


    private List<Debat> getDebats(String entityType, int entityId) throws Exception {
        return debatClient.getAllByEntityId( entityType, entityId );
    }

}
