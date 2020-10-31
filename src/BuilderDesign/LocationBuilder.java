package BuilderDesign;

public class LocationBuilder extends LocationBuilt {
	
	public LocationBuilder() {
		// TODO Auto-generated constructor stub
		locationBuilt=new LocationBuilt();
	}

	LocationBuilt locationBuilt;

	LocationBuilder withState(StateData state) {
		locationBuilt.state = state;
		return this;
	}

	LocationBuilder withCity(CityData city) {
		locationBuilt.city = city;
		return this;
	}

	LocationBuilt built() {
		return locationBuilt;
	}
}
