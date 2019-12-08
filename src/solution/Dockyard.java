package solution;

import shipping.IContainer;
import shipping.IDockyard;
import shipping.ITruck;

import java.lang.reflect.Array;
import java.util.*;

import javax.management.ValueExp;

public class Dockyard implements IDockyard {

	List<String> CityNames;
	

	List<Queue<IContainer>> dockingStations;
		
	
	public Dockyard() {
		
		// TODO Auto-generated constructor stub
		CityNames  = new ArrayList<String>();
		
		//This is where you can add more cities. For each city, there will be a new Queue initialized.
		//Program will keep track of the index of the Queue based on the location in the CityNames index.
		CityNames.add("LA");
		CityNames.add("BOS");
		CityNames.add("NYC");
		CityNames.add("ATL");
		
		dockingStations = new ArrayList<Queue<IContainer>>();
		
		for (int i=0;i<CityNames.size();i++)
		{
			dockingStations.add(new LinkedList<>());
		}
		
		
		
	}	



	@Override
	public void addContainer(IContainer container) {
		// TODO Auto-generated method stub
		
		String containerDestination= container.destinationCity();
		
		int stationIndex = CityNames.indexOf(containerDestination);
		
		//dockingStations.get(stationIndex).add(container);
		dockingStations.get(stationIndex).add(container);


	}

	@Override
	public boolean loadTruck(ITruck truck) {
		// TODO Auto-generated method stub
		String destinationCityOfTruck = truck.destinationCity();

		int stationIndex = CityNames.indexOf(destinationCityOfTruck);

		//Now we check if queue is empty or has a container
		IContainer requiredContainer;

		if(this.containerCount(destinationCityOfTruck)>=1) {
		requiredContainer = dockingStations.get(stationIndex).poll();
		truck.addContainer(requiredContainer);
		return true;
	}
	else
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
		int numBoxes =0;

		for(int i =0;i<dockingStations.size();i++)
		{
			numBoxes+=dockingStations.get(i).size();
		}
		return numBoxes;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		int numBoxes = 0;
		for(int i =0;i<dockingStations.size();i++)
		{
			numBoxes+=dockingStations.get(i).size();
		}

		
			System.out.println("The dockyard contains " + numBoxes +" containers.");
			if(numBoxes>0)
			{
				for(int i =0;i<CityNames.size();i++)
				{
					System.out.print(CityNames.get(i) + ": ");
					System.out.print(dockingStations.get(i).size() + "\n");
					
				}
			}
			
		
	}

}
