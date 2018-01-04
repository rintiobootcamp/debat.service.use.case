package com.bootcamp.helpers;

import com.bootcamp.commons.enums.EntityType;

import java.util.List;

/**
 * @author ibrahim
 * @see InfoDebatWS is the final ouput of the service InfoDebat
 * this ouput has been personnalize according to a need
 */

public class InfoDebatWS {
    /**
     * @see InfoDebatWS#entityId is the id of particular entity whitch is going to ask
     * with the following entity
     */
    private int entityId;

    /**
     * @see InfoDebatWS#entityType the name of the given  entity in following list
     * <ul>
     *     <li>PROJET</li>
     *     <li>SECTEUR</li>
     *     <li>AXE</li>
     *     <li>PILIER</li>
     * </ul>
     */
    private EntityType entityType;

    /**
     * @see InfoDebatWS#nombreDebat the total debat for the given entity
     */
    private Long nombreDebat;

    /**
     * @see InfoDebatWS#nombrePostGlobal the total post of all debat for the given entity
     */
    private Long nombrePostGlobal;

    /**
     * @see InfoDebatWS#listDebat the list of all debat information for the given entity
     */
    private List<InfoDebat> listDebat;

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public Long getNombreDebat() {
        return nombreDebat;
    }

    public void setNombreDebat(Long nombreDebat) {
        this.nombreDebat = nombreDebat;
    }

    public Long getNombrePostGlobal() {
        return nombrePostGlobal;
    }

    public void setNombrePostGlobal(Long nombrePostGlobal) {
        this.nombrePostGlobal = nombrePostGlobal;
    }

    public List<InfoDebat> getListDebat() {
        return listDebat;
    }

    public void setListDebat(List<InfoDebat> listDebat) {
        this.listDebat = listDebat;
    }
}
