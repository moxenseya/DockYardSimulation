package solution;

import shipping.IContainer;
import shipping.IDockyard;
import shipping.IShip;
import shipping.ShippingProcessorBase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ShippingProcessor extends ShippingProcessorBase {

	public ShippingProcessor(IDockyard dockyard) {
		super(dockyard);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void processShippingEvent(String input) {
		// TODO Auto-generated method stub
super.processShippingEvent(input);
	}

	@Override
	protected void processTruck(String registration, String destination) {
		// TODO Auto-generated method stub
		//System.out.println("This what a truck is supposed to do.");
		Truck truck = new Truck(registration,destination);
		System.out.print("Before loading: ");
		truck.printDetails();

		this.getDockyard().loadTruck(truck);

		System.out.print("After loading: ");
		truck.printDetails();


	}

	@Override
	protected IShip processShip(String registration) {
		// TODO Auto-generated method stub
		//System.out.println("Before unloading: Ship ");
		Ship ship = new Ship();
		ship.setRegistration(registration);
		List<IContainer> containerList = this.readManifest(ship.getRegistration());

		//Loading the ship
		for(IContainer container : containerList)
		{
			ship.addContainer(container);
		}

		ship.printDetails(); //Before unloading part

		List<IContainer> offloadFromShip = ship.offload();

		ship.printDetails();
		
		for(IContainer container : offloadFromShip)
		{
			this.getDockyard().addContainer(container);
		}
		
		
		return ship;
	}

	@Override
	protected List<IContainer> readManifest(String shipId) {
		// TODO Auto-generated method stub
		List<IContainer> containerList = new ArrayList<IContainer>();
		String shipManifestName = shipId + "-Manifest";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(shipManifestName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BufferedReader reader = new BufferedReader(fileReader);
		String input;

		// Read each event and process it
		try {
			input = reader.readLine();
			int containerCount = 0;
			while (input != null) {
				containerCount++;
				StringTokenizer st = new StringTokenizer(input, ",");
				String containerCode = st.nextToken().trim();
				String containerDestination = st.nextToken().trim();
				
				containerList.add(new Container(containerCode,("Container #" + containerCount),containerDestination));
				input = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Close the input
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return containerList;
	}
	
}