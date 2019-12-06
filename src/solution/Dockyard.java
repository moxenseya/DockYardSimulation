package solution;

import shipping.IContainer;
import shipping.IDockyard;
import shipping.ITruck;

import java.lang.reflect.Array;
import java.util.*;

import javax.management.ValueExp;

public class Dockyard implements IDockyard {

	List<String> CityNames;
	

	List<Queue<Integer>> dockingStations;
		
	
	public Dockyard() {
		// TODO Auto-generated constructor stub
		CityNames  = new ArrayList<String>();
		CityNames.add("BOS");
		CityNames.add("NYC");
		CityNames.add("LA");
		CityNames.add("ATL");
		
		dockingStations = new ArrayList<Queue<Integer>>();
		
		for (int i=0;i<CityNames.size();i++)
		{
			dockingStations.add(new PriorityQueue<Integer>());
		}
		
		
		
	}	



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
