package solution;

import shipping.IContainer;

public class Container implements IContainer {

	String Container_id;
	String Container_desc;
	String dest_city;

	public Container(String Container_id, String Container_desc, String dest_city){
		this.Container_id = Container_id;
		this.Container_desc = Container_desc;
		this.dest_city = dest_city;
	}
	@Override
	public String id() {
		// TODO Auto-generated method stub
		return this.Container_id;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
	return this.Container_desc;
	}

	@Override
	public String destinationCity() {
		// TODO Auto-generated method stub
return this.dest_city;
	}

}
