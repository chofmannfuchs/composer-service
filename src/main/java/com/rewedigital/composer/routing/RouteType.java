package com.rewedigital.composer.routing;

import java.util.concurrent.CompletionStage;

import com.rewedigital.composer.util.response.ComposedResponse;
import com.rewedigital.composer.util.response.ResponseComposition;
import com.spotify.apollo.RequestContext;

import okio.ByteString;

public interface RouteType {

    CompletionStage<ComposedResponse<ByteString>> execute(final RouteMatch rm, final RequestContext context,
        final ResponseComposition extensions);
}
