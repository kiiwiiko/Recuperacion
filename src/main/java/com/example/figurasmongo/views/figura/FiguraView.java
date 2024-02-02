package com.example.figurasmongo.views.figura;

import com.example.figurasmongo.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Figura")
@Route(value = "figura", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class FiguraView extends Composite<VerticalLayout> {

    public FiguraView() {
        Paragraph textMedium = new Paragraph();
        HorizontalLayout layoutRow = new HorizontalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        ComboBox comboBox = new ComboBox();
        Paragraph textMedium2 = new Paragraph();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        textMedium.setText("Ingrese el centro del circulo");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        textField.setLabel("X 1");
        textField.setWidth("min-content");
        textField2.setLabel("Y 1");
        textField2.setWidth("min-content");
        layoutColumn2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        comboBox.setLabel("Combo Box");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, comboBox);
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        textMedium2.setText("Ingrese algún punto de referencia con la circunferencia");
        textMedium2.setWidth("100%");
        textMedium2.getStyle().set("font-size", "var(--lumo-font-size-m)");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        textField3.setLabel("X 2");
        textField3.setWidth("min-content");
        textField4.setLabel("Y 2");
        textField4.setWidth("min-content");
        layoutColumn3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        layoutRow3.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        textField5.setLabel("X 3");
        textField5.setWidth("min-content");
        textField6.setLabel("Y 3");
        textField6.setWidth("min-content");
        getContent().add(textMedium);
        getContent().add(layoutRow);
        layoutRow.add(textField);
        layoutRow.add(textField2);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(comboBox);
        getContent().add(textMedium2);
        getContent().add(layoutRow2);
        layoutRow2.add(textField3);
        layoutRow2.add(textField4);
        getContent().add(layoutColumn3);
        layoutColumn3.add(layoutRow3);
        layoutRow3.add(textField5);
        layoutRow3.add(textField6);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
