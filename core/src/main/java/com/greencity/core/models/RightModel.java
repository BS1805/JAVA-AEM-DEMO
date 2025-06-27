package com.greencity.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        resourceType = "greencity/components/cookietoolbar/right",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class RightModel {

    @ValueMapValue
    private String button1Label;

    @ValueMapValue
    private String button2Label;

    @ValueMapValue
    private String button1Color;

    @ValueMapValue
    private String button2Color;

    public String getButton1Label() {
        return button1Label;
    }

    public String getButton2Label() {
        return button2Label;
    }

    public String getButton1Color() {
        return button1Color;
    }

    public String getButton2Color() {
        return button2Color;
    }
}