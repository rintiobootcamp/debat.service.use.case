package com.bootcamp.helpers;

/**
 * @author ibrahim
 * InfoDebat is just some information about One particular debat
 */
public class InfoDebat {

    /**
     *@see InfoDebat#IdDebat is the Id of the debat
     */
    private int IdDebat;

    /**
     * @see InfoDebat#sujet is the subject of the debat
     */
    private String sujet;

    /**
     *@see InfoDebat#nombrePost is the total of comment for this particular debat
     */
    private int nombrePost;

    public int getIdDebat() {
        return IdDebat;
    }

    public void setIdDebat(int idDebat) {
        IdDebat = idDebat;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public int getNombrePost() {
        return nombrePost;
    }

    public void setNombrePost(int nombrePost) {
        this.nombrePost = nombrePost;
    }
}
