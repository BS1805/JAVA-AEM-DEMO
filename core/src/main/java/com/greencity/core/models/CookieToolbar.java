package com.greencity.core.models;

import org.apache.sling.api.resource.Resource;

public interface CookieToolbar {
    boolean hasLeft();
    boolean hasRight();
    Resource getLeft();
    Resource getRight();

}