package com.greencity.core.models.impl;

import com.greencity.core.models.CookieToolbar;
import com.greencity.core.models.RightModel;
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

    @Override
    public boolean hasLeft() {
        return left != null;
    }

    @Override
    public boolean hasRight() {
        return right != null;
    }

    @Override
    public Resource getLeft() {
        return left;
    }

    @Override
    public Resource getRight() {
        return right;
    }

    @Override
    public RightModel getRightModel() {
        return right != null ? right.adaptTo(RightModel.class) : null;
    }
}