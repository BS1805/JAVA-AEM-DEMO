package com.greencity.core.models.impl;

import com.greencity.core.models.CookieToolbar;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(
        adaptables = Resource.class,
        adapters = CookieToolbar.class,
        resourceType = "greencity/components/cookietoolbar",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CookieToolbarImpl implements CookieToolbar {

    @ChildResource
    private Resource left;

    @ChildResource
    private Resource right;

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public Resource getLeft() {
        return left;
    }

    public Resource getRight() {
        return right;
    }

}