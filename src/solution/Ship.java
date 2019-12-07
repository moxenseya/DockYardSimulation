package solution;

import shipping.IContainer;
import shipping.IShip;

import java.util.ArrayList;
import java.util.List;

public class Ship implements IShip {

	String ship_id;
	List<IContainer> container_list;

	public Ship(){
		this.container_list=new ArrayList<>();
	}


	@Override
	public List<IContainer> containers() {
		// TODO Auto-generated method stub
		return this.container_list;
	}

	@Override
	public List<IContainer> offload() {
		// TODO Auto-generated method stub
		List<IContainer> temp = new ArrayList<>(this.container_list);
		this.container_list.clear();
		return temp;
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
		if(this.container_list.size()>0)
		{
			System.out.print("Before ");
		}
		else
		{
			System.out.print("After ");
		}
		System.out.print("unloading: Ship "+this.getRegistration()+"has "+this.containers().size()+"\n");
		
	}

}
