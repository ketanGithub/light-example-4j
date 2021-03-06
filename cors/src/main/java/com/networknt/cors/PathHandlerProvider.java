package com.networknt.cors;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;
import com.networknt.cors.handler.*;

public class PathHandlerProvider implements HandlerProvider {
    @Override
    public HttpHandler getHandler() {
        return Handlers.routing()
            .add(Methods.GET, "/v1/getData", new GetDataGetHandler())
            .add(Methods.POST, "/v1/postData", new PostDataPostHandler())
            .add(Methods.POST, "/v1/putData", new PutDataPostHandler())
        ;
    }
}

