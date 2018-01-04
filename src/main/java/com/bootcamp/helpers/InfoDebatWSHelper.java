package com.bootcamp.helpers;

import com.bootcamp.entities.Debat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ibrahim
 * @see InfoDebatWSHelper build the
 * @see InfoDebatWS object by getting the debat list for the given entity
 */
public class InfoDebatWSHelper {

    /**
     * @see InfoDebatWSHelper#buildInfoDebatWS(List) is the principal method of this class
     * it in charge to build the
     * @see InfoDebatWS objetct
     * @param inputDebats
     * @return
     * @throws Exception
     */
    public InfoDebatWS buildInfoDebatWS(List<Debat> inputDebats) throws Exception{
        InfoDebatWS infoDebatWS = new InfoDebatWS();
        infoDebatWS.setNombreDebat( getNombreDebat( inputDebats ) );
         long nombrePostGlobal =0;
        List<InfoDebat> listInfoDebats = new ArrayList<>(  );
        inputDebats.forEach( debat -> {
            try {
                listInfoDebats.add( new InfoDebatHelper().builInfoDebat( debat ) );
            } catch (Exception e) {
                e.printStackTrace();
            }
        } );

        infoDebatWS.setListDebat( listInfoDebats );

       for(InfoDebat infoDebat:listInfoDebats){
           nombrePostGlobal+=infoDebat.getNombrePost();
       }

       infoDebatWS.setNombrePostGlobal( nombrePostGlobal );

        return infoDebatWS;
    }

    private long getNombreDebat(List<Debat> inputDebats){
        return inputDebats.size();
    }
}
