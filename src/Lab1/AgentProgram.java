package Lab1;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		//TODO
		if(p.getLocationState() == Environment.LocationState.DIRTY) {
			return Environment.SUCK_DIRT;
		}else if(p.getLocationState().equals(Environment.LOCATION_A)){
			return Environment.MOVE_RIGHT;
		}else if(p.getLocationState().equals(Environment.LOCATION_B)) {
				return Environment.MOVE_LEFT;
			}
		return NoOpAction.NO_OP;
		
	}
}