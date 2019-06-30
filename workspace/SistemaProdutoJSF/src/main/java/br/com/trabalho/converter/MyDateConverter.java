package br.com.trabalho.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;

@FacesConverter("myDateConverter")
public class MyDateConverter extends DateTimeConverter{
	
	public MyDateConverter(){
		setPattern("dd/MM/yyyy");
	}
	
	@Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        /*if (value != null && value.length() != getPattern().length()) {
            throw new ConverterException("Formato Inválido");
        }*/

        return super.getAsObject(context, component, value);
    }	

}
