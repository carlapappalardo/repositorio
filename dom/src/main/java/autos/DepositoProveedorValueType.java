package autos;

import org.apache.isis.applib.adapters.AbstractValueSemanticsProvider;


public class DepositoProveedorValueType extends AbstractValueSemanticsProvider<Deposito>{

	/* @Override
    public Parser<Deposito> getParser() {
        return new Parser<Deposito>() {
        	
            @SuppressWarnings("unused")
			public Deposito parseTextEntry(
            		Deposito context, String entry) {
                return new Deposito(entry);
            }
            public String displayTitleOf(Deposito object) {
                return object.getNombre();
            }
            public String displayTitleOf(Deposito object, 
                                         String usingMask) {
                return displayTitleOf(object);
            }
            
            public String parseableTitleOf(
            		Deposito existing) {
                return displayTitleOf(existing);
            }
            
            public int typicalLength() {
                return 8;
            }
            
			@Override
			public String displayTitleOf(Deposito arg0, Localization arg1) {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public Deposito parseTextEntry(Object arg0, String arg1,
					Localization arg2) {
				// TODO Auto-generated method stub
				return null;
			}
        };
    }

	*/
	
}
