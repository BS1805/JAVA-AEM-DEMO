package com.greencity.core.models;

import org.apache.sling.api.resource.Resource;

public interface CookieToolbar {
    Resource getLeft();
    Resource getRight();
    RightModel getRightModel();
    boolean hasLeft();
    boolean hasRight();
}