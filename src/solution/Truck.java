package solution;

import shipping.IContainer;
import shipping.ITruck;

public class Truck implements ITruck {

	private String Truck_id;
	private String Dest_city;
	private IContainer container;

	public Truck(String id, String dest_city){
		this.Truck_id=id;
		this.Dest_city=dest_city;
		container = null;
	}

	@Override
	public String registration() {
		// TODO Auto-generated method stub
		return this.Truck_id;
	}

	@Override
	public String destinationCity() {
		// TODO Auto-generated method stub
		return this.Dest_city;
	}

	@Override
	public boolean addContainer(IContainer container) {
		// TODO Auto-generated method stub
		if(!this.hasContainer())
		{
			this.container=container;
			return true;
		}
		else{
			return false;
		}

	}

	@Override
	public IContainer offloadContainer() {
		// TODO Auto-generated method stub
		IContainer temp = this.container;
		this.container=null;
		return temp;
	}

	@Override
	public boolean hasContainer() {
		// TODO Auto-generated method stub
		return(this.container!=null);
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.print("Truck " + this.registration() + " is headed to " + this.destinationCity() + " with ");
		if(this.hasContainer())
			System.out.println("Container " + this.container.id());
		else
			System.out.println("no container");
	}

}
