package solution;

import shipping.IContainer;
import shipping.IDockyard;
import shipping.ITruck;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Queue;

public class Dockyard implements IDockyard {

	ArrayList<String> CityNames = new ArrayList<>(){
		{
			add("BOS");
			add("NYC");
			add("LA");
			add("ATL");
		}
	};


	ArrayList<Queue> dockingStation = new ArrayList<>();




	@Override
	public void addContainer(IContainer container) {
		// TODO Auto-generated method stub



	}

	@Override
	public boolean loadTruck(ITruck truck) {
		// TODO Auto-generated method stub
	return  false;
	}

	@Override
	public int containerCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int containerCount(String destinationCity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub

	}

}
