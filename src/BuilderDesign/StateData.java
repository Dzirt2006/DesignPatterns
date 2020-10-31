package BuilderDesign;

public class StateData extends ValueObjectBase {

	String abbreviation;

	StateData(String stateName, String stateAbbreviation) {
		super(stateName);
		this.abbreviation = stateAbbreviation;
	}
}
