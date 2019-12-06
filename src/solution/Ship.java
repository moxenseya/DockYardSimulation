package solution;

import shipping.IContainer;
import shipping.IShip;

import java.util.List;

public class Ship implements IShip {

	String ship_id;
	List<IContainer> container_list;


	@Override
	public List<IContainer> containers() {
		// TODO Auto-generated method stub
		return this.container_list;
	}

	@Override
	public List<IContainer> offload() {
		// TODO Auto-generated method stub
		return this.container_list;
	}

	@Override
	public String getRegistration() {
		// TODO Auto-generated method stub
		return this.ship_id;
	}

	@Override
	public void setRegistration(String id) {
		// TODO Auto-generated method stub
		this.ship_id = id;
	}

	@Override
	public void addContainer(IContainer container) {
		// TODO Auto-generated method stub
		this.container_list.add(container);
		
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
	}

}
