package com.bootcamp.helpers;

import com.bootcamp.client.CommentaireClient;
import com.bootcamp.entities.Commentaire;
import com.bootcamp.entities.Debat;

import java.util.List;

public class InfoDebatHelper {

    public InfoDebat builInfoDebat(Debat inputDebat) throws Exception{
        InfoDebat infoDebat = new InfoDebat();
        infoDebat.setIdDebat( inputDebat.getId() );
        infoDebat.setSujet( inputDebat.getSujet() );
        CommentaireClient commentaireClient = new CommentaireClient();
        List<Commentaire> posts = commentaireClient.getCommentByEntity( "DEBAT",inputDebat.getId() );
        infoDebat.setNombrePost( posts.size() );
        return infoDebat;
    }
}
