package com.example.figurasmongo.views.perimetroarea;

import com.example.figurasmongo.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Perimetro Area")
@Route(value = "perimetro-area", layout = MainLayout.class)
@Uses(Icon.class)
public class PerimetroAreaView extends Composite<VerticalLayout> {

    public PerimetroAreaView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
