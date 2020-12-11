package BuilderDesign;

public class LocationObjectMother {

	static LocationBuilt newYorkCity() {
		StateData stateDestination = StateDataProvider.newYork;
		CityData cityDestination = cityDataProvider.newYorkCity;
		LocationBuilt location = new LocationBuilder().withState(stateDestination).withCity(cityDestination).built();
		return location;
	}
	
	static LocationBuilt morrisTown() {
		StateData stateDestination = StateDataProvider.newJersey;
		CityData cityDestination = cityDataProvider.morrisTown;
		LocationBuilt location = new LocationBuilder().withState(stateDestination).withCity(cityDestination).built();
		return location;
	}

}
