package com.bootcamp.controllers;

import com.bootcamp.helpers.InfoDebatWS;
import com.bootcamp.services.InfoDebatWSService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author ibrahim
 */
@RestController("InfoDebatController")
@RequestMapping("/infodebats")
@Api(value = "InfoDebat API", description = "InfoDebat API")
@CrossOrigin(origins = "*")
public class InfoDebatController {

    @Autowired
    InfoDebatWSService infoDebatWSService;

    /**
     * @param entityType
     * @param entityId
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/{entityType}/{entityId}", method = RequestMethod.GET)
    @ApiOperation(value = "get debat info ", notes = "Get one Debat information on particular enity by it id")
    public ResponseEntity<InfoDebatWS> getDebatInfoByEntityId(@PathVariable String entityType, @PathVariable int entityId) throws Exception {
        InfoDebatWS infoDebatWS = infoDebatWSService.getInfoDebatByEnityId( entityType, entityId );
        return new ResponseEntity<InfoDebatWS>( infoDebatWS, HttpStatus.OK );

    }
}
