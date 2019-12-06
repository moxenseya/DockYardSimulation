package solution;

import shipping.IContainer;
import shipping.IDockyard;
import shipping.IShip;
import shipping.ShippingProcessorBase;

import java.util.List;

public class ShippingProcessor extends ShippingProcessorBase {

	public ShippingProcessor(IDockyard dockyard) {
		super(dockyard);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void processShippingEvent(String input) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void processTruck(String registration, String destination) {
		// TODO Auto-generated method stub
	}

	@Override
	protected IShip processShip(String registration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<IContainer> readManifest(String shipId) {
		// TODO Auto-generated method stub
		return null;
	}

}
