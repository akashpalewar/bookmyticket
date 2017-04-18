package com.travel.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.travel.service.UserService;
import com.travel.util.JsonMapper;


@Path("/users")
public class UserRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDefaultUserInJSON() {
        UserService userService = new UserService();
        return JsonMapper.convertObject(userService.getDefaultUser());
    }
}
